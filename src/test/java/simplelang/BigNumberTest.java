package simplelang;

import org.junit.*;

import simplelang.BigNumber;
import static org.junit.Assert.*;

public class BigNumberTest {
    
    @Test
    public void parsesInteger() {
        BigNumber num = new BigNumber("55");
        assertEquals(55, num.intValue());
        assertEquals(55, num.longValue());
        assertEquals("55", num.toString());
    }
    
    @Test
    public void parsesFloatingPoint() {
        BigNumber num = new BigNumber("100.55");
        assertEquals(100.55, num.doubleValue(), 0.001);
        assertEquals(100.55, num.floatValue(), 0.001);
        assertEquals("100.55", num.toString());
    }
    
    @Test
    public void parsesOctalInteger() {
        BigNumber num = new BigNumber("0110");
        assertEquals(72, num.intValue());
        assertEquals(72, num.longValue());
        assertEquals("72", num.toString());
    }
    
    @Test
    public void parsesHexadecimalInteger() {
        BigNumber num = new BigNumber("0x2ea");
        assertEquals(746, num.intValue());
        assertEquals(746, num.longValue());
        assertEquals("746", num.toString());
    }
    
    @Test
    public void parsesHexadecimalFloatingPointWithPositiveExponent() {
        BigNumber num = new BigNumber("0x1.5p3");
        assertEquals("10.5", num.toString());
        
        BigNumber num2 = new BigNumber("0x1.5p+3");
        assertEquals("10.5", num2.toString());
    }
    
    @Test
    public void parsesHexadecimalFloatingPointWithNegativeExponent() {
        BigNumber num = new BigNumber("0x1.5p-2");
        assertEquals("0.328125", num.toString());
    }
}
