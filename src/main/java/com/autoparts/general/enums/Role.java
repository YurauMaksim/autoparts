package com.autoparts.general.enums;

public enum Role {
    REGULAR_USER(1), ADMIN(2);

    private final int roleNum;
    Role(int roleNum){
        this.roleNum = roleNum;
    }

    public int getRoleNum(){
        return roleNum;
    }
}
