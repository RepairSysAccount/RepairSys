package com.repair.entity.detect;



public class DetectSp {
    private String deviceClass;
    private String firstAddr;
    private String secondAddr;
    private Integer detectNumber;

    public DetectSp() {
    }

    public DetectSp(String deviceClass, String firstAddr, String secondAddr, Integer detectNumber) {
        this.deviceClass = deviceClass;
        this.firstAddr = firstAddr;
        this.secondAddr = secondAddr;
        this.detectNumber = detectNumber;

    }

    @Override
    public String toString() {
        return "DetectSp{" +
                "deviceClass='" + deviceClass + '\'' +
                ", firstAddr='" + firstAddr + '\'' +
                ", secondAddr='" + secondAddr + '\'' +
                ", detectNumber=" + detectNumber +
                '}';
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }

    public String getFirstAddr() {
        return firstAddr;
    }

    public void setFirstAddr(String firstAddr) {
        this.firstAddr = firstAddr;
    }

    public String getSecondAddr() {
        return secondAddr;
    }

    public void setSecondAddr(String secondAddr) {
        this.secondAddr = secondAddr;
    }

    public Integer getDetectNumber() {
        return detectNumber;
    }

    public void setDetectNumber(Integer detectNumber) {
        this.detectNumber = detectNumber;
    }
}
