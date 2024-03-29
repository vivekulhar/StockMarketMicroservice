package dev.vivek.stockserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StockServiceRegistryApplication {
    // good
    public static void main(String[] args) {
        SpringApplication.run(StockServiceRegistryApplication.class, args);
    }

}
