package dev.vivek.stock_price_api.bindings;

public class StockPriceResponse {
    private String companyName;
    private Double companyStockPrice;
    private Integer portNumber;
    public String getCompanyName() {
        return companyName;
    }

    public Integer getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    public StockPriceResponse(String companyName, Double companyStockPrice, Integer portNumber) {
        this.companyName = companyName;
        this.companyStockPrice = companyStockPrice;
        this.portNumber = portNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getCompanyStockPrice() {
        return companyStockPrice;
    }

    public void setCompanyStockPrice(Double companyStockPrice) {
        this.companyStockPrice = companyStockPrice;
    }

    public StockPriceResponse() {
    }

    public StockPriceResponse(String companyName, Double companyStockPrice) {
        this.companyName = companyName;
        this.companyStockPrice = companyStockPrice;
    }
}
