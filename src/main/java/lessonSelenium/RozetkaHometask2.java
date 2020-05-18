package lessonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RozetkaHometask2 {
    WebDriver driver;
    WebDriverWait wait;
    By lichniyCabinet = By.cssSelector("[class='header-user-link sprite-side whitelink xhr']");
    By registerButton = By.cssSelector("[class='novisited auth-f-signup-link']");
    By registerFinalButton = By.cssSelector("[class='btn-link btn-link-green btn-link-sign']");
    By inputFields = By.cssSelector("[class='input-text auth-input-text input-invalid']");
    By nameFiled = By.cssSelector("[name='title']");
    By mailOrPhoneFiled = By.cssSelector("[name='login']");
    By passwordField = By.cssSelector("[name='password']");


    @BeforeMethod
    public void BeforeMethod (){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,5);
    }

    @Test //Перевірка що всі поля є червоні якщо натиснути "Реєстрація" не заповнивши їх
    public void testRedFields (){
        driver.get("https://my.rozetka.com.ua/");
        wait(10);

        //click on Увійти в особистий кабінет
        WebElement lichniyCabinetLink = driver.findElement(lichniyCabinet);
        wait.until(ExpectedConditions.elementToBeClickable(lichniyCabinetLink));
        lichniyCabinetLink.click();

        //click on Реєстрація
        WebElement registartionButtonLink = driver.findElement(registerButton);
        wait.until(ExpectedConditions.elementToBeClickable(registartionButtonLink));
        registartionButtonLink.click();

        //click on Зареєструватися
        WebElement registartionFinalButtonLink = driver.findElement(registerFinalButton);
        wait.until(ExpectedConditions.elementToBeClickable(registartionFinalButtonLink));
        registartionFinalButtonLink.click();

        //start checking if all input fields are red using wait
        WebElement inputFiledsElements = driver.findElement(inputFields);
        wait.until(ExpectedConditions.attributeToBe(inputFiledsElements,
                "border-color","rgb(255, 120, 120)"));
    }

    @Test //Перевірка що не заповнені поля є червоні, а заповнені сірі якщо наиснути "Реєстрація" не заповнивши їх
    public void testRedFieldsLogic () {
        driver.get("https://my.rozetka.com.ua/");
        wait(10);

        //click on Увійти в особистий кабінет
        WebElement lichniyCabinetLink = driver.findElement(lichniyCabinet);
        wait.until(ExpectedConditions.elementToBeClickable(lichniyCabinetLink));
        lichniyCabinetLink.click();

        //click on Реєстрація
        WebElement registartionButtonLink = driver.findElement(registerButton);
        wait.until(ExpectedConditions.elementToBeClickable(registartionButtonLink));
        registartionButtonLink.click();

        //Ввести дані в одне поле
        WebElement nameFieldEl = driver.findElement(nameFiled);
        nameFieldEl.sendKeys("Rossyl");

        //click on Зареєструватися
        WebElement registartionFinalButtonLink = driver.findElement(registerFinalButton);
        wait.until(ExpectedConditions.elementToBeClickable(registartionFinalButtonLink));
        registartionFinalButtonLink.click();

        //Провіряєм що поля Логін і Пароль червоні
        WebElement mailOrPhoneEl = driver.findElement(mailOrPhoneFiled);
        WebElement passwordEl = driver.findElement(passwordField);
        wait.until(ExpectedConditions.attributeToBe(mailOrPhoneEl,
                "border-color","rgb(255, 120, 120)"));
        wait.until(ExpectedConditions.attributeToBe(passwordEl,
                "border-color","rgb(255, 120, 120)"));

        //Провіряєм що поле Імені лишилось білим
        wait.until(ExpectedConditions.attributeToBe(nameFieldEl,
                "border-color","rgb(210, 210, 210)"));
    }

    @AfterMethod
    public void quitChrome(){
        driver.quit();
    }

    private void wait (int timeSetting){
        driver.manage().timeouts().implicitlyWait(timeSetting, TimeUnit.SECONDS);
    }
}
