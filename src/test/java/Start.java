import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Start extends MainMethods{
    @Test
    public void VerifyAqarySite(){
        getUrl("http://192.168.1.193:3000/");
        URLvalidator("http://192.168.1.193:3000/");
        click(By.xpath("//button[normalize-space()=\"Go to Dashboard\"]"));
        URLvalidator("http://192.168.1.193:3000/login?next=http%3A%2F%2Flocalhost%3A3000%2Fdashboard");
    }
}
