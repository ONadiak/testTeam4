package com.opencart.steps;

import com.opencart.PageObjects.AdminLoginPage;
import com.opencart.PageObjects.AdminNavigationPage;


public class AdminLoginPageBL {
    private AdminLoginPage adminLoginPage;
    private AdminNavigationPageBL adminNavigationPageBL;
    private AdminNavigationPage adminNavigationPage;



    public AdminNavigationPageBL loginAdmin(){
        inputAdminUserName("admin");
        inputAdminPassword("admin");
        clickOnLoginButton();


        return new AdminNavigationPageBL();
    }

    public AdminLoginPageBL(){
        adminLoginPage = new AdminLoginPage();
    }

    public void inputAdminUserName(String name){
        adminLoginPage.getAdminUserName().clear();
        adminLoginPage.getAdminUserName().sendKeys(name);
    }

    public void inputAdminPassword(String password){
        adminLoginPage.getAdminPassword().clear();
        adminLoginPage.getAdminPassword().sendKeys(password);
    }

    public void clickOnLoginButton(){
        adminLoginPage.getAdminLoginButton().click();
    }



}
