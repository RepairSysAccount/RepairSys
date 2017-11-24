package com.repair.dao;

import com.repair.entity.detect.Detect;
import com.repair.entity.detect.DetectDevice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 查询巡检计划的决口
 */
public interface DetectDao {

    /**
     *查询已经完成的巡检，状态为1
     */
    List<Detect> getFinishDetect();


    /**
     * 获取未完成的巡检 状态为0
     * @return
     */
    List<Detect> getUnfinishDetect();


    /**
     *根据巡检计划获取某一次巡检的所有设备及每个设备的状况
     * @param detectId 巡检计划id
     * @return
     */
    List<DetectDevice> getDetectDevices(@Param("detectId")Integer detectId);


    /**
     * 点击确定
     *插入巡检计划
     *插入的同时，获取插入的自增主键（巡检计划的编号）
     *再根据获取的主键值插入这个巡检计划的设备信息
     */
    Integer insertDetect(@Param("firstAddr")Integer firstAddr, @Param("secondAddr")Integer secondAddr);


    /**
     * 根据获取的巡检计划的编号插入设备
     * 保存一个巡检的每种设备的状况
     */
    void insertDetectDevice(@Param("detectDevice")DetectDevice detectDevice,@Param("detectId")Integer detectId);


    /**
     * 对一个进行中的巡检计划的设备的信息可以进行多次的修改
     */
    void updateDetectDevice(@Param("detectDevice")DetectDevice detectDevice, @Param("detectId") Integer detectId);


    /**
     * 改变巡检状态，用于将进行中的巡检计划改为完成和将未签名改为签名
     * @param id
     */
    void setDetectState(@Param("id")Integer id, @Param("state")Integer state);


    //签名
    void singature(@Param("detectId")Integer detectId);

}
