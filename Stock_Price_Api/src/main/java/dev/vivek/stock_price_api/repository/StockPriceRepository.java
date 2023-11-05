package dev.vivek.stock_price_api.repository;

import dev.vivek.stock_price_api.entity.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

public interface StockPriceRepository extends JpaRepository<StockPrice, Serializable> {
    @Query("select companyStockPrice from StockPrice where companyName = :companyName")
    public Double findStockPriceByCompanyName(String companyName);
}
