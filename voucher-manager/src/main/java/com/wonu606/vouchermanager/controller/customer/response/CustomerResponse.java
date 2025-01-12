package com.wonu606.vouchermanager.controller.customer.response;

public class CustomerResponse {

    private final String email;
    private final String nickname;

    public CustomerResponse(String email, String nickname) {
        this.email = email;
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }
}
