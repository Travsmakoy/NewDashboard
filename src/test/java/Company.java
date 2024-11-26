import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Company extends MainMethods {
    String randomint = String.valueOf(ThreadLocalRandom.current().nextInt(1,4));
    String randomint1 = String.valueOf(ThreadLocalRandom.current().nextInt(1,4));
    String randomint3 = String.valueOf(ThreadLocalRandom.current().nextInt(1,2));
    String randomint4 = String.valueOf(ThreadLocalRandom.current().nextInt(1,999999));
    String randomCom  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
    String randomSub  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 3));
    String VAT  = String.valueOf(ThreadLocalRandom.current().nextInt(999999, 99999999));
    @Test(priority = 1)
    public void NavigateToNav() {
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("//span[normalize-space()=\"Company\"]"));
        click(By.xpath("//span[normalize-space()=\"Add Company\"]"));
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
    }
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
    @Test(priority = 4)
    public void AddDetails() throws InterruptedException {
        scrollPage(500);
        clickandsend(By.name("commercial_license_no"),"CommercialLicense"+randomint4);

        String folderPath = "D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\IMAGES";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in the folder!");
            return;
        }

        Random random = new Random();
        File randomFile = files[random.nextInt(files.length)];
        String filePath = randomFile.getAbsolutePath();

        WebElement fileInput = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        fileInput.sendKeys(filePath);

        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[3]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[1]"));
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[4]/div/div/div/div[2]/button"),By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/button[4]"));
        Thread.sleep(500);
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[5]/div/div/div/div[2]/button"),By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[7]"));
        scrollPage(500);
        clickandsend(By.name("vat_no"),VAT);

    }
}