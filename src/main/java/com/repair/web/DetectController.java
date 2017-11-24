package com.repair.web;

import com.repair.entity.address.FirstAddress;
import com.repair.entity.address.SecondAddress;
import com.repair.entity.detect.Detect;
import com.repair.entity.detect.DetectDevice;
import com.repair.service.DetectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/detect")
public class DetectController {
    @Autowired
    private DetectService detectService;


    /**
     * 获取已完成的巡检列表
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/finishDetect", method = RequestMethod.GET)
    public List<Detect> getFinishDetect(){
        return detectService.finishDetect();
    }

    /**
     * 获取未完成的巡检列表
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/unFinishDetect", method = RequestMethod.GET)
    public List<Detect> getUnfinishDetect(){
        return detectService.getUnfinishDetect();
    }


    /**
     * 根据巡检计划获取已巡检的设备
     * @param detectId 从url传送给后台
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{detectId}/devices", method = RequestMethod.GET)
    public List<DetectDevice> getDetectDevices(@PathVariable("detectId") String detectId){
        return detectService.getDetectDevices(Integer.parseInt(detectId));
    }


    /**
     * 获取所有一级地点
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/firstAddr")
    public List<FirstAddress> getAllFirstAddress(){
        return detectService.getAllFirstAddress();
    }

    /**
     * 获取所有的二级地点
     * @param firstAddr 由url传送给后台
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{firstAddr}/secondAddr")
    public List<SecondAddress> getSecondAddress(@PathVariable("firstAddr")String firstAddr){
        return detectService.getSecondAddress(Integer.parseInt(firstAddr));
    }

    /**
     * 根据一级地点和二级地点获取所有的二级地点的设备
     * @param firstAddr url传参
     * @param secondAddr
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{firstAddr}/{secondAddr}/devices")
    public List<String> getDeviceClass(@PathVariable("firstAddr")String firstAddr,
                                       @PathVariable("secondAddr")String secondAddr){
        return detectService.getDeviceClass(Integer.parseInt(firstAddr), Integer.parseInt(secondAddr));
    }

    /**
     * 根据一级地点获取二级地点的数量
     * @param firstAddr
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{firstAddr}/secondAddrNum")
    public Integer getSecondAddrNum(@PathVariable("firstAddr")String firstAddr){
        return detectService.getSecondAddrNum(Integer.parseInt(firstAddr));
    }

    /**
     * 插入巡检计划和巡检计划的设备
     * @param firstAddr 通过url传参
     * @param secondAddr
     * @param request 通过request传参，将List<DetectDevice>封装进request请求中
     */
    @RequestMapping(value = "/{firstAddr}/{secondAddr}/addDetect")
    public void insertDetect(@PathVariable("firstAddr")Integer firstAddr,
                                @PathVariable("secondAddr") Integer secondAddr, HttpServletRequest request){
        Integer detectId = detectService.insertDetect(firstAddr,secondAddr);
        List<DetectDevice> detectDevices = (List<DetectDevice>) request.getAttribute("detectDevices");
        for(DetectDevice detectDevice : detectDevices)
            detectService.insertDetectDevice(detectDevice, detectId);
    }


    /**
     * 更新一个计划中的设备的信息  点击保存进行中的巡检计划
     * @param detectId
     * @param request 将新的设备的信息封装进request中
     */
    @RequestMapping(value = "/unFinishDetect/{detectId}/save")
    public void updateDetectDevice(@PathVariable("detectId")Integer detectId, HttpServletRequest request){
        List<DetectDevice> detectDevices = (List<DetectDevice>) request.getAttribute("detectDevices");
        for(DetectDevice detectDevice : detectDevices)
            detectService.updateDetectDevice(detectDevice,detectId);
        detectService.setDetectState(detectId,1);
    }

    @RequestMapping(value = "/unFinishDetect/{detectId}/singature")
    public void singature(@PathVariable("detectId")Integer detectId){
        detectService.singature(detectId);
    }


}
