package com.repair.dao;

import com.repair.pojo.DeviceClass;

public interface DeviceClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_DeviceClass
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_DeviceClass
     *
     * @mbggenerated
     */
    int insert(DeviceClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_DeviceClass
     *
     * @mbggenerated
     */
    int insertSelective(DeviceClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_DeviceClass
     *
     * @mbggenerated
     */
    DeviceClass selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_DeviceClass
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DeviceClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_DeviceClass
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DeviceClass record);
}