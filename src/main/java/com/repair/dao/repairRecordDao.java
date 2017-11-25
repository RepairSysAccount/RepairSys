package com.repair.dao;

import com.repair.entity.record.RepairRecord;

public interface repairRecordDao {

    /**
     * 增加维修记录
     * @param repairRecord
     */
    void addRepairRecord(RepairRecord repairRecord);

}
