package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.example.bean.TargetClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Spring 설정 파일 로딩
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        // TargetClass 빈 가져오기 (AOP가 적용됨)
        TargetClass target = ctx.getBean("targetClass", TargetClass.class);

        // 메서드 호출
        target.sayHello();
        target.sayGoodbye();

        // 컨텍스트 닫기
        ctx.close();

        /* sayHello() 결과
        Before Method
        전에 around 호출 1
        Hello from SampleService!
        정상 종료 후 메서드
        Return value: null
        후에 around 호출 2
        Return value from around: null
        After Method
        */

        /* sayGoodbye() 결과
        Before Method
        전에 around 호출 1
        Goodbye from SampleService!
        정상 종료 후 메서드
        Return value: null
        후에 around 호출 2
        Return value from around: null
        After Method
         */

    }
}