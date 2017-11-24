package com.repair.dao;

import com.repair.entity.reqrepair.ReqRecord;
import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml"})
public class ReqRecordsDAOTest {

    @Autowired
    private ReqRecordsDAO reqRecordsDAO;

    @Test
    public void insertReqRecord() throws Exception {

        reqRecordsDAO.InsertReqRecord(new ReqRecord("紫外线灯",1005,"sad","asd",
                "asd",1,
                1,new Timestamp(122134),new Timestamp(21387),1,
                false,false,"asd","asdhjk"));

    }

    @Test
    public void getAllReqRecords() {
        List<ReqRecord> reqRecords=reqRecordsDAO.getAllReqRecord();
        for(ReqRecord reqRecord:reqRecords) {
            System.out.println(reqRecord);
        }
    }

}