package com.yong.orders.yongorders;

import com.yong.orders.dao.UserDao;
import com.yong.orders.model.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

/**
 * Created by yong.a.liang on 8/8/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryIntegrationTests {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryIntegrationTests.class);

    @Autowired
    private UserDao userDao;

    @Before
    public void setUp(){
        log.debug("user count = {}",userDao.count());
//        userDao.deleteAll();
    }

    @After
    public void tearDown(){
//        userDao.deleteAll();
    }

    @Test
    public void findUserByname(){
        User user = new User();
        user.setName("testUser");
        user.setAge(18);
        user = userDao.save(user);
        User result = userDao.findByName("testUser");
        Assert.assertEquals(result.getAge(),18);
        Assert.assertEquals(result.getName(),"testUser");
        userDao.delete(user);
    }


}
