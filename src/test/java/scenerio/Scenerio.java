package scenerio;

import base.BaseTest;
import org.junit.Test;
import page.HomePage;
import steps.Steps;

public class Scenerio extends BaseTest {

    @Test
    public void test() throws InterruptedException {
        Steps steps=new Steps();
        HomePage homePage= new HomePage();


       // steps.waitAndClick(homePage.femalePopUp,5);
        steps.hover(homePage.loginIcon,5);
        steps.waitAndClick(homePage.loginButton, 5);


    }
}
