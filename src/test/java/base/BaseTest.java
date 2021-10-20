package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest extends Driver
{
    public static WebDriver driver;
    public static String BrowserName="chrome";


    @Before
    public void beforeTest(){
        getDriver();

    }

    @After
    public void afterTest(){
    //driver.quit();
    }
}
