package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StockDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getAllStocks() {
        String sql = "SELECT id, stock_name, \"date\", \"open\", high, year_low, year_high, volume, created, highlight, symbol, ltp, buy_percent, sell_percent, isin_number\n" +
                "FROM stock_detail LIMIT 10 ";
        return jdbcTemplate.queryForList(sql);
    }
}