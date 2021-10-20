package steps;

import org.openqa.selenium.WebElement;

public class Steps extends Method{
    public void waitAndClick(WebElement element,long timeInSecond){
        waitClick(element,timeInSecond);
        click(element);
    }
    public void hover(WebElement element,long timeInSecond) throws InterruptedException {
        waitVisit(element, timeInSecond);

        action(element);
    }

}
