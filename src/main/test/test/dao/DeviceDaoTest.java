package test.dao;

import com.repair.dao.DeviceDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-dao.xml")
public class DeviceDaoTest {
    @Autowired
    private DeviceDao deviceDao;

    @Test
    public void getDeviceClass() throws Exception {
        List<String> deviceClassList = deviceDao.getDeviceClass(1000,1000);
        System.out.println(deviceClassList);
    }
}
