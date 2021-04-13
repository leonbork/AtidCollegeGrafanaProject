package sanity;

import extensions.UIActions;
import extensions.Verifications;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.WebFlows;


public class GrafanaWeb extends CommonOps {

    @Test
    public void test01_verifyHeader(){
        WebFlows.loginGrafana("admin", "admin");
        Verifications.verifyTextInElement(grafanaMain.head_Dashboard, "Welcome to Grafana");
    }

    @Test
    public void test02_verify_ProgressSteps(){
        Verifications.visibilityOfElements(grafanaMain.list_HomePageOptions);
    }

    @Test
    public void test03_verifyDefaultUser(){
        UIActions.mouseHover(grafanaLeftMain.btn_server, grafanaServerAdmin.link_users);
        Verifications.numberOfElements(grafanaServerAdminMain.rows, 1);

    }

    @Test
    public void test04_verifyNewUser(){
        UIActions.mouseHover(grafanaLeftMain.btn_server, grafanaServerAdmin.link_users);
        WebFlows.createNewUser("AUser", "123@123.com", "aaaa", "bbbbb");
        Verifications.numberOfElements(grafanaServerAdminMain.rows, 2);

    }

    //@Test
    public void test05_deleteExistingUser(){
        UIActions.mouseHover(grafanaLeftMain.btn_server, grafanaServerAdmin.link_users);
        WebFlows.deleteLastUser();
        Verifications.numberOfElements(grafanaServerAdminMain.rows, 1);
    }




}
