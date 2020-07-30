package com.yxwy.leyi;

import com.yxwy.leyi.dao.TDao;
import com.yxwy.leyi.entity.T;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDao {
    @Resource
    private TDao tDao;

    @Test
    public void testa(){
        T t = tDao.findAll();
        System.out.println(t.toString());
        System.out.println(t.getName());
    }
}
