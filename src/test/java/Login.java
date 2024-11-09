import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends MainMethods {
    @Test
    public void Login() {
        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));
    }
    @Test
    public void EnterInvalidUser(){
        clickandsend(By.xpath("//input[@id=\":r0:\"]"),"mark@admins.com");
        clickandsend(By.xpath("//input[@id=\":r1:\"]"),"password");
        click(By.xpath("//button[normalize-space()=\"Sign In\"]"));
    }
}
