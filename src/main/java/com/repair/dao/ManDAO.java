package com.repair.dao;

import com.repair.entity.man.ReqMan;
import org.apache.ibatis.annotations.Param;

public interface ManDAO {

    /**
     * 根据工号查询报修人
     * @param jobNumber
     * @return
     */
    ReqMan getReqMan(@Param("jobNumber") Integer jobNumber);
}
