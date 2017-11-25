package com.repair.service;

import com.repair.entity.dictionary.RepairDict;
import com.repair.entity.man.ReqMan;

import java.util.List;

public interface ReqRepairService {


    /**
     * 获取所有的维修字典
     * @return
     */
    List<RepairDict> getDeviceRepairDict();

    /**
     * 获取报修设备在维修字典中已经收录的可能出现的问题
     * @param deviceClass
     * @return
     */
    List<String> getDeviceProblem(String deviceClass);

    /**
     * 获取指定设备指定问题的解决方案
     * @param deviceClass
     * @param problem
     * @return
     */
    List<String> getDeviceSolution(String deviceClass, String problem);



    /**
     * 获取指定工号的报修人
     * @param jobNumber
     * @return
     */
    ReqMan getReqMan(Integer jobNumber);


    /**
     * 获取指定地点的设备数量
     * @param firstAddr
     * @param secondAddr
     * @return
     */
    Integer getAddressDeviceNum(Integer firstAddr,Integer secondAddr);


    /**
     * 获取指定地点的设备种类数量
     * @param firstAddr
     * @param secondAddr
     * @return
     */
    Integer getAddressClassNum(Integer firstAddr, Integer secondAddr);
}
