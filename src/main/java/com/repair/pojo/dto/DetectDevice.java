package com.repair.pojo.dto;

/**
 * 巡检的设备类
 */
public class DetectDevice {
    private String name;

    private Integer state;

    private String mark;

    public DetectDevice() {
    }

    public DetectDevice(String name, Integer state, String mark) {
        this.name = name;
        this.state = state;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", state=" + state +
                ", mark='" + mark + '\'' +
                '}';
    }
}
