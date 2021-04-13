package pageObject.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {

    @FindBy(how = How.CLASS_NAME, using = "css-jjwbqw")
    public WebElement head_Dashboard;

    @FindBy(how = How.CLASS_NAME, using = "css-1vjouat")
    public List<WebElement> list_HomePageOptions;


}
