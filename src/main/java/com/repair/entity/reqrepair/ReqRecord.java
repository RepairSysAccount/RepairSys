package com.repair.entity.reqrepair;

import java.sql.Timestamp;

public class ReqRecord {
    private Integer number;
    private String deviceClass;
    private Integer deviceId;
    private String firstAddr;
    private String secondAddr;
    private String details;
    private Integer requestMan;
    private Integer chargeMan;
    private Timestamp reqTime;
    private Timestamp finishTime;
    private Integer state;
    private Boolean sources;
    private Boolean urgencyDegree;
    private String remark;
    private String photo;

    public ReqRecord() {
    }

    public ReqRecord(String deviceClass, Integer deviceId, String firstAddr, String secondAddr, String details, Integer requestMan, Integer chargeMan, Timestamp reqTime, Timestamp finishTime, Integer state, Boolean sources, Boolean urgencyDegree, String remark, String photo) {
        this.deviceClass = deviceClass;
        this.deviceId = deviceId;
        this.firstAddr = firstAddr;
        this.secondAddr = secondAddr;
        this.details = details;
        this.requestMan = requestMan;
        this.chargeMan = chargeMan;
        this.reqTime = reqTime;
        this.finishTime = finishTime;
        this.state = state;
        this.sources = sources;
        this.urgencyDegree = urgencyDegree;
        this.remark = remark;
        this.photo = photo;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getRequestMan() {
        return requestMan;
    }

    public void setRequestMan(Integer requestMan) {
        this.requestMan = requestMan;
    }

    public Integer getChargeMan() {
        return chargeMan;
    }

    public void setChargeMan(Integer chargeMan) {
        this.chargeMan = chargeMan;
    }

    public Timestamp getReqTime() {
        return reqTime;
    }

    public void setReqTime(Timestamp reqTime) {
        this.reqTime = reqTime;
    }

    public Timestamp getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Boolean getSources() {
        return sources;
    }

    public void setSources(Boolean sources) {
        this.sources = sources;
    }

    public Boolean getUrgencyDegree() {
        return urgencyDegree;
    }

    public void setUrgencyDegree(Boolean urgencyDegree) {
        this.urgencyDegree = urgencyDegree;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "ReqRecord{" +
                "number=" + number +
                ", deviceClass='" + deviceClass + '\'' +
                ", deviceId=" + deviceId +
                ", firstAddr='" + firstAddr + '\'' +
                ", secondAddr='" + secondAddr + '\'' +
                ", details='" + details + '\'' +
                ", requestMan=" + requestMan +
                ", chargeMan=" + chargeMan +
                ", reqTime=" + reqTime +
                ", finishTime=" + finishTime +
                ", state=" + state +
                ", sources=" + sources +
                ", urgencyDegree=" + urgencyDegree +
                ", remark='" + remark + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
