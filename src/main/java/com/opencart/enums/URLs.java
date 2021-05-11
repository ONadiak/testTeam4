package com.opencart.enums;

public enum URLs {
    BASE_URL ("http://localhost/opencart/upload/index.php"),
    ADMIN_URL ("http://localhost/opencart/upload/admin/index.php"),
    CURRENCY_URL("http://localhost/opencart/upload/admin/index.php?route=localisation/currency&user_token=WO5Gs5bQ1EFtLxjYk6athVKuStolWP2v");





    private final String value;
    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
