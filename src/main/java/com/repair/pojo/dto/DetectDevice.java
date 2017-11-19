package com.repair.pojo.dto;

/**
 * 巡检的设备类
 */
public class DetectDevice {
    private String deviceClass;

    private Integer state;

    private String mark;

    public DetectDevice() {
    }

    public DetectDevice(String device_class, Integer state, String mark) {
        this.deviceClass = device_class;
        this.state = state;
        this.mark = mark;
    }

    public String getDevice_class() {
        return deviceClass;
    }

    public void setDevice_class(String device_class) {
        this.deviceClass = device_class;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "DetectDevice{" +
                "device_class='" + deviceClass + '\'' +
                ", state=" + state +
                ", mark='" + mark + '\'' +
                '}';
    }
}
