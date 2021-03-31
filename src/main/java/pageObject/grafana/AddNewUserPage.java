package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewUserPage {

    @FindBy(how = How.CSS, using = "input[name='name']")
    public WebElement txt_name;

    @FindBy(how = How.CSS, using = "input[name='email']")
    public WebElement txt_email;

    @FindBy(how = How.CSS, using = "input[name='login']")
    public WebElement txt_userName;

    @FindBy(how = How.CSS, using = "input[name='password']")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement btn_create;
}
