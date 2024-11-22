import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProjectOffPlanGallery extends MainMethods {
    @Test(priority = 1)
    public void ProjectOffPlanGallery(){
        click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[12]/div/button[6]"));
        click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[4]/a"));
        click(By.xpath("//button[normalize-space()=\"Add Gallery\"]"));
        doubleClick(By.xpath("//input[@placeholder='Select Gallery Type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        doubleClick(By.xpath("//input[@placeholder='Select Media Type']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        WebElement fileInput = driver.findElement(By.cssSelector("MuiInputBase-root"));
        fileInput.sendKeys("\"D:\\Mark OneDrive\\OneDrive - aqary international group\\Desktop\\1730355295352.jpg\"");
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[1]/form/div[4]/button[1]")).click();
    }
}
