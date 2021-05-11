package com.opencart.Data;

import lombok.Getter;
import org.openqa.selenium.support.ui.Select;

@Getter
public class CurrencyModel {
    private String currencyTitle;
    private String currencyCode;
    private String currencySymbolLeft;
    private String currencySymbolRight;
    private String currencyDecimalPlaces;
    private String currencyValue;


    public CurrencyModel() {
    }

    public static CurrencyModel.Builder getAdminBuilder(){
        return new CurrencyModel().new Builder();
    }

    public class Builder{
        public CurrencyModel.Builder currencyTitle(String value){
            currencyTitle = value;
            return this;
        }

        public CurrencyModel.Builder currencyCode(String value){
            currencyCode = value;
            return this;
        }

        public CurrencyModel.Builder currencySymbolLeft(String value){
            currencySymbolLeft = value;
            return this;
        }

        public CurrencyModel.Builder currencySymbolRight(String value){
            currencySymbolRight = value;
            return this;
        }

        public CurrencyModel.Builder currencyDecimalPlaces(String value){
            currencyDecimalPlaces = value;
            return this;
        }

        public CurrencyModel.Builder currencyValue(String value){
            currencyValue = value;
            return this;
        }

        public CurrencyModel build() {
            return CurrencyModel.this;
        }

    }


}
