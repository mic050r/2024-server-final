package org.example.bean;

//  이 클래스는 AOP가 적용될 대상
public class TargetClass {
    public void sayHello() {
        System.out.println("Hello from SampleService!");
    }

    public void sayGoodbye() {
        System.out.println("Goodbye from SampleService!");
    }
}
