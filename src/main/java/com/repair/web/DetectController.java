package com.repair.web;

import com.repair.entity.address.Address;
import com.repair.entity.address.FirstAddress;
import com.repair.entity.address.SecondAddress;
import com.repair.entity.detect.Detect;
import com.repair.entity.detect.DetectDevice;
import com.repair.service.DetectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String,Object> getDetectDevices(@PathVariable("detectId") String detectId){
        List<String> deviceClasses = detectService.getDeviceClassByDetectId(Integer.parseInt(detectId));
        Address address = detectService.getAddressByDetectId(Integer.parseInt(detectId));
        Integer detetctedNum = detectService.getSecondAddrNum(Integer.parseInt(detectId));
        Map<String, Object> map = new HashMap<>();
        map.put("address", address);
        map.put("detectedNum",detetctedNum);
        map.put("deviceClasses", deviceClasses);
        return map;
    }


    /**
     * 获取所有一级地点,及一级地点中二级地点的数量
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/firstAddr")
    public Map<String, Object> getAllFirstAddress(){
//        return detectService.getAllFirstAddress();
        Map<String, Object> map = new HashMap<>();
        List<FirstAddress> firstAddresses = detectService.getAllFirstAddress();
        for(FirstAddress firstAddress : firstAddresses){
            Integer detectedNum = detectService.getSecondAddrNum(firstAddress.getFirstNo());
            map.put(firstAddress.getName()+"", detectedNum);
        }
        return map;
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
     * 在开始新的巡检里点击确定 同时将标志位设置为1:已完成s
     * 插入巡检计划和巡检计划的设备
     * @param firstAddr 通过url传参
     * @param secondAddr
     */
    @RequestMapping(value = "/{firstAddr}/{secondAddr}/addDetect")
    public void insertDetect(@PathVariable("firstAddr")Integer firstAddr,
                                @PathVariable("secondAddr") Integer secondAddr, @RequestBody List<DetectDevice> detectDevices){
        Integer detectId = detectService.insertDetect(firstAddr,secondAddr);
        for(DetectDevice detectDevice : detectDevices)
            detectService.insertDetectDevice(detectDevice, detectId);
        detectService.setDetectState(detectId,1);
    }


    /**
     * 更新一个计划中的设备的信息  点击保存进行中的巡检计划
     * @param detectId
     */
    @RequestMapping(value = "/unFinishDetect/{detectId}/save")
    public void updateDetectDevice(@PathVariable("detectId")Integer detectId, @RequestBody List<DetectDevice> detectDevices){
        deviceAdd(detectDevices,detectId);
    }

    /**
     * 在进行中的巡检里面点击确定
     * 保存数据的同时将巡检的状态设置为已完成
     * @param detectId
     * @param detectDevices
     */
    @RequestMapping(value = "/unFinishDetect/{detectId}/confirm")
    public void addDetect(@PathVariable("detectId")Integer detectId,@RequestBody List<DetectDevice> detectDevices){
        deviceAdd(detectDevices,detectId);
        detectService.setDetectState(detectId,1);
    }

    @RequestMapping(value = "/unFinishDetect/{detectId}/singature")
    public void singature(@PathVariable("detectId")Integer detectId){
        detectService.singature(detectId);
    }

    private void deviceAdd(List<DetectDevice> detectDevices, Integer detectId){
        for(DetectDevice detectDevice : detectDevices)
            detectService.updateDetectDevice(detectDevice,detectId);
    }

}
