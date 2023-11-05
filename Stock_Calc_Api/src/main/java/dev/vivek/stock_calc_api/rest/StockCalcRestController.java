package dev.vivek.stock_calc_api.rest;

import dev.vivek.stock_calc_api.bindings.StockCalcApiResponse;
import dev.vivek.stock_calc_api.client.service.StockCalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockCalcRestController {
    @Autowired
    StockCalcService stockCalcService;
    @GetMapping("/cost/{companyName}/{quantity}")
    public StockCalcApiResponse getStockCost(@PathVariable String companyName,@PathVariable Integer quantity) {
        return stockCalcService.getStockCost(companyName, quantity);
    }
}
