package com.repair.entity.address;

/**
 * 一个地点,包括一级地点和二级地点
 */
public class Address {
    private String firstAddr;
    private String secondAddr;

    public Address() {
    }

    public Address(String firstAddr, String secondAddr) {
        this.firstAddr = firstAddr;
        this.secondAddr = secondAddr;
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

    @Override
    public String toString() {
        return "Address{" +
                "firstAddr='" + firstAddr + '\'' +
                ", secondAddr='" + secondAddr + '\'' +
                '}';
    }
}
