package com.exadel.webtest.userManagement.presentation.model;

/**
 * Created with IntelliJ IDEA.
 * User: Tsyhanou Siarhei
 * Date: 10.01.13
 * Time: 12:15
 * To change this template use File | Settings | File Templates.
 */
public class TokenDto {

    private String token;
    private String value;
    private String creationTime;
    private String expireTime;

    public TokenDto() {
    }

    public TokenDto(String token, String value, String creationTime, String expireTime) {
        this.token = token;
        this.value = value;
        this.creationTime = creationTime;
        this.expireTime = expireTime;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getToken() {
        return token;
    }

    public String getValue() {
        return value;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public String getExpireTime() {
        return expireTime;
    }

}
