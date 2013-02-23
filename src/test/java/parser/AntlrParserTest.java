package parser;

import org.junit.Before;

import calculator.parser.AntlrParser;

/**
 * Tests the ANTLR-based parser.
 */
public class AntlrParserTest extends ParserTestBase {
    
    @Before
    public void setup() {
        AntlrParser antlrParser = new AntlrParser();
//        antlrParser.printTreeOnParse(true);
        parserToTest = antlrParser;
    }
}
