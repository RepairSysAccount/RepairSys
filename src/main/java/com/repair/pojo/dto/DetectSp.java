package com.repair.pojo.dto;



public class DetectSp {
    private String deviceClass;
    private String firstAddr;
    private String secondAddr;

    public DetectSp(String deviceClass, String firstAddr, String secondAddr) {
        this.deviceClass = deviceClass;
        this.firstAddr = firstAddr;
        this.secondAddr = secondAddr;
    }

    public String getFirstAddr() {
        return firstAddr;

    }

    public void setFirstAddr(String firstAddr) {
        this.firstAddr = firstAddr;
    }

    public DetectSp() {
    }

    public String getSecondAddr() {
        return secondAddr;
    }

    public void setSecondAddr(String secondAddr) {
        this.secondAddr = secondAddr;
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }

    @Override
    public String toString() {
        return "DetectSp{" +
                "deviceClass='" + deviceClass + '\'' +
                ", firstAddr='" + firstAddr + '\'' +
                ", secondAddr='" + secondAddr + '\'' +
                '}';
    }
}
