package com.repair.web;

import com.repair.entity.detect.DetectSp;
import com.repair.service.DetectSpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/detect")
public class DetectSpController {
    @Autowired
    private DetectSpService detectService;

    @RequestMapping(value = "/detectsp",method = RequestMethod.GET)
    public @ResponseBody List<DetectSp> getDetectSp() {
        return detectService.getDetectSp();
    }

}
