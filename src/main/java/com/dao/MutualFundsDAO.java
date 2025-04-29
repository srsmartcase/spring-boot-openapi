package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MutualFundsDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> getAllMutualFundsData() {
        String sql = "SELECT mutual_fund_name, mutual_fund_isin, amc_code, exit_load, " +
                "one_year_return, three_year_return, five_year_return, all_year_return, search_id " +
                "FROM public.mutual_funds limit 10";

        return jdbcTemplate.queryForList(sql);
    }
}
