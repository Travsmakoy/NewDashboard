import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Login extends MainMethods {
    @Test(priority = 1)
    public void Login() {
        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));
    }
//    @Test(priority = 2)
//    public void EnterInvalidUser() throws InterruptedException {
//        clickandsend(By.xpath("//input[@id=\":r0:\"]"),"mark@admins.com");
//        clickandsend(By.xpath("//input[@id=\":r1:\"]"),"password");
//        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));
//    }
//    @Test (priority = 3)
//    public void ClearField() throws InterruptedException {
//        clearfield(By.xpath("(//input[@id=':r0:'])[1]"));
//        clearfield(By.xpath("(//input[@id=':r1:'])[1]"));
//    }
    @Test(priority = 4)
    public void EnterValidUser() throws InterruptedException {
        clickandsend(By.xpath("//input[@id=\":r0:\"]"),"admin");
        clickandsend(By.xpath("//input[@id=\":r1:\"]"),"newadmin");
//        clickandsend(By.xpath("//input[@id=\":r0:\"]"),"aqary@aqaryinvestment.com");
//        clickandsend(By.xpath("//input[@id=\":r1:\"]"),"123456");
        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));

//        LIST WINDOW HANDLES
//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));

    }
}
