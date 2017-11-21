package com.repair.entity.address;

/**
 * 一级地点
 */
public class FirstAddress {
    private Integer firstNo;

    private String name;

    private String qrCodeUrl;

    public FirstAddress() {
    }

    public FirstAddress(Integer firstNo, String name, String qrCodeUrl) {
        this.firstNo = firstNo;
        this.name = name;
        this.qrCodeUrl = qrCodeUrl;
    }

    public Integer getFirstNo() {
        return firstNo;
    }

    public void setFirstNo(Integer firstNo) {
        this.firstNo = firstNo;
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
        return "FirstAddress{" +
                "firstNo=" + firstNo +
                ", name='" + name + '\'' +
                ", qrCodeUrl='" + qrCodeUrl + '\'' +
                '}';
    }
}
