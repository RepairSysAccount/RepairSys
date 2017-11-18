package com.repair.dao;

import com.repair.pojo.FirstAddr;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/spring-*.xml")
public class FirstAddrMapperTest {
    @Resource
    private FirstAddrMapper firstAddrMapper;


    @Test
    public void selectByPrimaryKey() throws Exception {
        FirstAddr firstAddr=firstAddrMapper.selectByPrimaryKey(1000);
        System.out.println(firstAddr.getName());
    }

}