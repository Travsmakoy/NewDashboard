import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class addProperty extends MainMethods{
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
    clickandsend(By.name("property_name"),"PROPERTY - "+randoms);
    scrollPage(500);
        int loop  = Integer.parseInt(String.valueOf(ThreadLocalRandom.current().nextInt(1, 8)));
        for (int i = 0; i < loop; i++) {
            String randomint  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 10));
            doubleClick(By.xpath("//input[@placeholder='Select Unit Type']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=" + randomint + "]"));
        }
        clickandsend(By.name("min_area"),minArea);
        clickandsend(By.name("max_area"),maxArea);
        clickandsend(By.name("plot_area"),PlotArea);
        clickandsend(By.name("built_up_area"),BuiltArea);
        int loop1  = Integer.parseInt(String.valueOf(ThreadLocalRandom.current().nextInt(1, 10)));
        for (int i = 0; i < loop1; i++) {
            String typesss  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 50));
            doubleClick(By.xpath("//input[@placeholder='Select the view types']"), By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=" + typesss + "]"));
        }
        doubleClick(By.xpath("//div[normalize-space()=\"currency\"]"),By.xpath("//li[normalize-space()=\"AED\"]"));
        clickandsend(By.name("service_charge"),ServiceCharge);
        doubleClick(By.xpath("//div[normalize-space()=\"measure\"]"),By.xpath("//li[normalize-space()=\"sqft\"]"));
        scrollPage(650);
        String[] Title = {
                "Burj Khalifa Residences with Panoramic Views of Downtown Dubai",
                "Luxury Palm Jumeirah Villas with Private Pools and Beach Access",
                "Modern Jumeirah Beach Apartments Near World-Class Amenities",
                "Downtown Dubai Towers Offering Premium City-Center Living",
                "Business Bay Heights Apartments with Waterfront Views",
                "Sky-High Living at Dubai Marina Skyrise Luxury Residences",
                "Emaar Beachfront Properties with Uninterrupted Sea Views",
                "Bluewaters Island Residences Offering Vibrant Urban Living",
                "Meydan Heights Villas Near the Prestigious Racecourse",
                "Al Barari Oasis Villas Surrounded by Lush Green Landscapes",
                "DAMAC Hills Residences with Golf Course and Luxury Amenities",
                "Arabian Ranches Villas for Elegant Suburban Family Living",
                "City Walk Dubai Residences with Boutique Shopping Nearby",
                "La Mer Beachfront Apartments with Stunning Sea Views",
                "Dubai Creek Harbour Residences with Skyline Panoramas",
                "Dubai Hills Estate Homes Featuring Modern Green Living",
                "Tilal Al Ghaf Residences with Exclusive Beachfront Access",
                "Port de La Mer Apartments in a Mediterranean-Inspired Setting",
                "Madinat Jumeirah Living in the Heart of Heritage Culture",
                "Serenia Residences Palm Jumeirah with World-Class Amenities",
                "Vida Residences Downtown Close to Dubai Mall and Fountain",
                "The Address Sky View Apartments in Prime Downtown Location",
                "One Za’abeel Residences Featuring Unmatched Architectural Design",
                "Opera Grand Downtown Homes with Iconic Burj Khalifa Views",
                "Safa Two by DAMAC Offering Opulent High-Rise Living Spaces",
                "Park Ridge by Emaar Near Tranquil Green Spaces and Parks",
                "The Cove Dubai Creek Residences with Vibrant Waterfront Living",
                "Al Furjan Residences with Spacious Homes and Amenities Nearby",
                "Green Community Villas with Landscaped Gardens and Play Areas",
                "The Meadows Dubai Offering Family-Friendly Lifestyle in Suburbs",
                "The Springs Dubai Townhouses in a Peaceful Community Setting",
                "Jumeirah Golf Estates with Luxury Homes Overlooking the Fairways",
                "Victory Heights Villas with World-Class Golfing and Greenery",
                "The Sustainable City Residences in Dubai’s Greenest Community",
                "Dubai South Residences in a Thriving Urban Development Area",
                "Mudon Villas with Modern Living Spaces in a Vibrant Suburb",
                "Remraam Apartments Surrounded by Open Spaces and Parks",
                "Dubai Silicon Oasis Residences with High-Tech Lifestyle Options",
                "The Executive Towers at Business Bay with Prime Connectivity",
                "Zabeel Saray Villas Featuring Timeless Ottoman Architecture",
                "Amna Tower Al Habtoor City with Riverside Living Opportunities",
                "Shams JBR Apartments with Exclusive Beachfront Access",
                "Rimal Residences in Jumeirah Beach Residence Close to the Marina",
                "Sadaf Apartments JBR Offering Vibrant Community Living",
                "Golden Mile Palm Jumeirah Apartments with Modern Facilities",
                "Jade at the Fields Offering Contemporary Townhouse Living",
                "Gardenia Villas by Nakheel in Green, Tranquil Surroundings",
                "Dragon City Residences with Unique Architectural Designs",
                "Sobha Hartland Greens Residences Surrounded by Nature",
                "Mohammed Bin Rashid City Luxury Villas with Premium Living",
                "Nad Al Sheba Villas Close to Top Schools and Sports Facilities",
                "Al Khail Heights Apartments in a Well-Connected Urban Area",
                "Azizi Riviera Apartments Offering Modern Waterfront Living",
                "Creek Palace Residences with Iconic Dubai Creek Views",
                "Sunset at Creek Beach Residences with Tranquil Waterfront Living",
                "Lotus Creek Beach Apartments Featuring Unique Modern Designs",
                "Eden at The Valley Villas in a Serene Suburban Development",
                "Bayshore Creek Beach Apartments with Access to Private Beaches",
                "Maple Townhouses Dubai Hills in a Family-Friendly Neighborhood",
                "Sidra Villas Dubai Hills Featuring Modern Open-Plan Designs",
                "Golf Place Villas Overlooking Championship-Level Golf Courses",
                "Acacia Park Heights Residences in a Lush Green Setting",
                "Park Point Residences at Dubai Hills Estate Near Parks",
                "The Pinnacle Dubai Hills Apartments with Stunning Skyline Views",
                "Ellington Belgravia Residences with Boutique-Style Living",
                "Wilton Terraces by Ellington Offering Elegant Urban Apartments",
                "Collective Apartments for Vibrant Co-Living in Dubai Hills Estate",
                "Executive Residences Featuring Seamless Work-Life Integration",
                "The Terraces Sobha Hartland with Modern Family Homes in Nature",
                "Wilton Park Residences in the Heart of an Urban Green Oasis",
                "Marsa Plaza Residences with Stunning Creekside Views",
                "Al Badia Residences in Dubai Festival City with Prime Living"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(Title.length);
        String selectedProject = Title[randomIndex];
        clickandsend(By.name("property_title"),selectedProject);
        String realEstateDescription = "This beautifully designed 2-bedroom apartment offers modern living with stunning views of the city skyline. Located in the heart of the vibrant downtown area, this apartment features spacious living areas, high-end finishes, and large windows that fill the space with natural light. The fully equipped kitchen boasts state-of-the-art appliances, while the master bedroom comes with an ensuite bathroom. Residents enjoy access to premium amenities, including a rooftop pool, fully equipped fitness center, and 24/7 security. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience. Perfectly situated near shopping centers, restaurants, and public transport, this apartment is a must-see for those seeking both luxury and convenience";

        WebElement descriptionField = driver.findElement(By.xpath("//textarea[@name='description']"));descriptionField.sendKeys(realEstateDescription);
        scrollPage(1700);
//        click(By.xpath("/html/body/div[2]/main/form/div[4]/div/div[2]/div/div[1]/ul/li"));
//        click(By.xpath("/html/body/div[2]/main/form/div[4]/div/div[2]/div/div[4]/ul/li"));
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[1]/ul/li"));
        click(By.xpath("/html/body/div[2]/main/form/div[5]/div/div[2]/div/div[3]/ul/li"));
        click(By.xpath("/html/body/div[2]/main/form/div[6]/button[1]"));
        Thread.sleep(2000);
    }
}
