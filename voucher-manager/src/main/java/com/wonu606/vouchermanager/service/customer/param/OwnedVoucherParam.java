package com.wonu606.vouchermanager.service.customer.param;

import java.util.UUID;

public class OwnedVoucherParam {

    private final String email;

    public OwnedVoucherParam(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
