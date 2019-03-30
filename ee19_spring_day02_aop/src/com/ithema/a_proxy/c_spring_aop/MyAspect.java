package com.ithema.a_proxy.c_spring_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.annotation.After;

//������
public class MyAspect implements MethodInterceptor{
	public void befor() {
		// TODO Auto-generated method stub
		System.out.println("��ͷ");

	}
	public void afer() {
		// TODO Auto-generated method stub
		System.out.println("ţ��");
	}
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		befor();
		Object obj = arg0.proceed();	
		afer();
		return obj;
	}
}
