package dev.vivek.stock_price_api.controller;

import dev.vivek.stock_price_api.bindings.StockPriceResponse;
import dev.vivek.stock_price_api.service.StockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockPriceRestController {
    @Autowired
    private StockPriceService stockPriceService;
    @GetMapping("/price/{companyName}")
    public ResponseEntity<StockPriceResponse> getStockPrice(@PathVariable String companyName) {
        StockPriceResponse stockPriceResponse = stockPriceService.getStockPrice(companyName);
        return new ResponseEntity<>(stockPriceResponse, org.springframework.http.HttpStatus.OK);
    }
}
