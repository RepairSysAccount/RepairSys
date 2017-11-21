package com.repair.entity;

/**
 * 巡检的设备
 */
public class DetectDevice {
    private String deviceClass;

    private String mark;

    private int normal;

    private int repairing;

    private int broken;

    public DetectDevice() {
    }

    public DetectDevice(String deviceClass, String mark, int normal, int repairing, int broken) {
        this.deviceClass = deviceClass;
        this.mark = mark;
        this.normal = normal;
        this.repairing = repairing;
        this.broken = broken;
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getNormal() {
        return normal;
    }

    public void setNormal(int normal) {
        this.normal = normal;
    }

    public int getRepairing() {
        return repairing;
    }

    public void setRepairing(int repairing) {
        this.repairing = repairing;
    }

    public int getBroken() {
        return broken;
    }

    public void setBroken(int broken) {
        this.broken = broken;
    }

    @Override
    public String toString() {
        return "DetectDevice{" +
                "deviceClass='" + deviceClass + '\'' +
                ", mark='" + mark + '\'' +
                ", normal=" + normal +
                ", repairing=" + repairing +
                ", broken=" + broken +
                '}';
    }
}
