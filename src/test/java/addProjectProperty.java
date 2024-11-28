import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadLocalRandom;

public class addProjectProperty extends MainMethods{
    String randoms  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 99999));
    String minArea  = String.valueOf(ThreadLocalRandom.current().nextInt(1000, 2000));
    String maxArea  = String.valueOf(ThreadLocalRandom.current().nextInt(2000, 4000));
    String PlotArea  = String.valueOf(ThreadLocalRandom.current().nextInt(4000, 6000));
    String BuiltArea  = String.valueOf(ThreadLocalRandom.current().nextInt(1000, 4000));
    String ServiceCharge = String.valueOf(ThreadLocalRandom.current().nextInt(1, 1000));

    @Test(priority = 1)
    public void navtoAdd() throws InterruptedException {
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[12]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[1]/a"));
        click(By.xpath("//a[@id=\"add-property\"]"));
    }

    @Test(priority = 2)
    public void AddProperty() throws InterruptedException {
    clickandsend(By.name("property_name"),"PROPERTY AUTO - "+randoms);
        WebElement mapElement = driver.findElement(By.cssSelector("div[style*='z-index: 3'][style*='position: absolute']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(mapElement, 50, 50).click().perform();
    scrollPage(500);
    doubleClick(By.xpath("//input[@placeholder='Select property Type']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()= 1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Unit Type']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()= 1]"));
        clickandsend(By.name("min_area"),minArea);
        clickandsend(By.name("max_area"),maxArea);
        clickandsend(By.name("plot_area"),PlotArea);
        clickandsend(By.name("built_up_area"),BuiltArea);
        int loop1  = Integer.parseInt(String.valueOf(ThreadLocalRandom.current().nextInt(1, 10)));
        for (int i = 0; i < loop1; i++) {
            String typesss  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
            doubleClick(By.xpath("//input[@placeholder='Select View']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=" + typesss + "]"));
        }
        String fur  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 4));
        doubleClick(By.xpath("//input[@placeholder='Furnished']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+fur+"]"));
        String ran  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
        clickandsend(By.name("no_of_units"),ran);
        String ran1  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
        clickandsend(By.name("no_of_floor"),ran);
        String park  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 11));
        clickandsend(By.name("parking"),park);
        String retail  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 11));
        clickandsend(By.name("no_of_retail"),retail);
        String pool  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 11));
        clickandsend(By.name("no_of_pool"),pool);
        String elev  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 11));
        clickandsend(By.name("elevator"),elev);
        doubleClick(By.xpath("//div[normalize-space()=\"currency\"]"),By.xpath("//li[normalize-space()=\"AED\"]"));
        clickandsend(By.name("service_charge"),ServiceCharge);
        doubleClick(By.xpath("//div[normalize-space()=\"measure\"]"),By.xpath("//li[normalize-space()=\"sqft\"]"));
        scrollPage(650);
        String realEstateDescription = "This beautifully designed 2-bedroom apartment offers modern living with stunning views of the city skyline. Located in the heart of the vibrant downtown area, this apartment features spacious living areas, high-end finishes, and large windows that fill the space with natural light. The fully equipped kitchen boasts state-of-the-art appliances, while the master bedroom comes with an ensuite bathroom. Residents enjoy access to premium amenities, including a rooftop pool, fully equipped fitness center, and 24/7 security. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience";
        WebElement descriptionField = driver.findElement(By.xpath("//textarea[@name='description']"));descriptionField.sendKeys(realEstateDescription);
        scrollPage(200);
        WebElement Notez = driver.findElement(By.name("notes"));Notez.sendKeys(realEstateDescription);
        scrollPage(1700);
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[1]/ul/li"));
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[3]/ul/li"));
        driver.findElement(By.xpath("/html/body/div[2]/main/form/div[6]/button[1]")).click();
        Thread.sleep(4000);
    }
}
