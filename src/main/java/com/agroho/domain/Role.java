package com.agroho.domain;

/**
 * Created by rezaul on 5/17/17.
 */
public enum Role {

    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_USER("ROLE_USER");


    private String roleLabel;

    Role(String roleLabel) {
        this.roleLabel = roleLabel;
    }

    public String getRoleLabel() {
        return roleLabel;
    }

}
