package com.repair.web;


import com.repair.entity.man.ReqMan;
import com.repair.service.DetectService;
import com.repair.service.ReqRepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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


    /**
     * 从二维码获取地址编号，获取该地点相关设备信息，从Session中获取当前用户的ID，然后把这些信息拼起来返回
     * @param firstAddr
     * @param secondAddr
     * @param request
     */
    @RequestMapping(value = "/{firstAddr}/{secondAddr}/",method = RequestMethod.GET)
    public@ResponseBody TempClass getReqInfo(@PathVariable("firstAddr") String firstAddr,
                         @PathVariable("secondAddr") String secondAddr,
                         HttpServletRequest request) {
        TempClass tempClass=new TempClass();
        tempClass.deviceNum=reqRepairService.getAddressDeviceNum(Integer.parseInt(firstAddr),Integer.parseInt(secondAddr));
        tempClass.classNum=reqRepairService.getAddressClassNum(Integer.parseInt(firstAddr),Integer.parseInt(secondAddr));
        tempClass.jobNumber=Integer.valueOf((String) request.getSession().getAttribute("user"));
//        tempClass.name=
        ReqMan reqMan=reqRepairService.getReqMan(tempClass.jobNumber);
        tempClass.name=reqMan.getName();
        tempClass.phone=reqMan.getPhone();
        return tempClass;
    }


    /**
     * 新增一条报修记录
     */
    @RequestMapping("/insert")
    public void insertReqRepairRecord() {

    }
}
