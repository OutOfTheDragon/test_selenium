package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by User on 2017/2/12.
 */
public class ExampleForChrome {
    public static void main(String[] args) {
        String ChromeDriver = "D:/git_workspace/selenium_test/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",ChromeDriver);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");

    }
}
