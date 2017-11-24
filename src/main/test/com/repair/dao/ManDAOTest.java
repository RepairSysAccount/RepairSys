package com.repair.dao;

import com.repair.entity.man.ReqMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class ManDAOTest {
    @Autowired
    private ManDAO manDAO;
    @Test
    public void getReqMan() throws Exception {
        ReqMan reqMan=manDAO.getReqMan(1000);
        System.out.println(reqMan);
    }

}