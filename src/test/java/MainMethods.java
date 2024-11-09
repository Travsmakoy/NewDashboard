import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;
import java.util.ArrayList;

public class MainMethods {
    protected static WebDriverWait wait;
    protected static WebDriver driver;

    @BeforeSuite
    public void setUpSuite() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @AfterSuite
    public void tearDownSuite() throws InterruptedException {
        // Quit the WebDriver instance
        if (driver != null) {
            Thread.sleep(2500);
            driver.quit();
            System.out.println("TEST DONE");
        }
    }
    public void click(By locator){
        WebElement click = wait.until(ExpectedConditions.elementToBeClickable(locator));
//        System.out.println("Clicking "+click.getText());
        click.click();
    }
    public void URLvalidator(String value){
        Assert.assertEquals(driver.getCurrentUrl(),value);
//        System.out.println("You are in correct URL "+value);
    }
    public void getUrl(String value) {
        driver.get(value);
    }
    public void clickandsend(By locator, String value){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(value);
//        System.out.println("Entered "+value);
    }
    public void SwitchTab(int num){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(num));
    }
    public void clearfield(By locator){
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//        System.out.println(clear.getText());
        clear.click();
        clear.clear();
    }
    public void errorValidator(){
     WebElement error = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("MuiFormHelperText-root Mui-error MuiFormHelperText-sizeMedium MuiFormHelperText-contained mui-1wvgvb1")));
//     error.click();
    System.out.println(error.getText());
    }
}
