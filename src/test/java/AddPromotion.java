import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.ThreadLocalRandom;

public class AddPromotion extends MainMethods{
    @Test(priority = 1)
    public void NavtoPromotion(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[12]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[3]"));
    }
    @Test(priority = 2)
    public void addPromotion(){
        for (int i = 0; i < 3; i++) {
            click(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div[2]/button[1]"));
            String randomint  = String.valueOf(ThreadLocalRandom.current().nextInt(1, 15));
            doubleClick(By.xpath("//input[@placeholder='Select Promotion Type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()="+randomint+"]"));
            doubleClick(By.xpath("/html/body/div[5]/div[3]/div/div/div[1]/form/div[1]/div[2]/div/div/div/div/button"),By.xpath("/html/body/div[6]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[3]"));
            String realEstateDescription = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate";

            WebElement descriptionField = driver.findElement(By.xpath("//textarea[@name='description']"));descriptionField.sendKeys(realEstateDescription);
            click(By.xpath("/html/body/div[5]/div[3]/div/div/div[1]/form/div[2]/button[1]"));
        }
    }
}
