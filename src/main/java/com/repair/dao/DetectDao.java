package com.repair.dao;

import com.repair.entity.Detect;
import com.repair.entity.DetectDevice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 查询巡检计划的决口
 */
public interface DetectDao {

    //获取已经完成的巡检
    List<Detect> getFinishDetect();

    //获取未完成的巡检
    List<Detect> getUnfinishDetect();

    //根据巡检计划获取某一次巡检的所有设备
    List<DetectDevice> getDetectDevices(@Param("detectId")Integer detectId);


}
