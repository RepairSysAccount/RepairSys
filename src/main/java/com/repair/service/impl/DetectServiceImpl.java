package com.repair.service.impl;

import com.repair.dao.DetectSpDAO;
import com.repair.entity.detect.DetectSp;
import com.repair.service.DetectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service("detectService")
public class DetectServiceImpl implements DetectService{
    @Autowired
    private DetectSpDAO detectSpDAO;

    public List<DetectSp> getDetectSp() {
        return detectSpDAO.getAllDetectSp();
    }
}
