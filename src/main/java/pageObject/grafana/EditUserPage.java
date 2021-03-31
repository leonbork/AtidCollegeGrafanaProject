package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditUserPage {

    @FindBy(how = How.CLASS_NAME, using = "css-jigxr0-button")
    public WebElement btn_deleteUser;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[2]/div/div[2]/div[1]/button")
    public WebElement btn_VerifyDeleteUser;

}
