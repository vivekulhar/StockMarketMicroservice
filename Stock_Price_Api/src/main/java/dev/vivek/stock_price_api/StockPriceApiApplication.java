package dev.vivek.stock_price_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StockPriceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockPriceApiApplication.class, args);
    }

}
