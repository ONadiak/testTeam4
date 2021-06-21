package com.opencart.Data;

import lombok.Getter;

@Getter
public class TaxModel {
    private String taxName;
    private String taxRate;

    public TaxModel() {
    }

    public static TaxModel.Builder getTaxBuilder(){return new TaxModel().new Builder();}

    public class Builder{
        public TaxModel.Builder taxName(String value){
            taxName=value;
            return this;
        }

        public TaxModel.Builder taxRate(String value){
            taxRate=value;
            return this;
        }
        public TaxModel build(){
            return TaxModel.this;
        }
    }


}
