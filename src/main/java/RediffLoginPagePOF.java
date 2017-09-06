import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePOF {
    WebDriver driver;

    public RediffLoginPagePOF(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath =".//*[@id='login1']" )
    WebElement username;

    @FindBy(name = "passwd")
    WebElement Password;

    @FindBy(name = "proceed")
    WebElement Go;

    @FindBy(linkText = "Home")
    WebElement Home;

    public WebElement EmailID(){
        return username;
    }

    public WebElement Password(){
        return Password;
    }

    public WebElement submitButton(){
        return Go;
    }

    public WebElement getHome() {
        return Home;
    }
}
