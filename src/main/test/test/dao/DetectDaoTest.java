package test.dao;

import com.repair.dao.DetectDao;
import com.repair.entity.detect.Detect;
import com.repair.entity.detect.DetectDevice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-dao.xml")
public class DetectDaoTest {
    @Autowired
    private DetectDao detectDao;

    @Test
    public void getFinishDetect() throws Exception {
        List<Detect> detects =detectDao.getFinishDetect();
        for(Detect detect : detects)
            System.out.println(detect);
    }

    @Test
    public void getUnfinishDetect() throws Exception {
        List<Detect> detects =detectDao.getUnfinishDetect();
        for(Detect detect : detects)
            System.out.println(detect);
    }

    @Test
    public void getDetectDevices() throws Exception {
        List<DetectDevice> detectDevices = detectDao.getDetectDevices(1000);
        for(DetectDevice detectDevice : detectDevices)
            System.out.println(detectDevice);
    }
}