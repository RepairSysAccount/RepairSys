package com.repair.dao;

import com.repair.entity.detect.DetectSp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class DetectSpDAOTest {
    @Resource
    private DetectSpDAO detectSpDAO;
    @Test
    public void getAllDetectSp() throws Exception {
        List<DetectSp> detectSp=detectSpDAO.getAllDetectSp();
        for(DetectSp ds:detectSp)
            System.out.println(ds);
    }
}

