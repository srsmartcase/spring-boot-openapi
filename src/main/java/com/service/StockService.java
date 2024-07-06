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
        dto.setIsin((String) row.get("isin"));
        dto.setCappedType((String) row.get("search_id"));
        dto.setNseScripCode((String) row.get("nse_scrip_code"));
        dto.setBseScripCode((String) row.get("bse_scrip_code"));
        dto.setCappedType((String) row.get("groww_company_id"));
        dto.setIndustryName((String) row.get("industry_id"));
        dto.setIndustryName((String) row.get("industry_name"));
        dto.setDisplayName((String) row.get("display_name"));
        dto.setShortName((String) row.get("short_name"));
        dto.setMarketCap(row.get("market_cap") != null ? ((Number) row.get("market_cap")).floatValue() : null);
        dto.setPbRatio(row.get("pb_ratio") != null ? ((Number) row.get("pb_ratio")).floatValue() : null);
        dto.setPeRatio(row.get("pe_ratio") != null ? ((Number) row.get("pe_ratio")).floatValue() : null);
        dto.setDividendYield(row.get("dividend_yield") != null ? ((Number) row.get("dividend_yield")).floatValue() : null);
        dto.setBookValue(row.get("book_value") != null ? ((Number) row.get("book_value")).floatValue() : null);
        dto.setEpsTtm(row.get("eps_ttm") != null ? ((Number) row.get("eps_ttm")).floatValue() : null);
        dto.setRoe(row.get("roe") != null ? ((Number) row.get("roe")).floatValue() : null);
        dto.setIndustryPe(row.get("industry_pe") != null ? ((Number) row.get("industry_pe")).floatValue() : null);
        dto.setCappedType((String) row.get("capped_type"));
        dto.setDividendYieldInPercent(row.get("dividend_yield_in_percent") != null ? ((Number) row.get("dividend_yield_in_percent")).floatValue() : null);
        dto.setFaceValue(row.get("face_value") != null ? ((Number) row.get("face_value")).floatValue() : null);
        dto.setDebtToEquity(row.get("debt_to_equity") != null ? ((Number) row.get("debt_to_equity")).floatValue() : null);
        dto.setReturnOnAssets(row.get("return_on_assets") != null ? ((Number) row.get("return_on_assets")).floatValue() : null);
        dto.setReturnOnEquity(row.get("return_on_equity") != null ? ((Number) row.get("return_on_equity")).floatValue() : null);
        dto.setCashRatio(row.get("cash_ratio") != null ? ((Number) row.get("cash_ratio")).floatValue() : null);
        dto.setDebtToAsset(row.get("debt_to_asset") != null ? ((Number) row.get("debt_to_asset")).floatValue() : null);
        dto.setEvToSales(row.get("ev_to_sales") != null ? ((Number) row.get("ev_to_sales")).floatValue() : null);
        dto.setEvToEbitda(row.get("ev_to_ebitda") != null ? ((Number) row.get("ev_to_ebitda")).floatValue() : null);
        dto.setEarningsYield(row.get("earnings_yield") != null ? ((Number) row.get("earnings_yield")).floatValue() : null);
        dto.setSectorPb(row.get("sector_pb") != null ? ((Number) row.get("sector_pb")).floatValue() : null);
        dto.setSectorDivYield(row.get("sector_div_yield") != null ? ((Number) row.get("sector_div_yield")).floatValue() : null);
        dto.setSectorRoe(row.get("sector_roe") != null ? ((Number) row.get("sector_roe")).floatValue() : null);
        dto.setSectorRoce(row.get("sector_roce") != null ? ((Number) row.get("sector_roce")).floatValue() : null);
        dto.setPriceToOcf(row.get("price_to_ocf") != null ? ((Number) row.get("price_to_ocf")).floatValue() : null);
        dto.setPriceToFcf(row.get("price_to_fcf") != null ? ((Number) row.get("price_to_fcf")).floatValue() : null);
        dto.setRoic(row.get("roic") != null ? ((Number) row.get("roic")).floatValue() : null);
        dto.setPePremiumVsSector(row.get("pe_premium_vs_sector") != null ? ((Number) row.get("pe_premium_vs_sector")).floatValue() : null);
        dto.setPbPremiumVsSector(row.get("pb_premium_vs_sector") != null ? ((Number) row.get("pb_premium_vs_sector")).floatValue() : null);
        dto.setDivYieldVsSector(row.get("div_yield_vs_sector") != null ? ((Number) row.get("div_yield_vs_sector")).floatValue() : null);
        dto.setCurrentRatio(row.get("current_ratio") != null ? ((Number) row.get("current_ratio")).floatValue() : null);
        dto.setSectorPe(row.get("sector_pe") != null ? ((Number) row.get("sector_pe")).floatValue() : null);
        dto.setPriceToSales(row.get("price_to_sales") != null ? ((Number) row.get("price_to_sales")).floatValue() : null);
        dto.setPegRatio(row.get("peg_ratio") != null ? ((Number) row.get("peg_ratio")).floatValue() : null);
        dto.setYearLowPrice(row.get("year_low_price") != null ? ((Number) row.get("year_low_price")).floatValue() : null);
        dto.setYearHighPrice(row.get("year_high_price") != null ? ((Number) row.get("year_high_price")).floatValue() : null);
        dto.setFiis(row.get("fiis") != null ? ((Number) row.get("fiis")).floatValue() : null);
        dto.setDiis(row.get("diis") != null ? ((Number) row.get("diis")).floatValue() : null);
        dto.setPromoters(row.get("promoters") != null ? ((Number) row.get("promoters")).floatValue() : null);
        dto.setOtherDomesticInstitutions(row.get("other_domestic_institutions") != null ? ((Number) row.get("other_domestic_institutions")).floatValue() : null);
        dto.setRetailAndOthers(row.get("retail_and_others") != null ? ((Number) row.get("retail_and_others")).floatValue() : null);
        dto.setSymbol((String) row.get("symbol"));
        dto.setRoce(row.get("roce") != null ? ((Number) row.get("roce")).floatValue() : null);
        dto.setSymbol((String) row.get("screener_company_id"));

        dto.setSymbol((String) row.get("screener_data_warehouse_id"));
dto.setOperatingProfitMargin(row.get("operating_profit_margin") != null ? ((Number) row.get("operating_profit_margin")).floatValue() : null);
        dto.setInterestCoverageRatio(row.get("interest_coverage_ratio") != null ? ((Number) row.get("interest_coverage_ratio")).floatValue() : null);
        dto.setMarketCapSalesRatio(row.get("market_cap_sales_ratio") != null ? ((Number) row.get("market_cap_sales_ratio")).floatValue() : null);
        dto.setChangeFiiHold(row.get("change_fii_hold") != null ? ((Number) row.get("change_fii_hold")).floatValue() : null);
        dto.setChangeDiiHold(row.get("change_dii_hold") != null ? ((Number) row.get("change_dii_hold")).floatValue() : null);
        dto.setEpsGrowthThreeYear(row.get("eps_growth_three_year") != null ? ((Number) row.get("eps_growth_three_year")).floatValue() : null);
        return dto;
    }

    public List<StockDTO> getAllStocks() {
        List<Map<String, Object>> stocksData = stockDAO.getAllStocks();
        return stocksData.stream()
                .map(this::mapToStockDTO)
                .collect(Collectors.toList());
    }
}
