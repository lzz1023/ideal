package com.ideal.test.entity;

import com.cyfonly.flogger.FLogger;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserTest extends TestCase {
    private static final FLogger flogger = FLogger.getInstance();
    private static final Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void testGetGender() throws Exception {
        User user = new User();
        user.setName("zhangsan");
        user.setAge(16);
        user.setGender("male");
        logger.info(user.getName());
        logger.error(user.toString());
        logger.warn(user.toString());

    }

    @Test
    public void testGetName() throws Exception {
        User user = new User();
        user.setName("zhangsan");
        user.setAge(16);
        user.setGender("male");
        assertEquals("zhangsan",user.getName());
        assertTrue("zhangsan".equals(user.getName()));
        flogger.error(user.getName());
        flogger.info(user.toString());
        flogger.debug(user.toString());
        flogger.warn(user.toString());
    }

}