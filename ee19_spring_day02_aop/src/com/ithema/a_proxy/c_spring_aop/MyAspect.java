package com.ithema.a_proxy.c_spring_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.After;

//切面类
public class MyAspect implements MethodInterceptor{
	public void befor() {
		// TODO Auto-generated method stub
		System.out.println("鸡头");

	}
	public void afer() {
		// TODO Auto-generated method stub
		System.out.println("牛后");
	}
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		befor();
		Object obj = arg0.proceed();	
		afer();
		return obj;
	}
}
