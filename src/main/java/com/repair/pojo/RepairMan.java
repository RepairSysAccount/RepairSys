package com.repair.pojo;

public class RepairMan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repairman.job_number
     *
     * @mbggenerated
     */
    private Integer jobNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repairman.dept_number
     *
     * @mbggenerated
     */
    private Integer deptNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repairman.phone
     *
     * @mbggenerated
     */
    private Long phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repairman.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_repairman
     *
     * @mbggenerated
     */
    public RepairMan(Integer jobNumber, Integer deptNumber, Long phone, String name) {
        this.jobNumber = jobNumber;
        this.deptNumber = deptNumber;
        this.phone = phone;
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_repairman
     *
     * @mbggenerated
     */
    public RepairMan() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repairman.job_number
     *
     * @return the value of tb_repairman.job_number
     *
     * @mbggenerated
     */
    public Integer getJobNumber() {
        return jobNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repairman.job_number
     *
     * @param jobNumber the value for tb_repairman.job_number
     *
     * @mbggenerated
     */
    public void setJobNumber(Integer jobNumber) {
        this.jobNumber = jobNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repairman.dept_number
     *
     * @return the value of tb_repairman.dept_number
     *
     * @mbggenerated
     */
    public Integer getDeptNumber() {
        return deptNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repairman.dept_number
     *
     * @param deptNumber the value for tb_repairman.dept_number
     *
     * @mbggenerated
     */
    public void setDeptNumber(Integer deptNumber) {
        this.deptNumber = deptNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repairman.phone
     *
     * @return the value of tb_repairman.phone
     *
     * @mbggenerated
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repairman.phone
     *
     * @param phone the value for tb_repairman.phone
     *
     * @mbggenerated
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repairman.name
     *
     * @return the value of tb_repairman.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repairman.name
     *
     * @param name the value for tb_repairman.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}