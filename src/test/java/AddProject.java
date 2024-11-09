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
    public void AddProjectDetails(){
        clickandsend(By.name("project_name"),"FrontEndAutomation");
        clickandsend(By.name("license_no"),"License-12312312312");
        clickandsend(By.name("project_no"),"ProjectNo-12321321321");
        clickandsend(By.name("starting_price"),"12312312321321");
        doubleClick(By.xpath("//input[@id=':R2ldala59uuul9vcq:']"),By.xpath("//li[@id='R2ldala59uuul9vcq-option-0']"));

    }
}