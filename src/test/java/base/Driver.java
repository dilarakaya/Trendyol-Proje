package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver  {

    public void getDriver(){
        if (BaseTest.driver == null) {
            switch (BaseTest.BrowserName){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-notifications");
                    ChromeDriver chromeDriver=new ChromeDriver(options);
                    chromeDriver.manage().window().maximize();
                    chromeDriver.get("https://www.trendyol.com/butik/liste/1/kadin");
                    BaseTest.driver=chromeDriver;
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions Options = new FirefoxOptions();
                    Options.addArguments("--disable-notifications");
                    FirefoxDriver firefoxDriver=new FirefoxDriver(Options);
                    firefoxDriver.manage().window().maximize();
                    firefoxDriver.get("https://www.trendyol.com/butik/liste/1/kadin");
                    BaseTest.driver=firefoxDriver;
                    break;

            }

        }

    }
}
