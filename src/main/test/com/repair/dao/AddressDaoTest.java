package com.repair.dao;

import com.repair.dao.AddressDao;
import com.repair.entity.address.Address;
import com.repair.entity.address.FirstAddress;
import com.repair.entity.address.SecondAddress;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/spring-dao.xml")
public class AddressDaoTest {

    @Autowired
    private AddressDao addressDao;

    @Test
    public void getAllFirstAddress() throws Exception {
        List<FirstAddress> firstAddressList = addressDao.getAllFirstAddress();
        for(FirstAddress firstAddress : firstAddressList)
            System.out.println(firstAddress);
    }

    @Test
    public void getSecondAddress() throws Exception {
        List<SecondAddress> secondAddresses = addressDao.getSecondAddress(1000);
        for(SecondAddress secondAddress : secondAddresses)
            System.out.println(secondAddress);
    }

    @Test
    public void getSecondAddrNum() throws Exception {
        Integer num = addressDao.getSecondAddrNum(1000);
        System.out.println(num);
    }

    @Test
    public void getAddressByDetectId() throws Exception {
        Address address = addressDao.getAddressByDetectId(1000);
        System.out.println(address);
    }
}
