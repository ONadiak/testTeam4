package com.opencart.repository;

import com.opencart.Data.CurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;

public class CurrencyModelRepository {
    public CurrencyModelRepository(){

    }

    public CurrencyModel getCurrencyModel() {
        return CurrencyModel.getAdminBuilder()
                .currencyTitle(RandomStringUtils.randomAlphabetic(6))
                .currencyCode(RandomStringUtils.randomAscii(3))
                .currencySymbolLeft(RandomStringUtils.randomAscii(1))
                .currencySymbolRight(RandomStringUtils.randomAscii(1))
                .currencyValue(RandomStringUtils.randomNumeric(1))
                .currencyDecimalPlaces(RandomStringUtils.randomAlphanumeric(1))
                .build();
    }

}
