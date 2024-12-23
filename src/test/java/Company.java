import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Company extends MainMethods {
    String randomint = String.valueOf(ThreadLocalRandom.current().nextInt(2,5));
    String randomint1 = String.valueOf(ThreadLocalRandom.current().nextInt(1,4));
    String randomint3 = String.valueOf(ThreadLocalRandom.current().nextInt(1,2));
    String randomint4 = String.valueOf(ThreadLocalRandom.current().nextInt(1,999999));
    String randomCom  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
    String randomSub  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 3));
    String VAT  = String.valueOf(ThreadLocalRandom.current().nextInt(999999, 99999999));
    String IBAN  = String.valueOf(ThreadLocalRandom.current().nextInt(1,999 ));
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
        clickandsend(By.name("company_name"),"COMPANY AUTOMATION - "+randomint4);
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
        clickandsend(By.name("commercial_license_no"),"CommercialLicense"+randomint4);

        String folderPath = "D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\IMAGES";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();


        Random random = new Random();
        File randomFile = files[random.nextInt(files.length)];
        String filePath = randomFile.getAbsolutePath();

        WebElement fileInput = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        fileInput.sendKeys(filePath);

        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[3]/div/div/div/div[2]/button"));
        click(By.xpath("//button[normalize-space()=\"1\"]"));
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[4]/div/div/div/div[2]/button"),By.xpath("//button[normalize-space()=\"5\"]"));
        Thread.sleep(500);
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[5]/div/div/div/div[2]/button"),By.xpath("//button[normalize-space()=\"29\"]"));
        scrollPage(500);
        clickandsend(By.name("vat_no"),VAT);
        doubleClick(By.xpath("//input[@placeholder='Please Select VAT Status']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));

        Thread.sleep(250);
        String folderPath1 = "D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\IMAGES";
        File folder1 = new File(folderPath1);
        File[] files1 = folder1.listFiles();

        Random random1 = new Random();
        File randomFile1 = files1[random1.nextInt(files1.length)];
        String filePath1 = randomFile1.getAbsolutePath();

        WebElement fileInput1 = driver.findElement(By.name("vat_file_url"));
        fileInput1.sendKeys(filePath1);

        scrollPage(500);
        clickandsend(By.name("website_url"),"https://facebook.com/test"+randomint);
        clickandsend(By.name("company_email"),"mark_automationtest"+VAT+"@gmail.com");
        clickandsend(By.name("company_contact_number"),"543835792");
        clickandsend(By.name("company_whatsapp_number"),"543835792");

        Thread.sleep(250);
        String folderPath2 = "D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\IMAGES FOR AUTO\\COMPANY LOGO";
        File folder2 = new File(folderPath2);
        File[] files2 = folder2.listFiles();

        Random random2 = new Random();
        File randomFile2 = files2[random2.nextInt(files2.length)];
        String filePath2 = randomFile2.getAbsolutePath();

        WebElement fileInput2 = driver.findElement(By.name("logo_url"));
        fileInput2.sendKeys(filePath2);

        scrollPage(500);
        Thread.sleep(250);
        String folderPath3 = "D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\IMAGES";
        File folder3 = new File(folderPath3);
        File[] files3 = folder3.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in the folder!");
            return;
        }

        Random random3 = new Random();
        File randomFile3 = files3[random3.nextInt(files3.length)];
        String filePath3 = randomFile3.getAbsolutePath();

        WebElement fileInput3 = driver.findElement(By.name("cover_image_url"));
        fileInput3.sendKeys(filePath3);

        String realEstateDescription = "This beautifully designed 2-bedroom apartment offers modern living with stunning views of the city skyline. Located in the heart of the vibrant downtown area, this apartment features spacious living areas, high-end finishes, and large windows that fill the space with natural light. The fully equipped kitchen boasts state-of-the-art appliances, while the master bedroom comes with an ensuite bathroom. Residents enjoy access to premium amenities, including a rooftop pool, fully equipped fitness center, and 24/7 security. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience";

        WebElement descriptionField = driver.findElement(By.name("company_description"));descriptionField.sendKeys(realEstateDescription);

        scrollPage(500);
        clickandsend(By.name("facebook_profile_url"),"https://facebook.com/test");
        clickandsend(By.name("instagram_profile_url"),"https://instagram.com/test");
        clickandsend(By.name("linkedin_profile_url"),"https://linkedin.com/test");
        clickandsend(By.name("twitter_profile_url"),"https://twitter.com/test");
        clickandsend(By.name("youtube_profile_url"),"https://youtube.com/test");

        scrollPage(500);
        clickandsend(By.name("username"),"USERNAMETEST"+VAT);
        clickandsend(By.name("first_name"),"Marko");
        clickandsend(By.name("last_name"),"Polo");
        clickandsend(By.name("user_phone_number"),"543835792");
        Thread.sleep(200);
        clickandsend(By.name("user_email"),"user_admin"+VAT+"@gmail.com");
        String folderPath4 = "D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\IMAGES";
        File folder4 = new File(folderPath);
        File[] files4 = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in the folder!");
            return;
        }

        Random random4 = new Random();
        File randomFile4 = files[random.nextInt(files.length)];
        String filePath4 = randomFile.getAbsolutePath();

        WebElement fileInput4 = driver.findElement(By.name("user_profile_picture"));
        fileInput4.sendKeys(filePath);

        scrollPage(800);
        clickandsend(By.name("account_number"),"ACCOUNTNUMBER"+randomint);
        clickandsend(By.name("account_name"),"Aiswarya Name"+randomint);
        clickandsend(By.name("iban"),"AE07 0331 2345 6789 0123 456");
        doubleClick(By.xpath("//input[@placeholder='Please a Country']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Please a Currency']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("bank_name"),"BANKNAME"+VAT);
        clickandsend(By.name("bank_branch"),"BANKBRANCH"+VAT);
        clickandsend(By.name("swift_code"),"123213"+VAT);
        click(By.xpath("/html/body/div[2]/main/form/div[10]/button[1]"));
        Thread.sleep(5000);
    }
}