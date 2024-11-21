import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddProject extends MainMethods{
    @Test(priority = 1)
    public void NavigateToNav(){
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("//span[normalize-space()=\"Projects\"]"));
        click(By.xpath("//span[normalize-space()=\"Add Project\"]"));
    }
//    @Test(priority = 2)
//    public void CheckRequiredFields(){
////    scrollPage(6000);
//    click(By.xpath("/html/body/div[2]/main/form/div[7]/button[1]"));
////    InlineErrorValidator(By.xpath("//div[contains(text(),\"Missing fields\")]"),"Missing Fields");
//    scrollPage(-500);
//    }
    @Test(priority = 3)
    public void AddProjectDetails(){
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
        scrollPage(1000);
        doubleClick(By.xpath("//input[@placeholder='Select Completion Status']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("completion_percentage"),"50");
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[3]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[7]"));
        doubleClick(By.xpath("//input[@placeholder='Select Life Style']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("plot_area"),"8000");
        clickandsend(By.name("built_up_area"),"7500");
        doubleClick(By.xpath("//input[@placeholder='Select Furnished']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        clickandsend(By.name("no_of_properties"),"50");
        doubleClick(By.xpath("//input[@placeholder='Select Ownership']"),By.xpath("//li[contains(@class, 'MuiAutocomplete-option') and position()=1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[10]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[4]/button[1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[11]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[4]"));
        click(By.xpath("/html/body/div[2]/main/form/div[3]/div/div[2]/div/div[12]/div/div/div/div[2]/button"));
        click(By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[5]/button[5]"));
    }
}