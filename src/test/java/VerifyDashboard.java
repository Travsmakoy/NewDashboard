import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyDashboard extends MainMethods{
    @Test
    public void VerifyAqarySite(){
        getUrl("http://192.168.1.193:3000/");
        driver.findElement(By.xpath("//button[text()='Go to Dashboard']")).click();
    }
}
