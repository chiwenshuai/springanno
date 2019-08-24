package com.cap2.controller;

public class Param1 {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private External comExternalGWInfo;

    public External getComExternalGWInfo() {
        return comExternalGWInfo;
    }

    public void setComExternalGWInfo(External comExternalGWInfo) {
        this.comExternalGWInfo = comExternalGWInfo;
    }
}
