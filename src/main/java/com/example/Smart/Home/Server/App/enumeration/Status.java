package com.example.Smart.Home.Server.App.enumeration;

public enum Status {
    DEVICE_UP("DEVICE_UP"),
    DEVICE_DOWN("DEVICE_DOWN");
    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

}
