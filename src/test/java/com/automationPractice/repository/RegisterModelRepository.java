package com.automationPractice.repository;

import com.automationPractice.Data.RegisterModel;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

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
