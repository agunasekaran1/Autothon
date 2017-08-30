package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by rr on 8/30/2017.
 */
public class PageObject {

    public WebDriver driver;
    public PageObject(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        this.driver  = driver;
    }
}
