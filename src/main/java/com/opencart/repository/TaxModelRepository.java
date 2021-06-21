package com.opencart.repository;

import com.opencart.Data.TaxModel;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.RandomAccess;

public class TaxModelRepository {
    public TaxModelRepository() {
    }

    public TaxModel getTaxModel(){
        return TaxModel.getTaxBuilder()
                .taxName(RandomStringUtils.randomAlphabetic(5))
                .taxRate(RandomStringUtils.randomAlphanumeric(1))
                .build();
    }
}
