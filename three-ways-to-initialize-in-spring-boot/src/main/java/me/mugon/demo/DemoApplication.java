package me.mugon.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* 참고 : https://www.youtube.com/watch?v=f017PD5BIEc */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(DemoApplication.class, args);
        ac.addApplicationListener(event -> System.out.println("Hello ApplicationListener1"));
        ac.addApplicationListener((ApplicationListener<MyEvent>) event -> System.out.println("Hello ApplicationListener2: " + event.getMessage()));

        ac.publishEvent(new ApplicationEvent(ac) {
        });

        ac.publishEvent(new MyEvent(ac, "Hello MyEvent!"));
    }

    static class MyEvent extends ApplicationEvent {

        private final String message;

        /**
         * Create a new {@code ApplicationEvent}.
         *
         * @param source the object on which the event initially occurred or with
         *               which the event is associated (never {@code null})
         */
        public MyEvent(Object source, String message) {
            super(source);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    /* 1 */
    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> System.out.println("Hello ApplicationRunner1");
    }

    /* 2 */
    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> System.out.println("Hello CommandLineRunner1");
    }

    /* 3 */
    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        System.out.println("Hello EventListener1");
    }

    @EventListener(MyEvent.class)
    public void myEventListen() {
        System.out.println("Hello MyEventListener2");
    }

    @EventListener
    public void myEventListen2(MyEvent myEvent) {
        System.out.println("Hello MyEventListener3: " + myEvent.getMessage());
    }

    @MyEventListener
    public void myEventListen3(MyEvent myEvent) {
        System.out.println("Hello MyEventListener4: " + myEvent.getMessage());
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@EventListener
@interface MyEventListener { }

@Component
class ExtendsCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello CommandLineRunner2");
    }
}

@Component
class ExtendsApplicationLineRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello ApplicationRunner2");
    }
}
