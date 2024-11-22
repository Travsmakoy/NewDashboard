import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class AddProject extends MainMethods{
    String description = randomString(950);
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
        scrollPage(800);
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
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[13]/div/div/div/div[1]/div/div"),By.xpath("//li[normalize-space()=\"AED\"]"));
        clickandsend(By.name("service_charge"),"100");
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[13]/div/div/div/div[2]/div/div"),By.xpath("//li[normalize-space()=\"sqft\"]"));
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
        scrollPage(900);
    }
    @Test(priority = 4)
    public void Description() throws InterruptedException {
        setLargeTextValue(driver, By.id("description"), description);
        setLargeTextValue(driver, By.id("description_arabic"), randomString(750));
        click(By.xpath("//*[@id=\":R1adalah9uuul9vcq:\"]"));

    }
    public String randomString(int length) {
        String symbols = "abcdefghijklmnopqrstuvwxyz123456789";
        Random rnd = new Random();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            str.append(symbols.charAt(rnd.nextInt(symbols.length())));
        }
        return str.toString();
    }

    private void setLargeTextValue(WebDriver driver, By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Check if the element is editable
        Boolean isEditable = (Boolean) js.executeScript(
                "return arguments[0].matches(':not([readonly]):not([disabled])')",
                element
        );

        if (!isEditable) {
            throw new ElementNotInteractableException("Element is not editable");
        }

        // Set the value
        js.executeScript("arguments[0].value = arguments[1];", element, text);

        // Verify the value was set correctly
        String actualValue = (String) js.executeScript("return arguments[0].value;", element);
        if (!actualValue.equals(text)) {
            throw new WebDriverException("Failed to set text. Expected: " + text + ", Actual: " + actualValue);
        }

        // Trigger input and change events
        js.executeScript(
                "var element = arguments[0];" +
                        "var event = new Event('input', { bubbles: true });" +
                        "element.dispatchEvent(event);" +
                        "event = new Event('change', { bubbles: true });" +
                        "element.dispatchEvent(event);",
                element
        );
    }
}