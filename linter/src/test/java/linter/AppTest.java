/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testNoErrors() {
        App classUnderTest = new App();
        String path = "src/main/resources/noErrors.js";
        String expectedResult = "No errors.";
        assertEquals(expectedResult ,classUnderTest.checkForSemicolon(path));
    }

    @Test public void fiveErrors() {
        App classUnderTest = new App();
        String path = "src/main/resources/fiveErrors.js";

        String expectedResult = "Linter Results: \n" +
                "Line 1: Missing semicolon.\n" +
                "Line 2: Missing semicolon.\n" +
                "Line 3: Missing semicolon.\n" +
                "Line 4: Missing semicolon.\n" +
                "Line 5: Missing semicolon.\n";
        assertEquals(expectedResult ,classUnderTest.checkForSemicolon(path));
    }

    @Test public void oneError(){
        App classUnderTest = new App();
        String path = "src/main/resources/oneError.js";

        String expectedResult = "Linter Results: \n" +
                "Line 3: Missing semicolon.\n";

        assertEquals(expectedResult, classUnderTest.checkForSemicolon(path));
    }

    @Test public void emptyFile(){
        App classUnderTest = new App();
        String path = "src/main/resources/emptyFile.js";

        String expectedResult = "No errors.";

        assertEquals(expectedResult, classUnderTest.checkForSemicolon(path));
    }
}
