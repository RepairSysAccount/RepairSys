package com.repair.entity.detect;



public class DetectSp {
    private Integer firstAddrNo;
    private Integer secondAddrNo;
    private String deviceClass;
    private String firstAddr;
    private String secondAddr;
    private Integer detectNumber;

    public DetectSp() {
    }

    public DetectSp(Integer firstAddrNo, Integer secondAddrNo, String deviceClass, String firstAddr, String secondAddr, Integer detectNumber) {
        this.firstAddrNo = firstAddrNo;
        this.secondAddrNo = secondAddrNo;
        this.deviceClass = deviceClass;
        this.firstAddr = firstAddr;
        this.secondAddr = secondAddr;
        this.detectNumber = detectNumber;
    }

    public Integer getFirstAddrNo() {
        return firstAddrNo;
    }

    public void setFirstAddrNo(Integer firstAddrNo) {
        this.firstAddrNo = firstAddrNo;
    }

    public Integer getSecondAddrNo() {
        return secondAddrNo;
    }

    public void setSecondAddrNo(Integer secondAddrNo) {
        this.secondAddrNo = secondAddrNo;
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

    @Override
    public String toString() {
        return "DetectSp{" +
                "firstAddrNo=" + firstAddrNo +
                ", secondAddrNo=" + secondAddrNo +
                ", deviceClass='" + deviceClass + '\'' +
                ", firstAddr='" + firstAddr + '\'' +
                ", secondAddr='" + secondAddr + '\'' +
                ", detectNumber=" + detectNumber +
                '}';
    }
}
