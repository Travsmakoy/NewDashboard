import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        WebElement mark = driver.findElement(By.xpath("//input[@placeholder='Broker Agent']"));
        mark.sendKeys("Kashif");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));

        // Step 3: Select the first option from the dropdown
        WebElement firstOption = driver.findElement(By.xpath("//ul[@role='listbox']//li[1]"));
        firstOption.click();  // Click on the first option in the dropdown

        clickandsend(By.xpath("//input[@placeholder='Search by name or number']"),"Ali");
        WebElement secondOption = driver.findElement(By.xpath("//ul[@role='listbox']//li[1]"));
        secondOption.click();  // Click on the first option in the dropdown

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
        scrollPage(500);
        Thread.sleep(1000);

        String[] array = {
                "luxury", "apartment", "spacious", "modern", "residence", "prime location", "city view", "beachfront",
                "amenities", "garden", "balcony", "terrace", "high-rise", "cozy", "family-friendly", "community",
                "elegant", "conveniently located", "open plan", "stylish", "high-end finishes", "affordable",
                "move-in ready", "renovated", "close to schools", "shopping centers", "parking", "garage", "fitness center",
                "swimming pool", "security", "gated community", "prestigious", "investment opportunity", "penthouse",
                "exclusive", "new development", "sunny", "natural light", "beautiful landscape", "tranquil", "executive",
                "custom-built", "walk-in closet", "green spaces", "high ceilings", "luxurious", "vibrant neighborhood",
                "city center", "affordable housing", "home office", "open kitchen", "spacious layout", "pet-friendly",
                "storage space", "understated elegance", "state-of-the-art", "home theater", "entertainment area",
                "double-glazed windows", "well-maintained", "furnished", "large windows", "ideal location", "central air",
                "family room", "breakfast nook", "private", "master suite", "separate laundry", "energy efficient",
                "multi-story", "fireplace", "vaulted ceilings", "cul-de-sac", "premium", "nature trails",
                "easy commute", "historic", "charm", "bay windows", "skylights", "upgraded kitchen", "hardwood floors",
                "ceramic tiles", "stainless steel appliances", "walkable", "dual sinks", "climate-controlled",
                "panoramic views", "marble counters", "granite countertops", "convenient access"
        };

        String randomString = generateRandomString(array, 50);
        // Call clickandsend to send the random string
        clickandsend(By.name("title"), randomString);
        String realEstateDescription = "This beautifully designed 2-bedroom apartment offers modern living with stunning views of the city skyline. Located in the heart of the vibrant downtown area, this apartment features spacious living areas, high-end finishes, and large windows that fill the space with natural light. The fully equipped kitchen boasts state-of-the-art appliances, while the master bedroom comes with an ensuite bathroom. Residents enjoy access to premium amenities, including a rooftop pool, fully equipped fitness center, and 24/7 security. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience";

        WebElement descriptionField = driver.findElement(By.xpath("//textarea[@name='description']"));descriptionField.sendKeys(realEstateDescription);
        scrollPage(500);
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
        click(By.xpath("/html/body/div[2]/main/form/div[7]/div/button[1]"));
    }

    public static String generateRandomString(String[] array, int targetLength) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();

        while (result.length() < targetLength) {
            // Randomly pick a word from the array
            String word = array[random.nextInt(array.length)];

            // Check if adding this word would exceed the target length
            if (result.length() + word.length() <= targetLength) {
                result.append(word).append(" "); // Append the word with a space
            }
        }

        // Trim any trailing space and return the result
        return result.toString().trim();
    }
}