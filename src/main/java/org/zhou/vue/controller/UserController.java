package org.zhou.vue.controller;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class) ;
	public UserController() {
		logger.debug("catalina.home={}", System.getProperty("catalina.home"));
		Properties sysProps = System.getProperties();
		for (Object key : sysProps.keySet()) {
			logger.info("[key = {}, value = {}]", key, sysProps.get(key));
			
		}
		
	}
}

