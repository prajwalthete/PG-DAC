package com.prajwal.serv;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AccountLogger {

	@Pointcut("execution(* com.prajwal.dao.AccountDaoo.create(..))")
	public void myPointCut1() {

	}

	@Before("myPointCut1()")
	public void myBeforAdvice() {
		System.out.println("acc create time");
	}

	@Pointcut("execution(* com.prajwal.dao.AccountDaoo.deposite(..))")
	public void myPointCut2() {

	}

	@After("myPointCut2()")
	public void myAfterAdvice() {
		System.out.println("deposite comp");
	}

	@Pointcut("execution(* com.prajwal.dao.AccountDaoo.withdraw(..))")
	public void myPointCut3() {

	}

	@Around("myPointCut3()")
	public void myAroundAdvice(ProceedingJoinPoint ref) throws Throwable {
		System.out.println("withdraw started");
		ref.proceed();
		System.out.println("withdraw finished");
	}

	@Pointcut("execution(* com.prajwal.dao.AccountDaoo.accDetail(..))")
	public void myPointCut4() {

	}

	@AfterReturning("myPointCut4()")
	public void myAfterReturningAdvice() {
		System.out.println("details shown");
	}

	@Pointcut("execution(* com.prajwal.dao.AccountDaoo.block(..))")
	public void myPointCut5() {

	}

	@AfterThrowing("myPointCut2()")
	public void myAfterThrowingAdvice() {
		System.out.println("exception gen");
	}

}
