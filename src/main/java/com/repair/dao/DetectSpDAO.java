package com.repair.dao;

import com.repair.entity.detect.DetectSp;

import java.util.List;

public interface DetectSpDAO {
    /**
     * 获取所有巡查列表
     * @return
     */
    List<DetectSp> getAllDetectSp();
}
