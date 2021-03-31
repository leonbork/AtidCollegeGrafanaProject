package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.grafana.AddNewUserPage;
import pageObject.grafana.EditUserPage;
import pageObject.grafana.ServerAdminMainPage;
import pageObject.grafana.ServerAdminMenuPage;

public class Base {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;


    // Pages Objects
    protected static pageObject.grafana.LoginPage grafanaLogin;
    protected static pageObject.grafana.MainPage grafanaMain;
    protected static pageObject.grafana.LeftMenuPage grafanaLeftMain;
    protected static ServerAdminMenuPage grafanaServerAdmin;
    protected static ServerAdminMainPage grafanaServerAdminMain;
    protected static AddNewUserPage grafanaAddNewUser;
    protected static EditUserPage grafanaEditUser;
}
