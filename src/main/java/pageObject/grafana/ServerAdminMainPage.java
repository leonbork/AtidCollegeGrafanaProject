package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ServerAdminMainPage {

    @FindBy(how = How.XPATH, using = "/html/body/grafana-app/div/div/react-container/div/div/div[1]/div/div[2]/div[2]/table/tbody/tr")
    public List<WebElement> rows;

    @FindBy(how = How.CLASS_NAME, using = "css-a5ta8x-button")
    public WebElement btn_newUser;


}
