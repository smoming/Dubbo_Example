package per.mike.example.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class ConsumerApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationContext.class, args);

        System.out.println("#######################################");
        System.out.println("##                                   ##");
        System.out.println("##  DUBBO CONSUMER SPRING BOOT START ##");
        System.out.println("##                                   ##");
        System.out.println("#######################################");
    }

}