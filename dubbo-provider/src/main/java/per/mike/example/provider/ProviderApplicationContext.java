package per.mike.example.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class ProviderApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicationContext.class, args);

        System.out.println("#######################################");
        System.out.println("##                                   ##");
        System.out.println("##  DUBBO PROVIDER SPRING BOOT START ##");
        System.out.println("##                                   ##");
        System.out.println("#######################################");
    }

}