import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddPropertyOffplan extends MainMethods {
    @Test(priority = 1)
    public void LocateOffplanProject(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[12]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[1]/a"));
        click(By.xpath("//a[normalize-space()=\"Add Property\"]"));
    }
}
