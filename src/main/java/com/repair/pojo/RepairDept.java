package com.repair.pojo;

public class RepairDept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repairdept.dept_id
     *
     * @mbggenerated
     */
    private Integer deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_repairdept.dept_name
     *
     * @mbggenerated
     */
    private String deptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_repairdept
     *
     * @mbggenerated
     */
    public RepairDept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_repairdept
     *
     * @mbggenerated
     */
    public RepairDept() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repairdept.dept_id
     *
     * @return the value of tb_repairdept.dept_id
     *
     * @mbggenerated
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repairdept.dept_id
     *
     * @param deptId the value for tb_repairdept.dept_id
     *
     * @mbggenerated
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_repairdept.dept_name
     *
     * @return the value of tb_repairdept.dept_name
     *
     * @mbggenerated
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_repairdept.dept_name
     *
     * @param deptName the value for tb_repairdept.dept_name
     *
     * @mbggenerated
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}