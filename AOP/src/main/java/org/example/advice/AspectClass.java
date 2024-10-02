package org.example.advice;

import org.aspectj.lang.ProceedingJoinPoint;

// Aspect : 여러 개의 Advice를 모아 놓은 것 (Pointcut + Advice)
public class AspectClass {

    // Before Advice: 메서드 호출 전에 실행되는 로직
    public void before() {
        System.out.println("Before Method");
    }
}
