package dev.vivek.stock_calc_api.client.service;

import dev.vivek.stock_calc_api.bindings.StockCalcApiResponse;
import dev.vivek.stock_calc_api.bindings.StockPriceApiResponse;
import dev.vivek.stock_calc_api.client.StockPriceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockCalcService {
    @Autowired
    private StockPriceClient stockPriceClient;

    public StockCalcApiResponse getStockCost(String companyName, Integer quantity) {
        StockCalcApiResponse stockCalcApiResponse = new StockCalcApiResponse();
        stockCalcApiResponse.setCompanyName(companyName);
        stockCalcApiResponse.setQuantity(quantity);
        StockPriceApiResponse stockPriceApiResponse = stockPriceClient.invokeStockPriceApi(companyName);
        Double stockPrice = stockPriceApiResponse.getCompanyStockPrice();

        stockCalcApiResponse.setTotalCost(stockPrice * quantity);
        stockCalcApiResponse.setPortNumber(stockPriceApiResponse.getPortNumber());
        return stockCalcApiResponse;
    }
}
