package dev.vivek.stock_calc_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class StockCalcApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockCalcApiApplication.class, args);
    }

}
