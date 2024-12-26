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
    String randomfur  = String.valueOf(ThreadLocalRandom.current().nextInt(1,4 ));

    @Test(priority = 1)

    public void NavigateToNav() {
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("//span[normalize-space()=\"Property Hub\"]"));
        click(By.xpath("//span[normalize-space()=\"Add Property\"]"));
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
    }
    @Test(priority = 2)
    public void AddProperty(){
        String[] projects = {
                "Burj Khalifa Residences", "Palm Jumeirah Villas", "Jumeirah Beach Apartments",
                "Downtown Dubai Towers", "Business Bay Heights", "Dubai Marina Skyrise",
                "Emaar Beachfront", "Bluewaters Island Residences", "Meydan Heights Villas",
                "Al Barari Oasis", "DAMAC Hills Residences", "Arabian Ranches Villas",
                "City Walk Dubai", "La Mer Beachfront", "Dubai Creek Harbour Residences",
                "Dubai Hills Estate", "Tilal Al Ghaf Residences", "Port de La Mer Apartments",
                "Madinat Jumeirah Living", "Serenia Residences Palm Jumeirah",
                "Vida Residences Downtown", "The Address Sky View", "One Za’abeel Residences",
                "Opera Grand Downtown", "Safa Two by DAMAC", "Park Ridge by Emaar",
                "The Cove Dubai Creek", "Al Furjan Residences", "Green Community Villas",
                "The Meadows Dubai", "The Springs Dubai", "Jumeirah Golf Estates",
                "Victory Heights Villas", "The Sustainable City", "Dubai South Residences",
                "Mudon Villas", "Remraam Apartments", "Dubai Silicon Oasis Residences",
                "The Executive Towers", "Zabeel Saray Villas", "Amna Tower Al Habtoor City",
                "Shams JBR Apartments", "Rimal Residences", "Sadaf Apartments JBR",
                "Golden Mile Palm Jumeirah", "Jade at the Fields", "Gardenia Villas by Nakheel",
                "Dragon City Residences", "Sobha Hartland Greens", "Mohammed Bin Rashid City",
                "Nad Al Sheba Villas", "Al Khail Heights", "Azizi Riviera Apartments",
                "Creek Palace Residences", "Sunset at Creek Beach", "Lotus Creek Beach",
                "Eden at The Valley", "Bayshore Creek Beach", "Maple Townhouses Dubai Hills",
                "Sidra Villas Dubai Hills", "Golf Place Villas", "Acacia Park Heights",
                "Park Point Residences", "The Pinnacle Dubai Hills", "Ellington Belgravia",
                "Wilton Terraces by Ellington", "Collective Apartments", "Executive Residences",
                "The Terraces Sobha Hartland", "Wilton Park Residences", "Marsa Plaza Residences",
                "Al Badia Residences", "Dubai Festival City Apartments", "Deira Islands Residences",
                "Plazzo Heights JVC", "Vincitore Boulevard", "Pantheon Boulevard",
                "District One Residences", "Azizi Mirage Apartments", "Azizi Aura Residences",
                "Signature Livings JVC", "Seventh Heaven Al Barari", "Ashjar Al Barari",
                "The Nest Al Barari", "West Yas Residences", "The Address Dubai Mall",
                "The Address Fountain Views", "Burj Royale Downtown", "South Ridge Downtown",
                "Marina Promenade Dubai", "Silverene Tower Dubai Marina", "The Torch Tower Marina",
                "Princess Tower Marina", "Marina Gate Residences", "Vida Marina Residences",
                "Jumeirah Living Marina Gate", "Cayan Tower Marina", "Le Reve Marina",
                "Jumeirah Bay X1 JLT", "Jumeirah Bay X2 JLT", "Saba Tower JLT",
                "Concorde Tower JLT", "Almas Tower JLT", "Green Lakes Towers JLT",
                "Lake Terrace JLT", "Lake View JLT", "Laguna Tower JLT", "ICON Tower JLT",
                "DAMAC Heights Marina", "The One JLT Residences", "Grosvenor House Apartments",
                "Al Seef Towers", "Bahar Residences JBR", "Shoreline Apartments Palm Jumeirah",
                "Garden Homes Palm Jumeirah", "Signature Villas Palm Jumeirah",
                "Fairmont Residences Palm Jumeirah", "One Palm Jumeirah", "Muraba Residences Palm",
                "Atlantis The Royal Residences", "W Residences Palm Jumeirah",
                "Serenia Living Palm Jumeirah", "Six Senses Residences The Palm",
                "SO/ Residences Uptown Dubai", "Signature Mansions Tilal Al Ghaf",
                "Harmony Villas Tilal Al Ghaf", "AURA Tilal Al Ghaf", "Elysian Mansions",
                "Marasi Riverside Apartments", "Central Park City Walk", "The Residences JBR",
                "Vida Dubai Marina", "St. Regis Residences Downtown", "Ritz-Carlton Residences",
                "Palm Tower Apartments", "The Royal Atlantis Palm", "Dubai Wharf Residences",
                "Sobha Hartland Forest Villas", "Imperial Avenue Downtown", "One Park Avenue",
                "Anwa Residences Dubai Maritime City", "The Opus by Zaha Hadid",
                "Meliá Desert Palm Residences", "Al Seef 2 Tower JLT", "Artesia DAMAC Hills",
                "Carson Towers DAMAC Hills", "The Legends DAMAC Hills", "DAMAC Lagoons",
                "Santorini DAMAC Lagoons", "Costa Brava DAMAC Lagoons",
                "Monte Carlo DAMAC Lagoons", "Emaar South Expo Golf Villas",
                "Al Wasl 1 Residences", "Harbour Gate Dubai Creek", "Harbour Views Towers",
                "Creek Edge Residences", "Creek Rise Residences", "Palace Residences",
                "Cedar Creek Beach", "Lotus Dubai Creek", "Marina Shores Dubai Marina",
                "Marina Vista Emaar Beachfront", "South Beach Holiday Homes",
                "Beach Isle Emaar Beachfront", "Sunrise Bay Emaar Beachfront",
                "Grand Bleu Tower by Elie Saab", "Seagate Rashid Yachts & Marina",
                "Sirdhana Residences Rashid Port", "Orchid at Creek Beach", "Rosewater Creek Beach",
                "Lime Gardens Dubai Hills", "Elvira Dubai Hills", "Park Horizon Dubai Hills",
                "Palm Views Apartments", "Al Bandar Residences", "Al Zeina Residences",
                "Al Muneera Residences", "Raha Gardens", "Al Reef Villas",
                "The Bridges Al Reem Island", "Waters Edge Yas Island",
                "Mayan Residences Yas Island", "The Cedars Yas Acres",
                "Al Ghadeer Phase 2", "Jumeirah Luxury Villas", "Silver Springs Villas",
                "Veneto Residences Dubai Waterfront", "Nikki Beach Residences",
                "Nad Al Hamar Villas", "District 2020 Residences", "One Central Residences",
                "Bayz Tower Business Bay", "DAMAC Maison Prive", "Millennium Binghatti Residences",
                "Oasis Residences Masdar City", "Al Maryah Vista", "Waterfront City Al Zorah",
                "Al Mahra Desert Resort Villas", "Sharjah Waterfront City Residences",
                "Ajmal Makan Sharjah Waterfront", "Aljada by ARADA Residences", "Reem Hills",
                "Mamsha Al Saadiyat", "Jubail Island Villas", "Nurai Island Villas",
                "Lea at Yas Acres", "Saadiyat Reserve Residences", "Bloom Gardens Abu Dhabi",
                "Faya Residences Abu Dhabi", "Park View Residences Saadiyat",
                "Pixel Residences Al Reem Island", "Louvre Abu Dhabi Residences"
                // Extend this list to 500 names.
        };
        Random random = new Random();
        int randomIndex = random.nextInt(projects.length);
        String selectedProject = projects[randomIndex];

        clickandsend(By.name("property_name"),"MARK "+selectedProject);
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
                By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and (position()=4 or position()=4)]")
        );
        int loop2  = Integer.parseInt(String.valueOf(ThreadLocalRandom.current().nextInt(1, 6)));
        for (int i = 0; i < loop2; i++) {
            String typex  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 7));
            doubleClick(By.xpath("//input[@placeholder='Select Unit type']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=" + typex + "]"));
        }
        clickandsend(By.name("plot_area"),randomint4);
        clickandsend(By.name("built_up_area"),randomint5);
        clickandsend(By.name("sector_no"),"SECTOR "+SECTOR);
        clickandsend(By.name("property_no"),IBAN);
        String randommin  = String.valueOf(ThreadLocalRandom.current().nextInt(1,9999 ));
        String randommax  = String.valueOf(ThreadLocalRandom.current().nextInt(9999,99999 ));
        String nounit  = String.valueOf(ThreadLocalRandom.current().nextInt(9999,99999 ));
        String floors  = String.valueOf(ThreadLocalRandom.current().nextInt(1,999 ));
        String parking  = String.valueOf(ThreadLocalRandom.current().nextInt(1,50 ));
        String pools  = String.valueOf(ThreadLocalRandom.current().nextInt(1,50 ));
        String elevetaor  = String.valueOf(ThreadLocalRandom.current().nextInt(1,50 ));
        clickandsend(By.name("min_area"),randommin);
        clickandsend(By.name("max_area"),randommax);
        clickandsend(By.name("no_of_units"),nounit);
        clickandsend(By.name("no_of_parking"),parking);
        clickandsend(By.name("no_of_floors"),floors);
        clickandsend(By.name("no_of_pools"),pools);
        clickandsend(By.name("no_of_elevators"),elevetaor);
        String randomlife  = String.valueOf(ThreadLocalRandom.current().nextInt(1,3 ));

        doubleClick(By.xpath("//input[@placeholder='Select Life Style']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomlife+"]"));

        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[17]/div/div/div/div[2]/button"),By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[1]"));
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[18]/div/div/div/div[2]/button"),By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/button[3]"));
        Thread.sleep(500);
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[19]/div/div/div/div[2]/button"),By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[4]/button[5]"));
        doubleClick(By.xpath("//input[@placeholder='Select Completion Status']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=2]"));
        int loop1  = Integer.parseInt(String.valueOf(ThreadLocalRandom.current().nextInt(1, 10)));
        for (int i = 0; i < loop1; i++) {
            String typessss  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 30));
            doubleClick(By.xpath("//input[@placeholder='Select Views']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=" + typessss + "]"));
        }
        doubleClick(By.xpath("//input[@placeholder='Select Furnished']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomfur+"]"));
        doubleClick(By.xpath("//input[@placeholder='Select Ownership']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomint+"]"));
        Thread.sleep(500);
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[22]/div/div/div/div[1]/div/div"),By.xpath("//li[@data-value='1']"));
        clickandsend(By.name("service_charge"),IBAN);
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[22]/div/div/div/div[2]/div/div"),By.xpath("//li[normalize-space()=\"sqft\"]"));
        clickandsend(By.xpath("//input[@placeholder='Enter Price' and @name='price']"),price);
        Thread.sleep(1500);
        scrollPage(500);


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