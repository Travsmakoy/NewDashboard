import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PropertyHubPaymentPlan extends MainMethods{
    @Test(priority = 1)
    public void GotoPayment(){
       click(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[16]/div/button[6]"));
       click(By.xpath("//*[@id=\"actions-popover\"]/div[3]/div[4]/a"));
    }
    @Test(priority = 2)
    public void AddDetails() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div[2]/div/div[1]/a")).click();
        clickandsend(By.xpath("//input[@placeholder='Select Percentage' and @name='plans.0.payments.0.percentage']"),"100");
        doubleClick(By.xpath("/html/body/div[2]/main/form/div[1]/div/div[2]/div/div[4]/div[2]/div[2]/div/div/div/div[2]/button"),By.xpath("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[4]/button[5]"));
        clickandsend(By.name("plans.0.payments.0.milestone"),"THIS IS RANDOM TEST DATA");
        click(By.xpath("/html/body/div[2]/main/form/div[2]/button[1]"));
        click(By.xpath("/html/body/div[2]/main/form/div[2]/button[1]"));
        click(By.xpath("/html/body/div[2]/main/form/div/div/div[2]/div/div[4]/div/div[2]/a"));
    }
}
