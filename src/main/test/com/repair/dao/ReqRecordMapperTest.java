package com.repair.dao;

import com.repair.pojo.ReqRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class ReqRecordMapperTest {
    @Resource
    private ReqRecordMapper reqRecordMapper;
    @Test
    public void selectAllReqRecord() throws Exception {
        List<ReqRecord> list=reqRecordMapper.getAllReqRecord();
        for(ReqRecord re:list) {
            System.out.println(re);
        }
    }

}