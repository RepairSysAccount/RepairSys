package com.repair.dao;

import com.repair.pojo.DetectPlan;
import com.repair.pojo.dto.Detect;
import com.repair.pojo.dto.DetectDevice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-dao.xml")
public class DetectPlanMapperTest {
    @Autowired
    private DetectPlanMapper detectPlanMapper;

    @Test
    public void testFinishDetectPlan(){
        List<Detect> detects = detectPlanMapper.getFinishDetectPlan();
        for(Detect detect : detects)
            System.out.println(detect);
    }

    @Test
    public void testUnFnishDetectPlan(){
        List<Detect> detects = detectPlanMapper.getUnFinishDetectPlan();
        for(Detect detect : detects)
            System.out.println(detect);
    }

    @Test
    public void testGetDetectDeviceByDetectId(){
        List<DetectDevice> detectDevices = detectPlanMapper.getDetectDeviceByDetectId(1000);
        for(DetectDevice detectDevice : detectDevices)
            System.out.println(detectDevice.toString());
    }
}

