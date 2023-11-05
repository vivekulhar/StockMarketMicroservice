package dev.vivek.stock_calc_api.client;

import dev.vivek.stock_calc_api.bindings.StockPriceApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STOCK-PRICE-API")
public interface StockPriceClient {
    @GetMapping("/price/{companyName}")
    public StockPriceApiResponse invokeStockPriceApi(@PathVariable String companyName);
}
