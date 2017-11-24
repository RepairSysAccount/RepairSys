package com.repair.service;

import com.repair.entity.dictionary.RepairDict;

import java.util.List;

public interface ReqRepairService {

    List<RepairDict> getDeviceRepairDict();

//    List<String> getDeviceSolution(String deviceClass,String problem);

    List<String> getDeviceProblem(String deviceClass);


    List<RepairDict> getDeviceSolution();
}
