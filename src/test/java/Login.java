import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends MainMethods {
    @Test(priority = 1)
    public void Login() {
        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));
//      errorValidator();
    }
    @Test(priority = 2)
    public void EnterInvalidUser() throws InterruptedException {
        clickandsend(By.xpath("//input[@id=\":r0:\"]"),"mark@admins.com");
        clickandsend(By.xpath("//input[@id=\":r1:\"]"),"password");
        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));
    }
    @Test (priority = 3)
    public void ClearField() throws InterruptedException {
        clearfield(By.xpath("(//input[@id=':r0:'])[1]"));
        clearfield(By.xpath("(//input[@id=':r1:'])[1]"));
    }
    @Test(priority = 4)
    public void EnterValidUser() throws InterruptedException {
        clickandsend(By.xpath("//input[@id=\":r0:\"]"),"admin");
        clickandsend(By.xpath("//input[@id=\":r1:\"]"),"newadmin");
        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));
    }
//    @Test(priority = 5)
//    public void BrowserBackToAqary() throws InterruptedException {
//    Thread.sleep(5000);
//    driver.navigate().back();
//    getUrl("http://192.168.1.193:3000/dashboard");
//    }
}
