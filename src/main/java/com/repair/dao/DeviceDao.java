package com.repair.dao;

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

}
