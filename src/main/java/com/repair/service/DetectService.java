package com.repair.service;

import com.repair.entity.address.Address;
import com.repair.entity.address.FirstAddress;
import com.repair.entity.address.SecondAddress;
import com.repair.entity.detect.Detect;
import com.repair.entity.detect.DetectDevice;

import java.util.List;

/**
 * 巡查计划service
 */
public interface DetectService {

    /**
     * 查询已完成的巡检列表
     * 状态为1
     */
    List<Detect> finishDetect();


    /**
     * 进行中的巡检列表
     * 状态为0
     */
    List<Detect> getUnfinishDetect();


    /**
     * 根据巡检计划id获取巡检计划的设备信息
     * @param detectId
     * @return
     */
    List<DetectDevice> getDetectDevices(String deviceClass, Integer detectId);


    /**
     * 点击确定
     *插入巡检计划
     *插入的同时，获取插入的自增主键（巡检计划的编号）
     *再根据获取的主键值插入这个巡检计划的设备信息
     */
    Integer insertDetect(Integer firstAddr, Integer secondAddr);


    /**
     * 根据获取的巡检计划的编号插入设备
     * 保存一个巡检的每种设备的状况
     */
    void insertDetectDevice(DetectDevice detectDevice,Integer detectId);


    /**
     * 对一个进行中的巡检计划的设备的信息可以进行多次的修改
     */
    void updateDetectDevice(DetectDevice detectDevice,Integer detectId);


    /**
     * 改变巡检状态，用于将进行中的巡检计划改为完成和将未签名改为签名
     * @param id
     */
    void setDetectState(Integer id, Integer state);

    /**
     * 根据巡检计划获取设备类型
     */
    List<String> getDeviceClassByDetectId(Integer detectId);


    /**
     * 根据一级地点和二级地点获取所有的设备类型
     * @return
     */
    List<String> getDeviceClass(Integer firstId, Integer secondId);


    /**
     * 根据巡检计划查询已检数量
     * @param detectId
     * @return
     */
    Integer getDetectNum(Integer detectId);



    //获取全部一级地址
    List<FirstAddress> getAllFirstAddress();

    //根据一级地址获取二级地址
    List<SecondAddress> getSecondAddress(Integer id);

    //根据一级地点查处二级地点的数量
    Integer getSecondAddrNum(Integer id);

    //签名 将巡检计划的state改为2
    void singature(Integer detectId);

    //根据巡检id获取详细的地点,包括一级地点和二级地点
    Address getAddressByDetectId(Integer detectId);

}
