import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadLocalRandom;

public class Company extends MainMethods {
    @Test(priority = 1)
    public void NavigateToNav() {
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("//span[normalize-space()=\"Company\"]"));
        click(By.xpath("//span[normalize-space()=\"Add Company\"]"));
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
    }
    String randomint = String.valueOf(ThreadLocalRandom.current().nextInt(1,4));
    String randomint1 = String.valueOf(ThreadLocalRandom.current().nextInt(1,4));
    String randomint3 = String.valueOf(ThreadLocalRandom.current().nextInt(1,2));
    String randomint4 = String.valueOf(ThreadLocalRandom.current().nextInt(1,999999));
    String randomCom  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
    String randomSub  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 3));

    @Test(priority = 2)
    public void AddCompany(){
        doubleClick(By.xpath("//input[@placeholder='Please Select Company Type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomint+"]"));
        doubleClick(By.xpath("//input[@placeholder='Choose category']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomint1+"]"));
        doubleClick(By.xpath("//input[@placeholder='Choose a company activity']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomint3+"]"));
        clickandsend(By.name("company_name"),"COMPANY RANOM - "+randomint4);
    }
    @Test(priority = 3)
    public void location(){
        doubleClick(By.xpath("//input[@placeholder='Select Country']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select State']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select City']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomCom+"]"));
        doubleClick(By.xpath("//input[@placeholder='Select Sub Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomSub+"]"));
    }

}