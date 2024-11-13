import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class addUser extends MainMethods{
    @Test
    public void AddUser(){
        click(By.xpath("//button[@aria-label=\"open drawer\"]//*[name()=\"svg\"]"));
        click(By.xpath("/html/body/div[2]/div/div/nav[2]/div[1]"));
        click(By.xpath("/html/body/div[2]/div/div/nav[2]/div[2]/div/div/a/div"));
    }
}
