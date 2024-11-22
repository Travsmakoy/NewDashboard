import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadLocalRandom;

public class AddProjectReady extends MainMethods{

    @Test(priority = 1)
    public void NavigateToNav() throws InterruptedException {
        Thread.sleep(1000);
//        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("//span[normalize-space()=\"Projects\"]"));
        click(By.xpath("//span[normalize-space()=\"Add Project\"]"));
    }
    //    @Test(priority = 2)
//    public void CheckRequiredFields(){
//    scrollPage(6000);
//    click(By.xpath("/html/body/div[2]/main/form/div[7]/button[1]"));
//    InlineErrorValidator(By.xpath("//div[contains(text(),\"Missing fields\")]"),"Missing Fields");
//    scrollPage(-500);
//    }
    int projectNameDigits = ThreadLocalRandom.current().nextInt(1, 999);
    int licenseNoDigits = ThreadLocalRandom.current().nextInt(1, 999);
    int projectNoDigits = ThreadLocalRandom.current().nextInt(1, 999);
    String StartingPrice = String.valueOf(ThreadLocalRandom.current().nextInt(10000, 999999));
    String BuiltArea = String.valueOf(ThreadLocalRandom.current().nextInt(9999, 10000));
    String plotArea = String.valueOf(ThreadLocalRandom.current().nextInt(10000, 10100));
    String noProperties = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
    String completionPercentage = String.valueOf(ThreadLocalRandom.current().nextInt(1, 100));
    String ServiceCharge = String.valueOf(ThreadLocalRandom.current().nextInt(1, 1000));
    @Test(priority = 2)
    public void AddProjectDetails() throws InterruptedException {
        clickandsend(By.name("project_name"),"PROJECTREADY" +projectNameDigits);
        clickandsend(By.name("license_no"),"LICENSENO"+licenseNoDigits);
        clickandsend(By.name("project_no"),"PROJECTNO"+projectNoDigits);
        clickandsend(By.name("starting_price"),StartingPrice);
        doubleClick(By.xpath("//input[@placeholder='Developer company']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Country']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select State']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select City']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Sub Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        scrollPage(800);
        doubleClick(By.xpath("//input[@placeholder='Select Completion Status']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=2]"));
//        clickandsend(By.name("completion_percentage"),completionPercentage);
//        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[3]/div/div/div/div[2]/button"));
//        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[2]"));
        doubleClick(By.xpath("//input[@placeholder='Select Life Style']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("plot_area"),plotArea);
        clickandsend(By.name("built_up_area"),BuiltArea);
        doubleClick(By.xpath("//input[@placeholder='Select Furnished']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("no_of_properties"),noProperties);
        doubleClick(By.xpath("//input[@placeholder='Select Ownership']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[8]/div/div/div/div[2]/button"),By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[3]/button[1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[10]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[7]"));
        Thread.sleep(300);
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[9]/div/div/div/div[2]/button"),By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[6]"));
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[11]/div/div/div/div[1]/div/div"),By.xpath("//li[normalize-space()=\"AED\"]"));
        clickandsend(By.name("service_charge"),ServiceCharge);
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[11]/div/div/div/div[2]/div/div"),By.xpath("//li[normalize-space()=\"sqft\"]"));
    }
    @Test(priority = 3)
    public void PoolyGoon() throws InterruptedException {
        // Locate the map container and wait for visibility
        WebElement mapContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("map")));

        // Ensure the map is in view and ready to interact with
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mapContainer);

        // Click on the polygon tool button (if it's visible and clickable)
        WebElement polygonButton = driver.findElement(By.xpath("//html[1]/body[1]/div[2]/main[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[6]/div[2]/div[1]/div[3]/div[4]/button[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", polygonButton);

        Allure.step("Clicked on the polygon icon");

        Thread.sleep(500);

        Actions actions = new Actions(driver);

        int mapWidth = mapContainer.getSize().getWidth();
        int mapHeight = mapContainer.getSize().getHeight();
        int centerX = mapWidth / 2;
        int centerY = mapHeight / 2;

// Define the box dimensions (in pixels)
        int boxWidth = 100;  // Adjust as needed
        int boxHeight = 100; // Adjust for a perfect square, or modify for rectangle

// Calculate starting point (top-left corner of the box)
        int startX = centerX - (boxWidth / 2);  // Center the box horizontally
        int startY = centerY - (boxHeight / 2); // Center the box vertically

// Move to starting point and begin drawing
        actions.moveByOffset(startX, startY).click().perform();
        Allure.step("Started at top-left corner");
        Thread.sleep(500);

// Draw top edge
        actions.moveByOffset(boxWidth, 0).click().perform();
        Allure.step("Drew top edge");
        Thread.sleep(500);

// Draw right edge
        actions.moveByOffset(0, boxHeight).click().perform();
        Allure.step("Drew right edge");
        Thread.sleep(500);

// Draw bottom edge
        actions.moveByOffset(-boxWidth, 0).click().perform();
        Allure.step("Drew bottom edge");
        Thread.sleep(500);

// Close the box by returning to start
        actions.moveByOffset(0, -boxHeight).click().perform();
        Allure.step("Closed the box");
        Thread.sleep(500);

// Final click to complete the selection
        actions.moveByOffset(1, 1).click().perform();
        Allure.step("Completed the box selection");
        Thread.sleep(500);
        actions.release().perform();
        scrollPage(250);
    }
    @Test(priority = 4)
    public void Description() throws InterruptedException {
        scrollPage(500);
        String realEstateDescription = "This beautifully designed 2-bedroom apartment offers modern living with stunning views of the city skyline. Located in the heart of the vibrant downtown area, this apartment features spacious living areas, high-end finishes, and large windows that fill the space with natural light. The fully equipped kitchen boasts state-of-the-art appliances, while the master bedroom comes with an ensuite bathroom. Residents enjoy access to premium amenities, including a rooftop pool, fully equipped fitness center, and 24/7 security. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience";

        WebElement descriptionField = driver.findElement(By.xpath("//textarea[@name='description']"));descriptionField.sendKeys(realEstateDescription);

    }
    @Test(priority = 5)
    public void AmenitiesFacilities() throws InterruptedException {
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[1]/ul/li[2]"));
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[2]/ul/li[3]"));
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[3]/ul/li[1]"));
        scrollPage(500);
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[4]/ul/li[1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[5]/ul/li"));
        scrollPage(500);
        click(By.xpath("/html/body/div[2]/main/form/div[6]/div/div[2]/div/div[4]/ul/li[1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[6]/div/div[2]/div/div[6]/ul/li[3]"));
        click(By.xpath("/html/body/div[2]/main/form/div[6]/div/div[2]/div/div[9]/ul/li[1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[6]/div/div[2]/div/div[13]/ul/li[5]"));
        click(By.xpath("/html/body/div[2]/main/form/div[7]/button[1]"));
    }
}