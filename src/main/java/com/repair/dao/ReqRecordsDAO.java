package com.repair.dao;

import com.repair.entity.reqrepair.ReqRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReqRecordsDAO {

    /**
     * 插入报修记录
     * @param reqRecord
     */
    void InsertReqRecord(@Param("reqRecord")ReqRecord reqRecord);

    /**
     * 查询所有报修记录
     * @return
     */
    List<ReqRecord> getAllReqRecord();


    Integer getAddressDeviceNum();
}
