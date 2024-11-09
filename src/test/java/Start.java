import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Start extends MainMethods{
    @Test
    public void VerifyAqarySite(){
        getUrl("http://192.168.1.138:8080");
        URLvalidator("http://192.168.1.138:8080/");
        click(By.xpath("/html/body/div/a/button"));
        URLvalidator("http://192.168.1.138:8080/login?next=http%3A%2F%2Flocalhost%3A8080%2Fdashboard");
    }
}
