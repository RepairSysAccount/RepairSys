package com.repair.dao;

import com.repair.entity.dictionary.RepairDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *设备的接口
 */
public interface DeviceDao {

    /**
     * 根据一级地点和二级地点获取所有的设备类型
     * @return
     */
    List<String> getDeviceClass(@Param("firstId")Integer firstId, @Param("secondId")Integer secondId);




//    List<RepairDict> getDeviceRepairDict(@Param("deviceClass") String deviceClass);


    /**
     * 获取所有的维修字典
     * @return
     */
    List<RepairDict> getDeviceRepairDict();


    /**
     * 获取指定设备会出的问题
     * @param deviceClass
     * @return
     */
    List<String> getDeviceProblem(@Param("deviceClass") String deviceClass);


    /**
     * 获取指定设备指定问题的解决方案
     * @param deviceClass
     * @param problem
     * @return
     */
    List<String> getDeviceSolution(@Param("deviceClass") String deviceClass,@Param("problem") String problem);


}
