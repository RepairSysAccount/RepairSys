package com.repair.service;

import com.repair.entity.dictionary.RepairDict;

import java.util.List;

public interface ReqRepairService {

    List<RepairDict> getDeviceRepairDict();

    /**
     * 获取
     * @param deviceClass
     * @return
     */
    List<String> getDeviceProblem(String deviceClass);


    List<RepairDict> getDeviceSolution();
}
