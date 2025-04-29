package com.dto;

public class MutualFundsDTO {

    private String mutualFundName;
    private String mutualFundIsin;
    private String amcCode;
    private String exitLoad;
    private Float oneYearReturn;
    private Float threeYearReturn;
    private Float fiveYearReturn;
    private Float allYearReturn;
    private String searchId;

    // Constructors
    public MutualFundsDTO() {
    }

    public MutualFundsDTO(String mutualFundName, String mutualFundIsin, String amcCode, String exitLoad,
                          Float oneYearReturn, Float threeYearReturn, Float fiveYearReturn, Float allYearReturn,
                          String searchId) {
        this.mutualFundName = mutualFundName;
        this.mutualFundIsin = mutualFundIsin;
        this.amcCode = amcCode;
        this.exitLoad = exitLoad;
        this.oneYearReturn = oneYearReturn;
        this.threeYearReturn = threeYearReturn;
        this.fiveYearReturn = fiveYearReturn;
        this.allYearReturn = allYearReturn;
        this.searchId = searchId;
    }

    // Getters and Setters

    public String getMutualFundName() {
        return mutualFundName;
    }

    public void setMutualFundName(String mutualFundName) {
        this.mutualFundName = mutualFundName;
    }

    public String getMutualFundIsin() {
        return mutualFundIsin;
    }

    public void setMutualFundIsin(String mutualFundIsin) {
        this.mutualFundIsin = mutualFundIsin;
    }

    public String getAmcCode() {
        return amcCode;
    }

    public void setAmcCode(String amcCode) {
        this.amcCode = amcCode;
    }

    public String getExitLoad() {
        return exitLoad;
    }

    public void setExitLoad(String exitLoad) {
        this.exitLoad = exitLoad;
    }

    public Float getOneYearReturn() {
        return oneYearReturn;
    }

    public void setOneYearReturn(Float oneYearReturn) {
        this.oneYearReturn = oneYearReturn;
    }

    public Float getThreeYearReturn() {
        return threeYearReturn;
    }

    public void setThreeYearReturn(Float threeYearReturn) {
        this.threeYearReturn = threeYearReturn;
    }

    public Float getFiveYearReturn() {
        return fiveYearReturn;
    }

    public void setFiveYearReturn(Float fiveYearReturn) {
        this.fiveYearReturn = fiveYearReturn;
    }

    public Float getAllYearReturn() {
        return allYearReturn;
    }

    public void setAllYearReturn(Float allYearReturn) {
        this.allYearReturn = allYearReturn;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    @Override
    public String toString() {
        return "MutualFundsDTO{" +
                "mutualFundName='" + mutualFundName + '\'' +
                ", mutualFundIsin='" + mutualFundIsin + '\'' +
                ", amcCode='" + amcCode + '\'' +
                ", exitLoad='" + exitLoad + '\'' +
                ", oneYearReturn=" + oneYearReturn +
                ", threeYearReturn=" + threeYearReturn +
                ", fiveYearReturn=" + fiveYearReturn +
                ", allYearReturn=" + allYearReturn +
                ", searchId='" + searchId + '\'' +
                '}';
    }
}
