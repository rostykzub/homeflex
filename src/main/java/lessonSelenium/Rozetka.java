package lessonSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rozetka {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        Thread.sleep(1000);
        String name = driver.findElement(By.cssSelector("[class='link-dashed']")).getText();
        //System.out.println(name);
        String goodname = name.replaceAll("[-+)( ]","");
        System.out.println(goodname);
        driver.quit();

    }
}
