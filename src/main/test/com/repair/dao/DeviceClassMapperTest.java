package com.repair.dao;

import com.repair.pojo.DeviceClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class DeviceClassMapperTest {
    @Resource
    private DeviceClassMapper deviceClassMapper;
    @Test
    public void selectAllDevices() throws Exception {
        List<DeviceClass> list=deviceClassMapper.getAllDevices();
        for(DeviceClass deviceClass:list) {
            System.out.println(deviceClass);
        }
    }

}