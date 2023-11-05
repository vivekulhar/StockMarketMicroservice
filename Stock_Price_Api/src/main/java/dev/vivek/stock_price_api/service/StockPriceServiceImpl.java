package dev.vivek.stock_price_api.service;

import dev.vivek.stock_price_api.bindings.StockPriceResponse;
import dev.vivek.stock_price_api.repository.StockPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class StockPriceServiceImpl implements StockPriceService{
        @Autowired
        private StockPriceRepository stockPriceRepository;
        @Autowired
        private Environment environment;
        @Override
        public StockPriceResponse getStockPrice(String companyName) {
            Double stockPrice = stockPriceRepository.findStockPriceByCompanyName(companyName);
            StockPriceResponse stockPriceResponse = new StockPriceResponse();
            stockPriceResponse.setCompanyName(companyName);
            stockPriceResponse.setCompanyStockPrice(stockPrice);
            String property = environment.getProperty("local.server.port");
            stockPriceResponse.setPortNumber(Integer.parseInt(property));
            return stockPriceResponse;
        }
}
