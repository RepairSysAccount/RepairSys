package com.repair.dao;

import com.repair.pojo.ReqRecord;

public interface ReqRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ReqRecords
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ReqRecords
     *
     * @mbggenerated
     */
    int insert(ReqRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ReqRecords
     *
     * @mbggenerated
     */
    int insertSelective(ReqRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ReqRecords
     *
     * @mbggenerated
     */
    ReqRecord selectByPrimaryKey(Long number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ReqRecords
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ReqRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_ReqRecords
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ReqRecord record);
}