package steps;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class Method extends BaseTest {
    public void click(WebElement element){
        element.click();

    }
    public void waitClick(WebElement element, long timeInSecond){
        WebDriverWait wait = new WebDriverWait(BaseTest.driver,timeInSecond);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void action(WebElement element){
        Actions action=new Actions(BaseTest.driver);
        action.moveToElement(element).perform();
}

    public void waitVisit(WebElement element, long timeInSecond){
        WebDriverWait wait = new WebDriverWait(BaseTest.driver,timeInSecond);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
