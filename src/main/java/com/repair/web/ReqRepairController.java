package com.repair.web;


import com.repair.service.DetectService;
import com.repair.service.ReqRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigInteger;

@Controller
@RequestMapping("/reqrepair")
public class ReqRepairController {
    @Autowired
    private ReqRepairService reqRepairService;
    private DetectService detectService;

    class TempClass{
        public Integer deviceNum;
        public Integer classNum;
        public Integer jobNumber;
        public String name;
        public BigInteger phone;
    }
    @RequestMapping(value = "/{firstAddr}/{secondAddr}/",method = RequestMethod.GET)
    public void getReqInfo(@PathVariable("firstAddr") String firstAddr,
                           @PathVariable("secondAddr") String secondAddr) {
        TempClass tempClass=new TempClass();
    }




    @RequestMapping("/insert")
    public void insertReqRepairRecord() {

    }
}
