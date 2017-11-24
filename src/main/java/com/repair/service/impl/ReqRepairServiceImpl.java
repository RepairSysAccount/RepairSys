package com.repair.service.impl;

import com.repair.dao.DeviceDao;
import com.repair.dao.ManDAO;
import com.repair.dao.ReqRecordsDAO;
import com.repair.entity.dictionary.RepairDict;
import com.repair.entity.man.ReqMan;
import com.repair.service.ReqRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReqRepairServiceImpl implements ReqRepairService{

    @Autowired
    private ReqRecordsDAO reqRecordsDAO;

    @Autowired
    private DeviceDao deviceDao;

    @Autowired
    private ManDAO manDAO;


    @Override
    public List<RepairDict> getDeviceRepairDict() {
        return deviceDao.getDeviceRepairDict();
    }

    @Override
    public List<String> getDeviceProblem(String deviceClass) {
        return deviceDao.getDeviceProblem(deviceClass);
    }

    @Override
    public List<String> getDeviceSolution(String deviceClass, String problem) {
        return deviceDao.getDeviceSolution(deviceClass,problem);
    }


    @Override
    public ReqMan getReqMan(Integer jobNumber) {
        return manDAO.getReqMan(jobNumber);
    }
}
