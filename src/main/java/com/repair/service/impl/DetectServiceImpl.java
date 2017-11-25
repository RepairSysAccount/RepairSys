package com.repair.service.impl;

import com.repair.dao.AddressDao;
import com.repair.dao.DetectDao;
import com.repair.dao.DeviceDao;
import com.repair.entity.address.Address;
import com.repair.entity.address.FirstAddress;
import com.repair.entity.address.SecondAddress;
import com.repair.entity.detect.Detect;
import com.repair.entity.detect.DetectDevice;
import com.repair.service.DetectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetectServiceImpl implements DetectService {

    @Autowired
    private DetectDao detectDao;
    @Autowired
    private AddressDao addressDao;
    @Autowired
    private DeviceDao deviceDao;

    @Override
    public List<Detect> finishDetect() {
        return detectDao.getFinishDetect();
    }

    @Override
    public List<Detect> getUnfinishDetect() {
        return detectDao.getUnfinishDetect();
    }


    @Override
    public List<DetectDevice> getDetectDevices(String deviceClass, Integer detectId) {
        return detectDao.getDetectDevices(deviceClass,detectId);
    }

    @Override
    public Integer insertDetect(Integer firstAddr, Integer secondAddr) {
        return detectDao.insertDetect(firstAddr,secondAddr);
    }

    @Override
    public void insertDetectDevice(DetectDevice detectDevice, Integer detectId) {
        detectDao.insertDetectDevice(detectDevice,detectId);
    }

    @Override
    public void updateDetectDevice(DetectDevice detectDevice, Integer detectId) {
        detectDao.updateDetectDevice(detectDevice,detectId);
    }

    @Override
    public void setDetectState(Integer id, Integer state) {
        detectDao.setDetectState(id, state);
    }

    @Override
    public List<String> getDeviceClassByDetectId(Integer detectId) {
        return detectDao.getDeviceClassByDetectId(detectId);
    }

    @Override
    public List<String> getDeviceClass(Integer firstId, Integer secondId) {
        return deviceDao.getDeviceClass(firstId,secondId);
    }

    @Override
    public List<FirstAddress> getAllFirstAddress() {
        return addressDao.getAllFirstAddress();
    }

    @Override
    public List<SecondAddress> getSecondAddress(Integer id) {
        return addressDao.getSecondAddress(id);
    }

    @Override
    public Integer getSecondAddrNum(Integer id) {
        return addressDao.getSecondAddrNum(id);
    }

    @Override
    public void singature(Integer detectId) {
        detectDao.singature(detectId);
    }

    @Override
    public Address getAddressByDetectId(Integer detectId) {
        return addressDao.getAddressByDetectId(detectId);
    }

    @Override
    public Integer getDetectNum(Integer detectId) {
        return  detectDao.getDetectNum(detectId);
    }
}
