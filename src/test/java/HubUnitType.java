import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HubUnitType extends MainMethods{
    @Test(priority = 1)
    public void GotoUnitType(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[16]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[5]/a"));
    }
    @Test(priority = 2)
    public void AddDetails() throws InterruptedException {
        Thread.sleep(200);
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[1]/div[3]/a/button"));
        doubleClick(By.xpath("//input[@placeholder='Select unit type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        String[] unitTypes = {
                "Studio", "1 BR", "2 BR", "3 BR", "4 BR", "5 BR"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(unitTypes.length);
        String selectedUNIT = unitTypes[randomIndex];
        clickandsend(By.name("type_name"),selectedUNIT);
        String MIN  = String.valueOf(ThreadLocalRandom.current().nextInt(1,9999 ));
        String MAX  = String.valueOf(ThreadLocalRandom.current().nextInt(9999,99999 ));
        String MINprice  = String.valueOf(ThreadLocalRandom.current().nextInt(1,9999 ));
        String MAXprice  = String.valueOf(ThreadLocalRandom.current().nextInt(9999,99999 ));
        String bedroom  = String.valueOf(ThreadLocalRandom.current().nextInt(1,999 ));
        String park  = String.valueOf(ThreadLocalRandom.current().nextInt(1,50 ));

        clickandsend(By.name("min_area"),MIN);
        clickandsend(By.name("max_area"),MAX);
        clickandsend(By.name("min_price"),MINprice);
        clickandsend(By.name("max_price"),MAXprice);
//        WebDriverWait waitz = new WebDriverWait(driver, Duration.ofSeconds(5));
//        WebElement bedroomsElement = waitz.until(ExpectedConditions.elementToBeClickable(By.name("bedrooms")));
//        bedroomsElement.click();
//        bedroomsElement.sendKeys(bedroom);

        Thread.sleep(200);
        clickandsend(By.name("parkings"),park);

        String folderPath = "D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\IMAGES FOR AUTO\\UNIT TYPES";
        File folder = new File(folderPath);

        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("No files found in the folder!");
            return;
        }
        Random random1 = new Random();
        File randomFile = files[random1.nextInt(files.length)];
        String filePath = randomFile.getAbsolutePath();

        WebElement fileInput = driver.findElement(By.xpath("//input[@type=\"file\"]"));

        fileInput.sendKeys(filePath);
        click(By.xpath("/html/body/div[2]/main/form/div[2]/button[1]"));
        click(By.xpath("/html/body/div[2]/main/div/div/div[1]/div/a"));
    }
}
