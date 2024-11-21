import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddProject extends MainMethods{
    @Test(priority = 1)
    public void NavigateToNav(){
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("//span[normalize-space()=\"Projects\"]"));
        click(By.xpath("//span[normalize-space()=\"Add Project\"]"));
    }
    @Test(priority = 2)
    public void CheckRequiredFields(){
//    scrollPage(6000);
    click(By.xpath("/html/body/div[2]/main/form/div[7]/button[1]"));
//    InlineErrorValidator(By.xpath("//div[contains(text(),\"Missing fields\")]"),"Missing Fields");
    scrollPage(-500);
    }
    @Test(priority = 3)
    public void AddProjectDetails(){
        clickandsend(By.name("project_name"),"FrontEndAutomation");
//        clickandsend(By.name("license_no"),"License-12312312312");
//        clickandsend(By.name("project_no"),"ProjectNo-12321321321");
//        clickandsend(By.name("starting_price"),"12312312321321");
//        doubleClick(By.xpath("//input[@placeholder='Developer company']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
//        doubleClick(By.xpath("//input[@placeholder='Select Country']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
//        doubleClick(By.xpath("//input[@placeholder='Select State']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
//        doubleClick(By.xpath("//input[@placeholder='Select City']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
//        doubleClick(By.xpath("//input[@placeholder='Select Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
//        doubleClick(By.xpath("//input[@placeholder='Select Sub Community']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
    }
}