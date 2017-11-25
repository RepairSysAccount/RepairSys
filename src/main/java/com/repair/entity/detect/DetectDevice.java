package com.repair.entity.detect;

/**
 * 巡检的设备
 */
public class DetectDevice {
   private String deviceClass;
   private Integer state;
   private Integer deviceId;

    public DetectDevice() {
    }

    public DetectDevice(String deviceClass,  Integer state, Integer deviceId) {
        this.deviceClass = deviceClass;
        this.state = state;
        this.deviceId = deviceId;
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "DetectDevice{" +
                "deviceClass='" + deviceClass + '\'' +
                ", state=" + state +
                ", deviceId=" + deviceId +
                '}';
    }
}
