import org.example.Main;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Random;

public class PropertyUnitTypes extends MainMethods {
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
                "Studio",
                "1BR",
                "2BR",
                "3BR",
                "4BR",
                "5BR+",
                "Penthouse",
                "Duplex",
                "Villa",
                "Townhouse",
                "Office",
                "Shop",
                "Warehouse",
                "Retail Space",
                "Plot",
                "Agricultural Land",
                "Industrial Land",
                "Residential Plot",
                "Commercial Plot",
                "Mixed-Use Development",
                "Serviced Apartment",
                "Hotel Apartment",
                "Factory",
                "Hospital",
                "School",
                "Sports Facility",
        };
        Random random = new Random();
        int randomIndex = random.nextInt(unitTypes.length);
        String SelectedUnit = unitTypes[randomIndex];
        clickandsend(By.name("type_name"),SelectedUnit);
    }
}
