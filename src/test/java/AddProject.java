import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AddProject extends MainMethods{

    @Test(priority = 1)
    public void NavigateToNav(){
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
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
    @Test(priority = 2)
    public void AddProjectDetails() throws InterruptedException {
        clickandsend(By.name("project_name"),"FrontEndAutomation");
        clickandsend(By.name("license_no"),"License-12312312312");
        clickandsend(By.name("project_no"),"ProjectNo-12321321321");
        clickandsend(By.name("starting_price"),"12312312321321");
        doubleClick(By.xpath("//input[@placeholder='Developer company']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Country']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select State']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select City']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Sub Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        scrollPage(1000);
        doubleClick(By.xpath("//input[@placeholder='Select Completion Status']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("completion_percentage"),"50");
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[3]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[2]"));
        doubleClick(By.xpath("//input[@placeholder='Select Life Style']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("plot_area"),"8000");
        clickandsend(By.name("built_up_area"),"7500");
        doubleClick(By.xpath("//input[@placeholder='Select Furnished']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("no_of_properties"),"50");
        doubleClick(By.xpath("//input[@placeholder='Select Ownership']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[10]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[11]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[4]"));
        Thread.sleep(250);
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[12]/div/div/div/div[2]/button"));
        click(By.xpath("//button[normalize-space()=\"29\"]"));
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

        System.out.println("Clicked on the polygon icon");

        Thread.sleep(500);

        Actions actions = new Actions(driver);

        int mapWidth = mapContainer.getSize().getWidth();
        int mapHeight = mapContainer.getSize().getHeight();
        int centerX = mapWidth / 2; // Calculate center X of the map
        int centerY = mapHeight / 2; // Calculate center Y of the map

        // Define the starting point coordinates (start from the center of the map)
        int startX = centerX;  // Starting X offset at the center
        int startY = centerY;  // Starting Y offset at the center

        // Move to the start point and click to begin drawing the polygon
        actions.moveByOffset(startX, startY).click().perform();
        System.out.println("Clicked on the starting point");
        Thread.sleep(500);

        // Draw to the second point (adjust xOffset and yOffset for the second point)
        actions.moveByOffset(50, 30).click().perform();  // Second point (small distance)
        System.out.println("Clicked on the second point");
        Thread.sleep(500);

        // Draw to the third point (adjust xOffset and yOffset for the third point)
        actions.moveByOffset(40, -30).click().perform();  // Third point (small distance)
        System.out.println("Clicked on the third point");
        Thread.sleep(500);

        // Close the polygon by clicking back to the starting point
        actions.moveByOffset(-90, 10).click().perform();  // Closing the polygon (return to start)
        System.out.println("Clicked back on the starting point");
        Thread.sleep(500);

        // Final click to color/complete the polygon selection
        actions.moveByOffset(-1, -1).click().perform();  // Small offset to trigger completion (final click)
        System.out.println("Final click to color the polygon and complete the selection");
        Thread.sleep(500);

        actions.release().perform();

    }
}