package lessonTestng;

import lesson1.Task2;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestTask2 {

    //Test for [Task 2]: Testing name occurrences and lines count with Parameters

    //Test 1 - Testing input name occurrences - should always be 5*10='50'
    @Parameters({"name"})
    @Test
    public void testNamesOccurrences(@Optional("testOptional") String name) {
        int expectedResult = 50;
        int actualResult = sameTextOccurances(Task2.printMyNamex10(name),name);
        System.out.println("Expected \""+name+"\" occurances "+expectedResult);
        System.out.println("Actual \""+name+"\" occurances "+actualResult);
        Assert.assertEquals(expectedResult,actualResult);
    }

    //Test 2 - Testing Lines amount - should always be '5'
    @Parameters({"name"})
    @Test
    public void testLinesAmount(@Optional("testOptional") String name) {
        int expectedResult = 5;
        String lineBreak = "\n";
        int actualResult = countLines(Task2.printMyNamex10(name));
        System.out.println("Expected lines count - "+expectedResult);
        System.out.println("Actual lines count - "+actualResult);
        Assert.assertEquals(actualResult,expectedResult);
    }

    //BELOW ARE SOME CUSTOM METHODS THAT I USED FOR TESTS

    //Method that detects same text occurrences in the text string
    private int sameTextOccurances(String testString, String testSubstring) {
        int times = 0;
        for (int i = 0; i < testString.length(); i++) {
            if (testString.substring(i).startsWith(testSubstring)) {
                times++;
            }
        }
        return times;
    }

    //Method that detects lines count int the text string
    private static int countLines(String s) {
        return (s + " ").split("\r?\n").length-1;
    }
}