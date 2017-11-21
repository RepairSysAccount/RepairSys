package com.repair.service;

import com.repair.entity.detect.DetectSp;

import java.util.List;

public interface DetectService {
    /**
     * 查询巡查列表
     * @return
     */
    List<DetectSp> getDetectSp();



}
