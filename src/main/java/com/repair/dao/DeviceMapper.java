package com.repair.dao;

import com.repair.pojo.Device;

public interface DeviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Device
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer deviceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Device
     *
     * @mbggenerated
     */
    int insert(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Device
     *
     * @mbggenerated
     */
    int insertSelective(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Device
     *
     * @mbggenerated
     */
    Device selectByPrimaryKey(Integer deviceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Device
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Device
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Device record);
}