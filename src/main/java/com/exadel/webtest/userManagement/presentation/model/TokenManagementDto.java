package com.exadel.webtest.userManagement.presentation.model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Tsyhanou Siarhei
 * Date: 09.01.13
 * Time: 18:34
 * To change this template use File | Settings | File Templates.
 */
public class TokenManagementDto {
    private int id;
    private String name;
    private List<TokenDto> tokens;

    public TokenManagementDto() {

    }

    public TokenManagementDto(int id, String name, List<TokenDto> tokens) {
        this.id = id;
        this.name = name;
        this.tokens = tokens;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTokens(List<TokenDto> tokens) {
        this.tokens = tokens;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<TokenDto> getTokens() {
        return tokens;
    }
}
