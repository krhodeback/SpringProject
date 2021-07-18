package spring.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstHelloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondHelloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        Cat firstCat = (Cat) applicationContext.getBean(Cat.class);
        Cat secondCat = (Cat) applicationContext.getBean(Cat.class);
        System.out.println(firstHelloWorld == secondHelloWorld);
        System.out.println(firstCat == secondCat);
    }
}