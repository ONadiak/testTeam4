package com.opencart.repository;

import com.opencart.datamodel.LoginModel;


public class LoginModelRepository {

    private LoginModelRepository(){

    }
    public static LoginModel getLoginModel(){
        return LoginModel.getBuilder()
                .emailAddress("test@gmail.com")
                .password("12345")
                .build();
    }
}
