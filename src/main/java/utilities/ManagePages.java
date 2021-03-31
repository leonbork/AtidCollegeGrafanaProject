package utilities;


import org.openqa.selenium.support.PageFactory;
import pageObject.grafana.AddNewUserPage;
import pageObject.grafana.EditUserPage;
import pageObject.grafana.ServerAdminMainPage;
import pageObject.grafana.ServerAdminMenuPage;

public class ManagePages extends Base{


    public static void initGrafana(){
        grafanaLogin = PageFactory.initElements(driver, pageObject.grafana.LoginPage.class);
        grafanaMain = PageFactory.initElements(driver, pageObject.grafana.MainPage.class);
        grafanaLeftMain = PageFactory.initElements(driver, pageObject.grafana.LeftMenuPage.class);
        grafanaServerAdmin = PageFactory.initElements(driver, ServerAdminMenuPage.class);
        grafanaServerAdminMain = PageFactory.initElements(driver, ServerAdminMainPage.class);
        grafanaAddNewUser = PageFactory.initElements(driver, AddNewUserPage.class);
        grafanaEditUser = PageFactory.initElements(driver, EditUserPage.class);
    }




}
