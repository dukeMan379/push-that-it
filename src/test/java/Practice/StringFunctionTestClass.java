package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class StringFunctionTestClass {
    StringFunction stringFunction = new StringFunction();

    @Test
    public void testChangeCaseAndCount() {
        stringFunction.changeCaseAndCount();

    }

    @Test
    public void testCountCharacterOccurrences() {
        stringFunction.countCharacterOccurrences();

    }

    @Test
    public void testSplitName() {
        String[] result = stringFunction.splitName();
        assertEquals(result.length, 3); // Expecting 3 words
        assertEquals(result[0], "Sir");
        assertEquals(result[1], "Duke");
        assertEquals(result[2], "Umeh");

    }

    @Test
    public void testSplitNameWithLimit() {
        String[] result = stringFunction.splitNameWithLimit(2);
        assertEquals(result.length, 2); // Expecting 2 parts
        assertEquals(result[0], "Sir");
        assertEquals(result[1], "Duke Umeh"); // Remaining part

    }

    @Test
    public void testExtractAndValidateNumbers_ValidString() {
        String input = "MD87ASH56RAF123";
        Integer expected = 8756123;  // Expected extracted number
        StringFunction NumberExtractor = new StringFunction();
        Integer actual = NumberExtractor.extractAndValidateNumbers(input);

        Assert.assertNotNull(actual, "Expected a non-null result");
        Assert.assertEquals(actual, expected, "The extracted number should match the expected value.");
    }
}