package org.example.advice;

import org.aspectj.lang.ProceedingJoinPoint;

// Aspect : 여러 개의 Advice를 모아 놓은 것 (Pointcut + Advice)
public class AspectClass {

    // Before Advice: 메서드 호출 전에 실행되는 로직
    public void before() {
        System.out.println("Before Method");
    }

    // After Advice: 메서드 호출 후에 실행되는 로직
    public void after() {
        System.out.println("After Method");
    }

    // Around Advice: 메서드 호출 전후에 모두 실행되는 로직
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        // 메서드 실행 전에 실행되는 로직
        System.out.println("전에 around 호출 1");

        // 실제 메서드를 실행
        Object returnValue = pjp.proceed();

        // 메서드 실행 후에 실행되는 로직
        System.out.println("후에 around 호출 2");

        // 반환 값을 로그에 남기는 등 추가 작업 가능.
        System.out.println("Return value from around: " + returnValue);
    }
}
