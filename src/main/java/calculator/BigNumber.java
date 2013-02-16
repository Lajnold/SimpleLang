package calculator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNumber extends java.lang.Number  {

    public BigNumber(BigDecimal val) {
        repr = val.stripTrailingZeros();
    }
    
    public BigNumber(BigInteger val) {
        repr = new BigDecimal(val);
    }
    
    public BigNumber(double val) {
        repr = new BigDecimal(val);
    }
    
    public BigNumber(String val) {
        BigDecimal calculatedRepr = null;
        
        // Octal integer.
        if (val.startsWith("0") && !val.contains(".")) {
            calculatedRepr = parseOctalInteger(val);
        }
        
        // Hexadecimal floating point.
        if (calculatedRepr == null && val.startsWith("0x")) {
            calculatedRepr = parseHexadecimal(val);
        }
        
        // Other formats.
        if (calculatedRepr == null) {
            try {
                calculatedRepr = new BigDecimal(val);
            } catch (NumberFormatException e) {
                throw new NumberFormatException(val);
            }
        }
        
        repr = calculatedRepr.stripTrailingZeros();
    }

    private BigDecimal parseOctalInteger(String input) {
        try {
            return new BigDecimal(new BigInteger(input, 8));
        } catch (NumberFormatException e) {
            // Do nothing.
        }
        return null;
    }
    
    private BigDecimal parseHexadecimal(String input) {
        if (input.contains(".")) {
            return parseHexadecimalFloatingPoint(input);
        } else {
            return parseHexadecimalInteger(input);
        }
    }
    
    private BigDecimal parseHexadecimalFloatingPoint(String input) {
        // The format is 0x<before>.<coeff>p<exp>.
        // Example:
        //   0x2.52p3
        //     = (2 + (5/16^1) + (2/16^2)) * 2^3
        //     = (2 + 0.3125 + 0.0078125) * 8
        //     = 18.8625
        
        BigDecimal before;
        BigDecimal coeff;
        int exp;

        // The input should contain at least "0x" before the point.
        int pointIndex = input.indexOf(".");
        if (pointIndex < 3) {
            throw new NumberFormatException(input);
        }

        // The input should contain at least "0x<coeff>." before the exponent.
        int expIndex = input.indexOf("p", pointIndex + 1);
        if (expIndex < pointIndex + 1) {
            throw new NumberFormatException(input);
        }
        
        // Start after "0x", and don't include the ".".
        String beforeString = input.substring(2, pointIndex);
        
        // Start after "0x<coeff>.", and don't include the "p".
        String coeffString = input.substring(pointIndex + 1, expIndex);
        
        // Everything after "p".
        String expString = input.substring(expIndex + 1);
        
        try {
            before = new BigDecimal(beforeString);
            coeff = calculateFloatingPointHexCoeff(coeffString);
            exp = Integer.parseInt(expString);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(input);
        }
        
        BigDecimal res = before.add(coeff);
        if (exp >= 0) {
            res = res.multiply(new BigDecimal(2).pow(exp));
        } else {
            BigDecimal op = new BigDecimal(1).divide(
                    new BigDecimal(2).pow(-exp),
                    MIN_DIVISION_DECIMALS, RoundingMode.HALF_UP);
            res = res.multiply(op);
        }
        
        return res;
    }
    
    private BigDecimal calculateFloatingPointHexCoeff(String coeffString) {
        BigDecimal coeff;
        coeff = new BigDecimal(0);
        for (int i = 0; i < coeffString.length(); i++) {
            BigDecimal digit = new BigDecimal(
                  Character.toString(coeffString.charAt(i)));
            BigDecimal mult1 = new BigDecimal(1).divide(
                    new BigDecimal(16).pow(i + 1),
                    MIN_DIVISION_DECIMALS, RoundingMode.HALF_UP);
            BigDecimal addOp = digit.multiply(mult1);
            coeff = coeff.add(addOp);
        }
        
        return coeff;
    }
    
    private BigDecimal parseHexadecimalInteger(String input) {
        try {
            // Cut off "0x", and then parse in base 16.
            String numStr = input.substring(2);
            return new BigDecimal(new BigInteger(numStr, 16));
        } catch (NumberFormatException e) {
            // Do nothing.
        }

        return null;
    }

    public BigNumber add(BigNumber rhs) {
        return new BigNumber(repr.add(rhs.repr));
    }
    
    public BigNumber subtract(BigNumber rhs) {
        return new BigNumber(repr.subtract(rhs.repr));
    }
    
    public BigNumber multiply(BigNumber rhs) {
        return new BigNumber(repr.multiply(rhs.repr));
    }
    
    public BigNumber divide(BigNumber rhs) {
        int scale = Math.max(repr.scale(), rhs.repr.scale());
        scale = Math.max(scale, MIN_DIVISION_DECIMALS);
        return new BigNumber(repr.divide(rhs.repr, scale, RoundingMode.HALF_UP));
    }
    
    public BigNumber truncate(int decimals) {
        return new BigNumber(repr.setScale(decimals, RoundingMode.HALF_UP));
    }
    
    @Override
    public boolean equals(Object rhs) {
        if (rhs == null)
            return false;
        if (rhs == this)
            return true;
        if (!(rhs instanceof BigNumber))
            return false;
        
        return compareTo((BigNumber) rhs) == 0;
    }
    
    public int compareTo(BigNumber rhs) {
        return repr.compareTo(rhs.repr);
    }
    
    @Override
    public int hashCode() {
        return repr.hashCode();
    }
    
    @Override
    public String toString() {
        return repr.toString();
    }
    
    @Override
    public double doubleValue() {
        return repr.doubleValue();
    }
    @Override
    public float floatValue() {
        return repr.floatValue();
    }
    @Override
    public int intValue() {
        return repr.intValue();
    }
    @Override
    public long longValue() {
        return repr.longValue();
    }

    private final BigDecimal repr;
    
    private static int MIN_DIVISION_DECIMALS = 10;
    
    private static final long serialVersionUID = 1L;
}
