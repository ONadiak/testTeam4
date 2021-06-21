
package com.opencart.repository;

import com.opencart.Data.RegisterModel;
import org.apache.commons.lang3.RandomStringUtils;

public class RegisterModelRepository {

    private RegisterModelRepository() {
    }

    public static RegisterModel getRegisterModel(){
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5)+"@gmail.com")
                .telephone(RandomStringUtils.randomAlphabetic(7))
                .password(RandomStringUtils.randomAlphabetic(7))
                .build();
    }
}

