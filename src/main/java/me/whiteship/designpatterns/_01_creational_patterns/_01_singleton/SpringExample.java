package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args) {
        //싱글톤 scope이라 불림 -> 사실 싱글톤 패턴과는 다른 개념(String.class가 생글톤 패턴으로 구현된게 아니라는 의미)
        //ApplicationContext 내부에서 인스턴스를 유일하도록 관리해준다.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        System.out.println(hello == hello2);
    }
}
