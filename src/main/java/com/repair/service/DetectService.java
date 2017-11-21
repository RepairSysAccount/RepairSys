package com.repair.service;

import com.repair.entity.detect.DetectSp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DetectService {
    /**
     * 查询巡查列表
     * @return
     */
    List<DetectSp> getDetectSp();



}
