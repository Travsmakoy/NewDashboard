import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadLocalRandom;

public class Company extends MainMethods {
    @Test(priority = 1)
    public void NavigateToNav() {
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("//span[normalize-space()=\"Company\"]"));
        click(By.xpath("//span[normalize-space()=\"Add Company\"]"));
    }
    String randomint = String.valueOf(ThreadLocalRandom.current().nextInt(1,4));
    @Test(priority = 2)
    public void AddCompany(){
        doubleClick(By.xpath("//input[@placeholder='Please Select Company Type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomint+"]"));
    }
}