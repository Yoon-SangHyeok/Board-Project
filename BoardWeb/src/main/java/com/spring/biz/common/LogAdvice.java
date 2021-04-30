package com.spring.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // Aspect = PointCut + Advice

public class LogAdvice {
	
	@Pointcut("execution(* com.spring.biz..*Impl.*(..))")
	public void allPointCut() {} // ����Ʈ�� 

//	@Pointcut("execution(* com.spring.biz..*Impl.get*(..))")
//	public void getPointCut() {}
	
	@Before("allPointCut()")
	public void printLog(JoinPoint jp) {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����"); // �����̽�
	}
}
