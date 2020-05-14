package lessonTestng;

import lesson1.Task5;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTask5 {

    //Test for [Task 5]: Testing reverse string function with Data Provider

    @Test(dataProvider = "notReversedName")
    public void testTask5(String a,String expectedResult){
        String actualResult = Task5.reverse(a);
        Assert.assertEquals(expectedResult,actualResult);
    }

    @DataProvider(name="notReversedName")
    public Object[][] getDataForReverseTest() {
        return new Object[][]{
                {"Maria", "airaM"},
                {"Finn", "nniF"},
                {"Ross", "ssoR"},
                {"Andrew", "werdnA"},
                {"   ", "   "},
                {"123", "321"},
        };
    }
}