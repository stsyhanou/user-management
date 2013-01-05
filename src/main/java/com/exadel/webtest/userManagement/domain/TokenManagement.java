package com.exadel.webtest.userManagement.domain;

import javax.persistence.*;

/**
 *@author Pavel Hutnik
 */
@Entity
@Table(name = "token_management")
public class TokenManagement {
    @Id
    @Column(name ="token_id")
    @GeneratedValue
    private int tokenId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "token")
    private String token;

    @Column(name = "token_type")
    private int token_id;

    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getToken_id() {
        return token_id;
    }

    public void setToken_id(int token_id) {
        this.token_id = token_id;
    }
}
