package com.repair.dao;

import com.repair.pojo.dto.DetectSp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class DetectSpPlanMapperTest {
    @Resource
    DetectSpPlanMapper detectSpPlanMapper;
    @Test
    public void selectAllDetectSp() throws Exception {
        List<DetectSp> detectSp= detectSpPlanMapper.getAllDetectSp();
        for(DetectSp sd:detectSp){
            System.out.println(sd);
        }
    }

}