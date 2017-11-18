package com.repair.pojo;

public class DetectDevicesKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_detectdevices.device_id
     *
     * @mbggenerated
     */
    private Integer deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_detectdevices.detect_id
     *
     * @mbggenerated
     */
    private Integer detectId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detectdevices
     *
     * @mbggenerated
     */
    public DetectDevicesKey(Integer deviceId, Integer detectId) {
        this.deviceId = deviceId;
        this.detectId = detectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_detectdevices
     *
     * @mbggenerated
     */
    public DetectDevicesKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_detectdevices.device_id
     *
     * @return the value of tb_detectdevices.device_id
     *
     * @mbggenerated
     */
    public Integer getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_detectdevices.device_id
     *
     * @param deviceId the value for tb_detectdevices.device_id
     *
     * @mbggenerated
     */
    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_detectdevices.detect_id
     *
     * @return the value of tb_detectdevices.detect_id
     *
     * @mbggenerated
     */
    public Integer getDetectId() {
        return detectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_detectdevices.detect_id
     *
     * @param detectId the value for tb_detectdevices.detect_id
     *
     * @mbggenerated
     */
    public void setDetectId(Integer detectId) {
        this.detectId = detectId;
    }
}