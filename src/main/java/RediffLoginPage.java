import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
    WebDriver driver;

    public RediffLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath(".//*[@id='login1']");
    By Password = By.name("passwd");
    By Go = By.name("proceed");
    //Click on home
    By Home = By.linkText("Home");

    public WebElement EmailID(){
        return driver.findElement(username);
    }

    public WebElement Password(){
        return driver.findElement(Password);
    }

    public WebElement submitButton(){
        return driver.findElement(Go);
    }

    public WebElement getHome() {
        return driver.findElement(Home);
    }
}
