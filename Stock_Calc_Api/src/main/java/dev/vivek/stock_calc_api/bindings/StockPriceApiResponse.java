package dev.vivek.stock_calc_api.bindings;

import lombok.Data;

@Data
public class StockPriceApiResponse {
    private String companyName;
    private Double companyStockPrice;
    private Integer portNumber;
}
