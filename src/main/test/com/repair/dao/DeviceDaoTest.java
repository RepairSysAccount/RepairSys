package com.repair.dao;

import com.repair.dao.DeviceDao;
import com.repair.entity.dictionary.RepairDict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-dao.xml")
public class DeviceDaoTest {
    @Autowired
    private DeviceDao deviceDao;

    @Test
    public void getDeviceClass() throws Exception {
        List<String> deviceClassList = deviceDao.getDeviceClass(1000,1000);
        System.out.println(deviceClassList);
    }


    @Test
    public void getDeviceClassDict() {
//        List<RepairDict> dicts=deviceDao.getDeviceRepairDict("紫外线灯");
        List<RepairDict> dicts=deviceDao.getDeviceRepairDict();
        for(RepairDict dict:dicts) {
            System.out.println(dict);
        }
    }

    @Test
    public void getDeviceProblem() {
        List<String> dicts=deviceDao.getDeviceProblem("紫外线灯");
        for(String dict:dicts) {
            System.out.println(dict);
        }
    }



    @Test
    public void getDeviceSolution() {
        List<String> dicts=deviceDao.getDeviceSolution("紫外线灯","不亮");
        for(String dict:dicts) {
            System.out.println(dict);
        }
    }
}
