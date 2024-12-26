import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HubUnitType extends MainMethods{
    @Test(priority = 1)
    public void GotoUnitType(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[16]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[5]/a"));
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[1]/div[3]/a/button"));
    }
    @Test(priority = 2)
    public void AddDetails(){
        doubleClick(By.xpath("//input[@placeholder='Select Unit Type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        String[] unitTypes = {
                "Studio", "1 BR", "2 BR", "3 BR", "4 BR", "5 BR"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(unitTypes.length);
        String selectedUNIT = unitTypes[randomIndex];
        clickandsend(By.name("type_name"),selectedUNIT);
        String MIN  = String.valueOf(ThreadLocalRandom.current().nextInt(1,9999 ));
        String MAX  = String.valueOf(ThreadLocalRandom.current().nextInt(9999,99999 ));
        String MINprice  = String.valueOf(ThreadLocalRandom.current().nextInt(1,9999 ));
        String MAXprice  = String.valueOf(ThreadLocalRandom.current().nextInt(9999,99999 ));
        String bedroom  = String.valueOf(ThreadLocalRandom.current().nextInt(1,999 ));
        String park  = String.valueOf(ThreadLocalRandom.current().nextInt(1,50 ));

        clickandsend(By.name("min_area"),MIN);
        clickandsend(By.name("max_area"),MAX);
        clickandsend(By.name("min_price"),MINprice);
        clickandsend(By.name("max_price"),MAXprice);
        clickandsend(By.name("bedrooms"),bedroom);
        clickandsend(By.name("parkings"),park);

        click(By.xpath("/html/body/div[2]/main/form/div[2]/button[1]"));

    }
}
