package com.repair.dao;

import com.repair.entity.man.ReqMan;
import org.apache.ibatis.annotations.Param;

public interface ManDAO {

    ReqMan getReqMan(@Param("jobNumber") Integer jobNumber);
}
