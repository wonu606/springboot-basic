package com.wonu606.vouchermanager.repository.voucherwallet.query;

public class WalletUpdateQuery {

    private final String customerId;
    private final String voucherId;

    public WalletUpdateQuery(String customerId, String voucherId) {
        this.customerId = customerId;
        this.voucherId = voucherId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getVoucherId() {
        return voucherId;
    }
}
