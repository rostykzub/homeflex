package lessonTestng;

import lesson1.Task1;
import lesson1.Task5;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestWithDataProvider {

// I have chosen [Lesson 1][Task 1] and [Task 5] to be tested using Data Provider.
    //Test for [Task 1]: Testing min value function

    @Test(dataProvider = "minData")
    public void testTask1(int a,int b,int c,int expectedResult){
        int actualResult = Task1.min(a,b,c);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @DataProvider(name="minData")
    public Object[][] getData(){
        return new Object[][]{
                {1,2,3,1},
                {-2,1,0,-2},
                {0,1,2,0},
                {100,500,-500,-500},
        };

    }

    //Test for [Task 5]: Testing reverse string function

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

