package com.repair.dao;

import com.repair.dao.DetectDao;
import com.repair.entity.detect.Detect;
import com.repair.entity.detect.DetectDevice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-dao.xml")
public class DetectDaoTest {
    @Autowired
    private DetectDao detectDao;

    @Test
    public void getFinishDetect() throws Exception {
        List<Detect> detects =detectDao.getFinishDetect();
        for(Detect detect : detects)
            System.out.println(detect);
    }

    @Test
    public void getUnfinishDetect() throws Exception {
        List<Detect> detects =detectDao.getUnfinishDetect();
        for(Detect detect : detects)
            System.out.println(detect);
    }


    @Test
    public void insertDetect() throws Exception {
        Integer number = detectDao.insertDetect(1000,1000);
        System.out.println(number);
    }

    @Test
    public void setDetectState() throws Exception {
        detectDao.setDetectState(1002,1);
    }

    @Test
    public void insertDetectDevice() throws Exception {
        DetectDevice detectDevice = new DetectDevice();
        detectDevice.setDeviceClass("插座");
        detectDevice.setDeviceId(1008);
        detectDevice.setState(1);
        detectDao.insertDetectDevice(detectDevice,1000);
    }

    @Test
    public void getDetectDevices() throws Exception {
        List<DetectDevice> detectDevices = detectDao.getDetectDevices("插座",1000);
        for(DetectDevice detectDevice : detectDevices)
            System.out.println(detectDevice);
    }

    @Test
    public void updateDetectDevice() throws Exception {
        DetectDevice detectDevice = new DetectDevice();
        detectDevice.setState(2);
        detectDevice.setDeviceId(1000);
        detectDao.updateDetectDevice(detectDevice,1000);
    }

    @Test
    public void getDetectNum() throws Exception {
        System.out.println(detectDao.getDetectNum(1000));
    }

    @Test
    public void getDeviceClassByDetectId() throws Exception {
        List<String> list = detectDao.getDeviceClassByDetectId(1000);
        for(String s : list)
            System.out.println(s);
    }
}