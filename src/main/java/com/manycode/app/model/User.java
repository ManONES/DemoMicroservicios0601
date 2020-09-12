package com.manycode.app.model;

public class User {
    private String userId;
    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public void initData(String userId) {
        this.setUserId(userId + " Bienvenido al mundo de los microservicios version uno");

    }
}
