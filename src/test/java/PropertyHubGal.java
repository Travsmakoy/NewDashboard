import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PropertyHubGal extends MainMethods {
    @Test(priority = 1)
    public void NavToProjectPropertyGallery(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[16]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[2]/a"));
    }
    @Test(priority = 2)
    public void AddProjectPropertyGallery() throws InterruptedException {
        for (int i = 0; i < 11; i++) {
            click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[1]/div[3]/div[1]/button[1]"));
            String randomint = String.valueOf(ThreadLocalRandom.current().nextInt(1, 6));
            doubleClick(By.xpath("//input[@placeholder='Select Gallery Type']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=" + randomint + "]"));

            doubleClick(By.xpath("//input[@placeholder='Select Media Type']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));

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

            click(By.xpath("/html/body/div[3]/div[3]/div/div/div[1]/form/div[4]/button[1]"));


            Thread.sleep(200);
        }
        click(By.xpath("/html/body/div[2]/main/div/div/div[1]/div/a"));
    }
}
