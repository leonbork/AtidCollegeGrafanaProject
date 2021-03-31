package workflow;

import extensions.UIActions;
import utilities.CommonOps;

public class WebFlows extends CommonOps {

    public static void loginGrafana(String userName, String password){
        UIActions.updateText(grafanaLogin.txt_userName, userName);
        UIActions.updateText(grafanaLogin.txt_password, password);
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
    }

    public static void createNewUser(String name, String email, String userName, String pass){
        UIActions.click(grafanaServerAdminMain.btn_newUser);
        UIActions.updateText(grafanaAddNewUser.txt_name, name);
        UIActions.updateText(grafanaAddNewUser.txt_email, email);
        UIActions.updateText(grafanaAddNewUser.txt_userName, userName);
        UIActions.updateText(grafanaAddNewUser.txt_password, pass);
        UIActions.click(grafanaAddNewUser.btn_create);
    }

    public static void deleteLastUser(){
        UIActions.click(grafanaServerAdminMain.rows.get(grafanaServerAdminMain.rows.size()-1));
        UIActions.click(grafanaEditUser.btn_deleteUser);
        UIActions.click(grafanaEditUser.btn_VerifyDeleteUser);
    }



}
