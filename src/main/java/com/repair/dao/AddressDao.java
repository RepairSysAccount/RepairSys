package com.repair.dao;

import com.repair.entity.address.Address;
import com.repair.entity.address.FirstAddress;
import com.repair.entity.address.SecondAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 查询地址
 */
public interface AddressDao {

    //获取全部一级地址
    List<FirstAddress> getAllFirstAddress();

    //根据一级地址获取二级地址
    List<SecondAddress> getSecondAddress(@Param("id")Integer id);

    //根据一级地点查处二级地点的数量
    Integer getSecondAddrNum(@Param("id")Integer id);

    //根据巡检id获取详细的地点,包括一级地点和二级地点
    Address getAddressByDetectId(@Param("detectId")Integer detectId);

}
