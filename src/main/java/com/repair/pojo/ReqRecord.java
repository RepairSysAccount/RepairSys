package com.repair.pojo;

import java.util.Date;

public class ReqRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.number
     *
     * @mbggenerated
     */
    private Long number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.device_class
     *
     * @mbggenerated
     */
    private String deviceClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.device_id
     *
     * @mbggenerated
     */
    private Integer deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.first_addr
     *
     * @mbggenerated
     */
    private String firstAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.second_addr
     *
     * @mbggenerated
     */
    private String secondAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.details
     *
     * @mbggenerated
     */
    private String details;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.request_man
     *
     * @mbggenerated
     */
    private String requestMan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.charge_man
     *
     * @mbggenerated
     */
    private String chargeMan;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.req_time
     *
     * @mbggenerated
     */
    private Date reqTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.finish_time
     *
     * @mbggenerated
     */
    private Date finishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.sources
     *
     * @mbggenerated
     */
    private Boolean sources;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.urgency_degree
     *
     * @mbggenerated
     */
    private Boolean urgencyDegree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_ReqRecords.photo
     *
     * @mbggenerated
     */
    private String photo;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ReqRecords
     *
     * @mbggenerated
     */
    public ReqRecord(Long number, String deviceClass, Integer deviceId, String firstAddr, String secondAddr, String details, String requestMan, String chargeMan, Date reqTime, Date finishTime, Integer state, Boolean sources, Boolean urgencyDegree, String remark, String photo) {
        this.number = number;
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ReqRecords
     *
     * @mbggenerated
     */
    public ReqRecord() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.number
     *
     * @return the value of tb_ReqRecords.number
     *
     * @mbggenerated
     */
    public Long getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.number
     *
     * @param number the value for tb_ReqRecords.number
     *
     * @mbggenerated
     */
    public void setNumber(Long number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.device_class
     *
     * @return the value of tb_ReqRecords.device_class
     *
     * @mbggenerated
     */
    public String getDeviceClass() {
        return deviceClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.device_class
     *
     * @param deviceClass the value for tb_ReqRecords.device_class
     *
     * @mbggenerated
     */
    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass == null ? null : deviceClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.device_id
     *
     * @return the value of tb_ReqRecords.device_id
     *
     * @mbggenerated
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.device_id
     *
     * @param deviceId the value for tb_ReqRecords.device_id
     *
     * @mbggenerated
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.first_addr
     *
     * @return the value of tb_ReqRecords.first_addr
     *
     * @mbggenerated
     */
    public String getFirstAddr() {
        return firstAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.first_addr
     *
     * @param firstAddr the value for tb_ReqRecords.first_addr
     *
     * @mbggenerated
     */
    public void setFirstAddr(String firstAddr) {
        this.firstAddr = firstAddr == null ? null : firstAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.second_addr
     *
     * @return the value of tb_ReqRecords.second_addr
     *
     * @mbggenerated
     */
    public String getSecondAddr() {
        return secondAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.second_addr
     *
     * @param secondAddr the value for tb_ReqRecords.second_addr
     *
     * @mbggenerated
     */
    public void setSecondAddr(String secondAddr) {
        this.secondAddr = secondAddr == null ? null : secondAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.details
     *
     * @return the value of tb_ReqRecords.details
     *
     * @mbggenerated
     */
    public String getDetails() {
        return details;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.details
     *
     * @param details the value for tb_ReqRecords.details
     *
     * @mbggenerated
     */
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.request_man
     *
     * @return the value of tb_ReqRecords.request_man
     *
     * @mbggenerated
     */
    public String getRequestMan() {
        return requestMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.request_man
     *
     * @param requestMan the value for tb_ReqRecords.request_man
     *
     * @mbggenerated
     */
    public void setRequestMan(String requestMan) {
        this.requestMan = requestMan == null ? null : requestMan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.charge_man
     *
     * @return the value of tb_ReqRecords.charge_man
     *
     * @mbggenerated
     */
    public String getChargeMan() {
        return chargeMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.charge_man
     *
     * @param chargeMan the value for tb_ReqRecords.charge_man
     *
     * @mbggenerated
     */
    public void setChargeMan(String chargeMan) {
        this.chargeMan = chargeMan == null ? null : chargeMan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.req_time
     *
     * @return the value of tb_ReqRecords.req_time
     *
     * @mbggenerated
     */
    public Date getReqTime() {
        return reqTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.req_time
     *
     * @param reqTime the value for tb_ReqRecords.req_time
     *
     * @mbggenerated
     */
    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.finish_time
     *
     * @return the value of tb_ReqRecords.finish_time
     *
     * @mbggenerated
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.finish_time
     *
     * @param finishTime the value for tb_ReqRecords.finish_time
     *
     * @mbggenerated
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.state
     *
     * @return the value of tb_ReqRecords.state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.state
     *
     * @param state the value for tb_ReqRecords.state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.sources
     *
     * @return the value of tb_ReqRecords.sources
     *
     * @mbggenerated
     */
    public Boolean getSources() {
        return sources;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.sources
     *
     * @param sources the value for tb_ReqRecords.sources
     *
     * @mbggenerated
     */
    public void setSources(Boolean sources) {
        this.sources = sources;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.urgency_degree
     *
     * @return the value of tb_ReqRecords.urgency_degree
     *
     * @mbggenerated
     */
    public Boolean getUrgencyDegree() {
        return urgencyDegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.urgency_degree
     *
     * @param urgencyDegree the value for tb_ReqRecords.urgency_degree
     *
     * @mbggenerated
     */
    public void setUrgencyDegree(Boolean urgencyDegree) {
        this.urgencyDegree = urgencyDegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.remark
     *
     * @return the value of tb_ReqRecords.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.remark
     *
     * @param remark the value for tb_ReqRecords.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        return "ReqRecord{" +
                "number=" + number +
                ", deviceClass='" + deviceClass + '\'' +
                ", firstAddr='" + firstAddr + '\'' +
                ", secondAddr='" + secondAddr + '\'' +
                ", details='" + details + '\'' +
                ", requestMan='" + requestMan + '\'' +
                ", chargeMan='" + chargeMan + '\'' +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_ReqRecords.photo
     *
     * @return the value of tb_ReqRecords.photo
     *
     * @mbggenerated
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_ReqRecords.photo
     *
     * @param photo the value for tb_ReqRecords.photo
     *
     * @mbggenerated
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}