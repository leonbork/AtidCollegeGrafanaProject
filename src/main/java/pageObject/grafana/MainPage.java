package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    @FindBy(how = How.CLASS_NAME, using = "css-jjwbqw")
    public WebElement head_Dashboard;


}
