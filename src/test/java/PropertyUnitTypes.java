import org.example.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PropertyUnitTypes extends MainMethods {
    @Test(priority = 0)
    public void NOTADDINGPROPERTY(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[11]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[1]/a"));
    }
    @Test(priority = 1)
    public void GotoUnitTypes(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[7]/div/button[6]"));
        click(By.xpath("//div[normalize-space()=\"Manage Unit Types\"]//a"));
    }
    @Test(priority = 2)
    public void addUnitTypes(){
        click(By.xpath("//button[normalize-space()=\"Add Unit Type\"]"));
        doubleClick(By.xpath("//input[@placeholder='Select unit type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        String[] unitTypes = {
                "Studio", "1BR", "2BR", "3BR", "4BR", "5BR+", "Penthouse", "Duplex", "Villa", "Townhouse", "Office", "Shop", "Warehouse", "Retail Space", "Plot", "Agricultural Land", "Industrial Land", "Residential Plot", "Commercial Plot", "Mixed-Use Development", "Serviced Apartment", "Hotel Apartment", "Factory", "Hospital", "School", "Sports Facility",
        };
        Random random = new Random();
        int randomIndex = random.nextInt(unitTypes.length);
        String SelectedUnit = unitTypes[randomIndex];
        clickandsend(By.name("type_name"),SelectedUnit );
        String MinArea = String.valueOf(ThreadLocalRandom.current().nextInt(1000,2000));
        String MaxArea = String.valueOf(ThreadLocalRandom.current().nextInt(2500,3500));
        String MinPrice = String.valueOf(ThreadLocalRandom.current().nextInt(10000,20000));
        String MaxPrice = String.valueOf(ThreadLocalRandom.current().nextInt(25000,35000));
        String bedrooms = String.valueOf(ThreadLocalRandom.current().nextInt(1,10));
        String parking = String.valueOf(ThreadLocalRandom.current().nextInt(1,10));
        clickandsend(By.name("min_area"),MinArea);
        clickandsend(By.name("max_area"),MinArea);
        clickandsend(By.name("min_price"),MinPrice);
        clickandsend(By.name("max_price"),MaxPrice);
        clickandsend(By.name("bedrooms"),bedrooms);
        clickandsend(By.name("parkings"),parking);

        String folderPath = "D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\IMAGES";
        File folder = new File(folderPath);
        File[] files = folder.listFiles();


        Random random1 = new Random();
        File randomFile = files[random1.nextInt(files.length)];
        String filePath = randomFile.getAbsolutePath();

        WebElement fileInput = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        fileInput.sendKeys(filePath);


    }
    @Test(priority = 3)
    public void Description() throws InterruptedException {
        scrollPage(500);
        String realEstateDescription = "This beautifully designed 2-bedroom apartment offers modern living with stunning views of the city skyline. Located in the heart of the vibrant downtown area, this apartment features spacious living areas, high-end finishes, and large windows that fill the space with natural light. The fully equipped kitchen boasts state-of-the-art appliances, while the master bedroom comes with an ensuite bathroom. Residents enjoy access to premium amenities, including a rooftop pool, fully equipped fitness center, and 24/7 security. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience";

        WebElement descriptionField = driver.findElement(By.xpath("//textarea[@name='description']"));descriptionField.sendKeys(realEstateDescription);

        click(By.xpath("//button[normalize-space()=\"submit\"]"));
    }
}
