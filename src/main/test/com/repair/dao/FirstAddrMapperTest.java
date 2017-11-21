package com.repair.dao;

import com.repair.pojo.FirstAddr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class FirstAddrMapperTest {
    @Resource
    private FirstAddrMapper firstAddrMapper;
    @Test
    public void getAllFirstAddr() throws Exception {
        List<FirstAddr> firstAddrs=firstAddrMapper.getAllFirstAddr();
        for(FirstAddr firstAddr:firstAddrs) {
            System.out.println(firstAddr);
        }
    }
}