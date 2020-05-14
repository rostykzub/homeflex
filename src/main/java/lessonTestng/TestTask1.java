package lessonTestng;

import lesson1.Task1;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestTask1 {

    //Test for [Task 1]: Testing min value function with Data Provider

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
}