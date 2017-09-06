import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {

    @Test
    public void Login(){
        System.setProperty("webdriver.chrome.driver" , "/Users/swekenyi/Documents/Personal/DevPlayBook/MavenTest/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPage rd = new RediffLoginPage(driver);
        rd.EmailID().sendKeys("johnswekenyi@gmail.com");
        rd.Password().sendKeys("myPassword");
        //rd.submitButton().click();
        rd.getHome().click();

       // driver.close();
        //create an object for rediff homepage
        RediffHomePage rh = new RediffHomePage(driver);
        rh.search().sendKeys("rediff");
        rh.submit().click();
    }

}
