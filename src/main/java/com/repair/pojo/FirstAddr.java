package com.repair.pojo;

public class FirstAddr {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_firstaddr.first_no
     *
     * @mbggenerated
     */
    private Integer firstNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_firstaddr.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_firstaddr.qr_code_url
     *
     * @mbggenerated
     */
    private String qrCodeUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_firstaddr
     *
     * @mbggenerated
     */
    public FirstAddr(Integer firstNo, String name, String qrCodeUrl) {
        this.firstNo = firstNo;
        this.name = name;
        this.qrCodeUrl = qrCodeUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_firstaddr
     *
     * @mbggenerated
     */
    public FirstAddr() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_firstaddr.first_no
     *
     * @return the value of tb_firstaddr.first_no
     *
     * @mbggenerated
     */
    public Integer getFirstNo() {
        return firstNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_firstaddr.first_no
     *
     * @param firstNo the value for tb_firstaddr.first_no
     *
     * @mbggenerated
     */
    public void setFirstNo(Integer firstNo) {
        this.firstNo = firstNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_firstaddr.name
     *
     * @return the value of tb_firstaddr.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_firstaddr.name
     *
     * @param name the value for tb_firstaddr.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_firstaddr.qr_code_url
     *
     * @return the value of tb_firstaddr.qr_code_url
     *
     * @mbggenerated
     */
    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_firstaddr.qr_code_url
     *
     * @param qrCodeUrl the value for tb_firstaddr.qr_code_url
     *
     * @mbggenerated
     */
    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl == null ? null : qrCodeUrl.trim();
    }
}