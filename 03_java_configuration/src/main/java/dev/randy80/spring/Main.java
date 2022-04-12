package dev.randy80.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer mr = context.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
