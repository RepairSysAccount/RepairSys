package com.repair.service.impl;

import com.repair.dao.DetectSpDAO;
import com.repair.entity.detect.DetectSp;
import com.repair.service.DetectSpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("detectService")
public class DetectSpServiceImpl implements DetectSpService {
    @Autowired
    private DetectSpDAO detectSpDAO;

    public List<DetectSp> getDetectSp() {
        return detectSpDAO.getAllDetectSp();
    }
}
