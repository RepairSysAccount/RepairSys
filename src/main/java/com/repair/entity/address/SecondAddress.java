package com.repair.entity.address;

public class SecondAddress {
    private Integer secondNo;

    private String name;

    private String qrCodeUrl;

    public SecondAddress() {
    }

    public SecondAddress(Integer secondNo, String name, String qrCodeUrl) {
        this.secondNo = secondNo;
        this.name = name;
        this.qrCodeUrl = qrCodeUrl;
    }

    public Integer getSecondNo() {
        return secondNo;
    }

    public void setSecondNo(Integer secondNo) {
        this.secondNo = secondNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    @Override
    public String toString() {
        return "SecondAddress{" +
                "secondNo=" + secondNo +
                ", name='" + name + '\'' +
                ", qrCodeUrl='" + qrCodeUrl + '\'' +
                '}';
    }
}
