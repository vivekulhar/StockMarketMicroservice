package dev.vivek.stock_price_api.service;

import dev.vivek.stock_price_api.bindings.StockPriceResponse;
import org.springframework.stereotype.Service;


public interface StockPriceService {

    public StockPriceResponse getStockPrice(String companyName);
}
