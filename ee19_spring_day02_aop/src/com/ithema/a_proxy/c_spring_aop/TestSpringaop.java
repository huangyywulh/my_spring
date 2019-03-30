package com.ithema.a_proxy.c_spring_aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringaop {
 @Test
 public void demo01() {
	 String xmlPath="com/ithema/a_proxy/c_spring_aop/Beans.xml";
	  ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	  UserService userServiceImpl = (UserService) applicationContext.getBean("userServiceId");
	 userServiceImpl.addUser();
	 userServiceImpl.updateUser();
	 userServiceImpl.deleteUser();
}
 
}
