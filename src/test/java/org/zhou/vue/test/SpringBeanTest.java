package org.zhou.vue.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class SpringBeanTest {

	@Autowired
	private Date firstBean;
	
	@SuppressWarnings("deprecation")
	@Test
	public void initContextTest(){
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.debug("现在时间：{}", new Date().toLocaleString());
		logger.debug("firstBean={}", firstBean);
	}
}
