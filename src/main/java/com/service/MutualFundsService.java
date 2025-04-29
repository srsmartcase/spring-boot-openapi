package com.service;

import com.dao.MutualFundsDAO;
import com.dto.MutualFundsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MutualFundsService {

    @Autowired
    private MutualFundsDAO mutualFundsDAO;


     private MutualFundsDTO mapToMutualFundsDTO(Map<String, Object> row) {
        MutualFundsDTO dto = new MutualFundsDTO();
        dto.setMutualFundName((String) row.get("mutual_fund_name"));
        dto.setMutualFundIsin((String) row.get("mutual_fund_isin"));
        dto.setAmcCode((String) row.get("amc_code"));
        dto.setExitLoad((String) row.get("exit_load"));
        dto.setOneYearReturn(row.get("one_year_return") != null ? ((Number) row.get("one_year_return")).floatValue() : null);
        dto.setThreeYearReturn(row.get("three_year_return") != null ? ((Number) row.get("three_year_return")).floatValue() : null);
        dto.setFiveYearReturn(row.get("five_year_return") != null ? ((Number) row.get("five_year_return")).floatValue() : null);
        dto.setAllYearReturn(row.get("all_year_return") != null ? ((Number) row.get("all_year_return")).floatValue() : null);
        dto.setSearchId((String) row.get("search_id"));
        return dto;
    }

    public List<MutualFundsDTO> getAllMutualFunds() {
        List<Map<String, Object>> mutualFundsData = mutualFundsDAO.getAllMutualFundsData();

        return mutualFundsData.stream()
                .map(this::mapToMutualFundsDTO)
                .collect(Collectors.toList());
    }
}
