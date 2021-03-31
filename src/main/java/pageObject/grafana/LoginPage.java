package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.NAME, using = "user")
    public WebElement txt_userName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txt_password;

    @FindBy(how = How.CLASS_NAME, using = "css-1daj7gy-button")
    public WebElement btn_login;

    @FindBy(how = How.CLASS_NAME, using = "css-8waqwc-button")
    public WebElement btn_skip;


}
