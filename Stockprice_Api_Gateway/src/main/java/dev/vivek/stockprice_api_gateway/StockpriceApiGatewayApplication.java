package dev.vivek.stockprice_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StockpriceApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockpriceApiGatewayApplication.class, args);
    }

}
