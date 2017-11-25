package com.repair.entity.record;

/**
 * 维修记录
 */
public class RepairRecord {
    private Integer reqNumber;
    private Integer repairTime; //维修所用时间 需要修改
    private int state;
    private String repairMan;
    private String taskMan;
    private String photo;

    public RepairRecord() {
    }

    public RepairRecord(Integer reqNumber, Integer repairTime, int state, String repairMan, String taskMan, String photo) {
        this.reqNumber = reqNumber;
        this.repairTime = repairTime;
        this.state = state;
        this.repairMan = repairMan;
        this.taskMan = taskMan;
        this.photo = photo;
    }

    public Integer getReqNumber() {
        return reqNumber;
    }

    public void setReqNumber(Integer reqNumber) {
        this.reqNumber = reqNumber;
    }

    public Integer getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Integer repairTime) {
        this.repairTime = repairTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRepairMan() {
        return repairMan;
    }

    public void setRepairMan(String repairMan) {
        this.repairMan = repairMan;
    }

    public String getTaskMan() {
        return taskMan;
    }

    public void setTaskMan(String taskMan) {
        this.taskMan = taskMan;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
