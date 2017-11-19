package com.repair.dao;

import com.repair.pojo.DetectPlan;
import com.repair.pojo.dto.Detect;
import com.repair.pojo.dto.DetectDevice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DetectPlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Detect
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Detect
     *
     * @mbggenerated
     */
    int insert(DetectPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Detect
     *
     * @mbggenerated
     */
    int insertSelective(DetectPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Detect
     *
     * @mbggenerated
     */
    DetectPlan selectByPrimaryKey(Integer number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Detect
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DetectPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_Detect
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DetectPlan record);

    /**
     *获取已完成的巡检计划
     * @return
     */
    List<Detect> getFinishDetectPlan();

    /**
     * 获取未完成的巡检列表
     */
    List<Detect> getUnFinishDetectPlan();


    /**
     * 获取某次巡检的所有设备
     */
    List<DetectDevice> getDetectDeviceByDetectId(@Param("id") Integer id);


}