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
        String selectClause = "SELECT isin, search_id, nse_scrip_code, bse_scrip_code, groww_company_id, industry_id, " +
                "industry_name, display_name, short_name, market_cap, pb_ratio, pe_ratio, div_yield, " +
                "book_value, eps_ttm, roe, industry_pe, capped_type, dividend_yield_in_percent, face_value, " +
                "debt_to_equity, return_on_assets, return_on_equity, cash_ratio, debt_to_asset, ev_to_sales, " +
                "ev_to_ebitda, earnings_yield, sector_pb, sector_div_yield, sector_roe, sector_roce, price_to_ocf, " +
                "price_to_fcf, roic, pe_premium_vs_sector, pb_premium_vs_sector, div_yield_vs_sector, current_ratio, " +
                "sector_pe, price_to_sales, peg_ratio, year_low_price, year_high_price, fiis, diis, promoters, " +
                "other_domestic_institutions, retail_and_others, symbol, roce, screener_company_id, " +
                "screener_data_warehouse_id, operating_profit_margin, interest_coverage_ratio, market_cap_sales_ratio, " +
                "change_fii_hold, change_dii_hold, eps_growth_three_year ";

        String fromClause = "FROM public.stock_details ";

        String limitClause = "LIMIT 10";

        String sql = selectClause + fromClause + limitClause;

        return jdbcTemplate.queryForList(sql);
    }
}
