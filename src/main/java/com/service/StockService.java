package com.service;

import com.dao.StockDAO;
import com.dto.StockDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StockService {

    @Autowired
    private StockDAO stockDAO;

    private StockDTO mapToStockDTO(Map<String, Object> row) {
        StockDTO dto = new StockDTO();
        dto.setSymbol((String) row.get("symbol"));
        dto.setIsin((String) row.get("isin"));
        dto.setPeRatio(row.get("pe_ratio") != null ? ((Number) row.get("pe_ratio")).floatValue() : null);
        dto.setPbRatio(row.get("pb_ratio") != null ? ((Number) row.get("pb_ratio")).floatValue() : null);
        dto.setDividendYieldInPercent(row.get("dividend_yield_in_percent") != null ? ((Number) row.get("dividend_yield_in_percent")).floatValue() : null);
        dto.setFiveYearCagr(row.get("five_year_cagr") != null ? ((Number) row.get("five_year_cagr")).floatValue() : null);
        dto.setFiveYearProfitGrowth(row.get("five_year_profit_growth") != null ? ((Number) row.get("five_year_profit_growth")).floatValue() : null);
        dto.setFiveYearSalesGrowth(row.get("five_year_sales_growth") != null ? ((Number) row.get("five_year_sales_growth")).floatValue() : null);
        dto.setMarketCap(row.get("market_cap") != null ? ((Number) row.get("market_cap")).floatValue() : null);
        dto.setIndustryName((String) row.get("industry_name"));
        return dto;
    }

    public List<StockDTO> getAllStocks() {
        List<Map<String, Object>> stocksData = stockDAO.getAllStocks();
        return stocksData.stream()
                .map(this::mapToStockDTO)
                .collect(Collectors.toList());
    }
}
