package com.repair.entity;

import java.util.Date;

/**
 * 巡检的实体类  给出巡检地点和巡检人员和时间
 */

public class Detect {
    private Integer number;

    private Integer state;

    private String firstLocation;

    private String secondLocation;

    private String detectMan;

    private Date startTime;

    public Detect() {
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Detect(Integer number, Integer state, String firstLocation, String secondLocation, String detectMan, Date startTime) {
        this.number = number;
        this.state = state;
        this.firstLocation = firstLocation;
        this.secondLocation = secondLocation;
        this.detectMan = detectMan;
        this.startTime = startTime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFirstLocation() {
        return firstLocation;
    }

    public void setFirstLocation(String firstLocation) {
        this.firstLocation = firstLocation;
    }

    public String getSecondLocation() {
        return secondLocation;
    }

    public void setSecondLocation(String secondLocation) {
        this.secondLocation = secondLocation;
    }

    public String getDetectMan() {
        return detectMan;
    }

    public void setDetectMan(String detectMan) {
        this.detectMan = detectMan;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Detect{" +
                "number=" + number +
                ", state=" + state +
                ", firstLocation='" + firstLocation + '\'' +
                ", secondLocation='" + secondLocation + '\'' +
                ", detectMan='" + detectMan + '\'' +
                ", startTime=" + startTime +
                '}';
    }
}
