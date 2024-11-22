import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProjectOffPlanGallery extends MainMethods {
    @Test(priority = 1)
    public void ProjectOffPlanGallery(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[12]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[4]/a"));
        click(By.xpath("//button[normalize-space()=\"Add Gallery\"]"));
        doubleClick(By.xpath("//input[@placeholder='Select Gallery Type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Media Type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        click(By.xpath("//*[@id=\":rck:\"]"));
    }
}
