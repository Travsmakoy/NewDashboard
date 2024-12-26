import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PropertyHub extends MainMethods {
    String randomint = String.valueOf(ThreadLocalRandom.current().nextInt(1,5));
    String randomProperty = String.valueOf(ThreadLocalRandom.current().nextInt(5,9));
    String randomint1 = String.valueOf(ThreadLocalRandom.current().nextInt(1,2));
    String randomint3 = String.valueOf(ThreadLocalRandom.current().nextInt(1,999999));
    String randomint4 = String.valueOf(ThreadLocalRandom.current().nextInt(1,9999));
    String randomint5 = String.valueOf(ThreadLocalRandom.current().nextInt(1000,9999));
    String randomCom  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
    String randomSub  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 3));
    String VAT  = String.valueOf(ThreadLocalRandom.current().nextInt(999999, 99999999));
    String IBAN  = String.valueOf(ThreadLocalRandom.current().nextInt(1,999 ));
    String SECTOR  = String.valueOf(ThreadLocalRandom.current().nextInt(1,999 ));
    String price  = String.valueOf(ThreadLocalRandom.current().nextInt(1,999999 ));
    @Test(priority = 1)

    public void NavigateToNav() {
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("//span[normalize-space()=\"Property Hub\"]"));
        click(By.xpath("//span[normalize-space()=\"Add Property\"]"));
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
    }
    @Test(priority = 2)
    public void AddProperty(){
        clickandsend(By.name("property_name"),"MARK FULL PROPERTY "+randomint3);
        doubleClick(By.xpath("//input[@placeholder='Choose category']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomint1+"]"));

    }
    @Test(priority = 3)
    public void location(){
        doubleClick(By.xpath("//input[@placeholder='Select Country']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select State']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select City']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomCom+"]"));
        doubleClick(By.xpath("//input[@placeholder='Select Sub Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomSub+"]"));

        WebElement mapElement = driver.findElement(By.cssSelector("div[style*='z-index: 3'][style*='position: absolute']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(mapElement, 50, 50).click().perform();
    }
    @Test(priority = 4)
    public void AddDetails() throws InterruptedException {
        scrollPage(500);
        doubleClick(
                By.xpath("//input[@placeholder='Select Property type']"),
                By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and (position()=5 or position()=6)]")
        );
        doubleClick(By.xpath("//input[@placeholder='Select Unit type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("plot_area"),randomint4);
        clickandsend(By.name("built_up_area"),randomint5);
        clickandsend(By.name("sector_no"),"SECTOR "+SECTOR);
        clickandsend(By.name("property_no"),IBAN);
        int loop1  = Integer.parseInt(String.valueOf(ThreadLocalRandom.current().nextInt(1, 10)));
        for (int i = 0; i < loop1; i++) {
            String typesss  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
            doubleClick(By.xpath("//input[@placeholder='Select Views']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=" + typesss + "]"));
        }
        doubleClick(By.xpath("//input[@placeholder='Select Ownership']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomint+"]"));
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[9]/div/div/div/div[1]/div/div"),By.xpath("//li[@data-value='1']"));
        clickandsend(By.name("service_charge"),IBAN);
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[9]/div/div/div/div[2]/div/div"),By.xpath("//li[normalize-space()=\"sqft\"]"));
        clickandsend(By.name("price"),price);

    }

}