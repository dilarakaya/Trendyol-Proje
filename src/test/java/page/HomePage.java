package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    //public WebElement femalePopUp = BaseTest.driver.findElement(By.cssSelector(".homepage-popup-img [alt='Female']"));
    public WebElement loginIcon = BaseTest.driver.findElement(By.cssSelector("div.user-login-container"));
    public WebElement loginButton = BaseTest.driver.findElement(By.cssSelector(".login-button"));
}
