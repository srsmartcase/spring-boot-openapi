package com.dto;

public class StockDTO {

    private String isin;
    private Long searchId;
    private String nseScripCode;
    private String bseScripCode;
    private Long growwCompanyId;
    private Long industryId;
    private String industryName;
    private String displayName;
    private String shortName;
    private Float marketCap;
    private Float pbRatio;
    private Float peRatio;
    private Float dividendYield;
    private Float bookValue;
    private Float epsTtm;
    private Float roe;
    private Float industryPe;
    private String cappedType;
    private Float dividendYieldInPercent;
    private Float faceValue;
    private Float debtToEquity;
    private Float returnOnAssets;
    private Float returnOnEquity;
    private Float cashRatio;
    private Float debtToAsset;
    private Float evToSales;
    private Float evToEbitda;
    private Float earningsYield;
    private Float sectorPb;
    private Float sectorDivYield;
    private Float sectorRoe;
    private Float sectorRoce;
    private Float priceToOcf;
    private Float priceToFcf;
    private Float roic;
    private Float pePremiumVsSector;
    private Float pbPremiumVsSector;
    private Float divYieldVsSector;
    private Float currentRatio;
    private Float sectorPe;
    private Float priceToSales;
    private Float pegRatio;
    private Float yearLowPrice;
    private Float yearHighPrice;
    private Float fiis;
    private Float diis;
    private Float promoters;
    private Float otherDomesticInstitutions;
    private Float retailAndOthers;
    private String symbol;
    private Float roce;
    private Long screenerCompanyId;
    private Long screenerDataWarehouseId;
    private Float operatingProfitMargin;
    private Float interestCoverageRatio;
    private Float marketCapSalesRatio;
    private Float changeFiiHold;
    private Float changeDiiHold;
    private Float epsGrowthThreeYear;

    // Constructors
    public StockDTO() {
    }

    public StockDTO(String isin, Long searchId, String nseScripCode, String bseScripCode, Long growwCompanyId, Long industryId,
                    String industryName, String displayName, String shortName, Float marketCap, Float pbRatio, Float peRatio,
                    Float dividendYield, Float bookValue, Float epsTtm, Float roe, Float industryPe, String cappedType,
                    Float dividendYieldInPercent, Float faceValue, Float debtToEquity, Float returnOnAssets, Float returnOnEquity,
                    Float cashRatio, Float debtToAsset, Float evToSales, Float evToEbitda, Float earningsYield, Float sectorPb,
                    Float sectorDivYield, Float sectorRoe, Float sectorRoce, Float priceToOcf, Float priceToFcf, Float roic,
                    Float pePremiumVsSector, Float pbPremiumVsSector, Float divYieldVsSector, Float currentRatio, Float sectorPe,
                    Float priceToSales, Float pegRatio, Float yearLowPrice, Float yearHighPrice, Float fiis, Float diis,
                    Float promoters, Float otherDomesticInstitutions, Float retailAndOthers, String symbol, Float roce,
                    Long screenerCompanyId, Long screenerDataWarehouseId, Float operatingProfitMargin, Float interestCoverageRatio,
                    Float marketCapSalesRatio, Float changeFiiHold, Float changeDiiHold, Float epsGrowthThreeYear) {
        this.isin = isin;
        this.searchId = searchId;
        this.nseScripCode = nseScripCode;
        this.bseScripCode = bseScripCode;
        this.growwCompanyId = growwCompanyId;
        this.industryId = industryId;
        this.industryName = industryName;
        this.displayName = displayName;
        this.shortName = shortName;
        this.marketCap = marketCap;
        this.pbRatio = pbRatio;
        this.peRatio = peRatio;
        this.dividendYield = dividendYield;
        this.bookValue = bookValue;
        this.epsTtm = epsTtm;
        this.roe = roe;
        this.industryPe = industryPe;
        this.cappedType = cappedType;
        this.dividendYieldInPercent = dividendYieldInPercent;
        this.faceValue = faceValue;
        this.debtToEquity = debtToEquity;
        this.returnOnAssets = returnOnAssets;
        this.returnOnEquity = returnOnEquity;
        this.cashRatio = cashRatio;
        this.debtToAsset = debtToAsset;
        this.evToSales = evToSales;
        this.evToEbitda = evToEbitda;
        this.earningsYield = earningsYield;
        this.sectorPb = sectorPb;
        this.sectorDivYield = sectorDivYield;
        this.sectorRoe = sectorRoe;
        this.sectorRoce = sectorRoce;
        this.priceToOcf = priceToOcf;
        this.priceToFcf = priceToFcf;
        this.roic = roic;
        this.pePremiumVsSector = pePremiumVsSector;
        this.pbPremiumVsSector = pbPremiumVsSector;
        this.divYieldVsSector = divYieldVsSector;
        this.currentRatio = currentRatio;
        this.sectorPe = sectorPe;
        this.priceToSales = priceToSales;
        this.pegRatio = pegRatio;
        this.yearLowPrice = yearLowPrice;
        this.yearHighPrice = yearHighPrice;
        this.fiis = fiis;
        this.diis = diis;
        this.promoters = promoters;
        this.otherDomesticInstitutions = otherDomesticInstitutions;
        this.retailAndOthers = retailAndOthers;
        this.symbol = symbol;
        this.roce = roce;
        this.screenerCompanyId = screenerCompanyId;
        this.screenerDataWarehouseId = screenerDataWarehouseId;
        this.operatingProfitMargin = operatingProfitMargin;
        this.interestCoverageRatio = interestCoverageRatio;
        this.marketCapSalesRatio = marketCapSalesRatio;
        this.changeFiiHold = changeFiiHold;
        this.changeDiiHold = changeDiiHold;
        this.epsGrowthThreeYear = epsGrowthThreeYear;
    }

    // Getters and Setters

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public Long getSearchId() {
        return searchId;
    }

    public void setSearchId(Long searchId) {
        this.searchId = searchId;
    }

    public String getNseScripCode() {
        return nseScripCode;
    }

    public void setNseScripCode(String nseScripCode) {
        this.nseScripCode = nseScripCode;
    }

    public String getBseScripCode() {
        return bseScripCode;
    }

    public void setBseScripCode(String bseScripCode) {
        this.bseScripCode = bseScripCode;
    }

    public Long getGrowwCompanyId() {
        return growwCompanyId;
    }

    public void setGrowwCompanyId(Long growwCompanyId) {
        this.growwCompanyId = growwCompanyId;
    }

    public Long getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Float getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Float marketCap) {
        this.marketCap = marketCap;
    }

    public Float getPbRatio() {
        return pbRatio;
    }

    public void setPbRatio(Float pbRatio) {
        this.pbRatio = pbRatio;
    }

    public Float getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(Float peRatio) {
        this.peRatio = peRatio;
    }

    public Float getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(Float dividendYield) {
        this.dividendYield = dividendYield;
    }

    public Float getBookValue() {
        return bookValue;
    }

    public void setBookValue(Float bookValue) {
        this.bookValue = bookValue;
    }

    public Float getEpsTtm() {
        return epsTtm;
    }

    public void setEpsTtm(Float epsTtm) {
        this.epsTtm = epsTtm;
    }

    public Float getRoe() {
        return roe;
    }

    public void setRoe(Float roe) {
        this.roe = roe;
    }

    public Float getIndustryPe() {
        return industryPe;
    }

    public void setIndustryPe(Float industryPe) {
        this.industryPe = industryPe;
    }

    public String getCappedType() {
        return cappedType;
    }

    public void setCappedType(String cappedType) {
        this.cappedType = cappedType;
    }

    public Float getDividendYieldInPercent() {
        return dividendYieldInPercent;
    }

    public void setDividendYieldInPercent(Float dividendYieldInPercent) {
        this.dividendYieldInPercent = dividendYieldInPercent;
    }

    public Float getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Float faceValue) {
        this.faceValue = faceValue;
    }

    public Float getDebtToEquity() {
        return debtToEquity;
    }

    public void setDebtToEquity(Float debtToEquity) {
        this.debtToEquity = debtToEquity;
    }

    public Float getReturnOnAssets() {
        return returnOnAssets;
    }

    public void setReturnOnAssets(Float returnOnAssets) {
        this.returnOnAssets = returnOnAssets;
    }

    public Float getReturnOnEquity() {
        return returnOnEquity;
    }

    public void setReturnOnEquity(Float returnOnEquity) {
        this.returnOnEquity = returnOnEquity;
    }

    public Float getCashRatio() {
        return cashRatio;
    }

    public void setCashRatio(Float cashRatio) {
        this.cashRatio = cashRatio;
    }

    public Float getDebtToAsset() {
        return debtToAsset;
    }

    public void setDebtToAsset(Float debtToAsset) {
        this.debtToAsset = debtToAsset;
    }

    public Float getEvToSales() {
        return evToSales;
    }

    public void setEvToSales(Float evToSales) {
        this.evToSales = evToSales;
    }

    public Float getEvToEbitda() {
        return evToEbitda;
    }

    public void setEvToEbitda(Float evToEbitda) {
        this.evToEbitda = evToEbitda;
    }

    public Float getEarningsYield() {
        return earningsYield;
    }

    public void setEarningsYield(Float earningsYield) {
        this.earningsYield = earningsYield;
    }

    public Float getSectorPb() {
        return sectorPb;
    }

    public void setSectorPb(Float sectorPb) {
        this.sectorPb = sectorPb;
    }

    public Float getSectorDivYield() {
        return sectorDivYield;
    }

    public void setSectorDivYield(Float sectorDivYield) {
        this.sectorDivYield = sectorDivYield;
    }

    public Float getSectorRoe() {
        return sectorRoe;
    }

    public void setSectorRoe(Float sectorRoe) {
        this.sectorRoe = sectorRoe;
    }

    public Float getSectorRoce() {
        return sectorRoce;
    }

    public void setSectorRoce(Float sectorRoce) {
        this.sectorRoce = sectorRoce;
    }

    public Float getPriceToOcf() {
        return priceToOcf;
    }

    public void setPriceToOcf(Float priceToOcf) {
        this.priceToOcf = priceToOcf;
    }

    public Float getPriceToFcf() {
        return priceToFcf;
    }

    public void setPriceToFcf(Float priceToFcf) {
        this.priceToFcf = priceToFcf;
    }

    public Float getRoic() {
        return roic;
    }

    public void setRoic(Float roic) {
        this.roic = roic;
    }

    public Float getPePremiumVsSector() {
        return pePremiumVsSector;
    }

    public void setPePremiumVsSector(Float pePremiumVsSector) {
        this.pePremiumVsSector = pePremiumVsSector;
    }

    public Float getPbPremiumVsSector() {
        return pbPremiumVsSector;
    }

    public void setPbPremiumVsSector(Float pbPremiumVsSector) {
        this.pbPremiumVsSector = pbPremiumVsSector;
    }

    public Float getDivYieldVsSector() {
        return divYieldVsSector;
    }

    public void setDivYieldVsSector(Float divYieldVsSector) {
        this.divYieldVsSector = divYieldVsSector;
    }

    public Float getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(Float currentRatio) {
        this.currentRatio = currentRatio;
    }

    public Float getSectorPe() {
        return sectorPe;
    }

    public void setSectorPe(Float sectorPe) {
        this.sectorPe = sectorPe;
    }

    public Float getPriceToSales() {
        return priceToSales;
    }

    public void setPriceToSales(Float priceToSales) {
        this.priceToSales = priceToSales;
    }

    public Float getPegRatio() {
        return pegRatio;
    }

    public void setPegRatio(Float pegRatio) {
        this.pegRatio = pegRatio;
    }

    public Float getYearLowPrice() {
        return yearLowPrice;
    }

    public void setYearLowPrice(Float yearLowPrice) {
        this.yearLowPrice = yearLowPrice;
    }

    public Float getYearHighPrice() {
        return yearHighPrice;
    }

    public void setYearHighPrice(Float yearHighPrice) {
        this.yearHighPrice = yearHighPrice;
    }

    public Float getFiis() {
        return fiis;
    }

    public void setFiis(Float fiis) {
        this.fiis = fiis;
    }

    public Float getDiis() {
        return diis;
    }

    public void setDiis(Float diis) {
        this.diis = diis;
    }

    public Float getPromoters() {
        return promoters;
    }

    public void setPromoters(Float promoters) {
        this.promoters = promoters;
    }

    public Float getOtherDomesticInstitutions() {
        return otherDomesticInstitutions;
    }

    public void setOtherDomesticInstitutions(Float otherDomesticInstitutions) {
        this.otherDomesticInstitutions = otherDomesticInstitutions;
    }

    public Float getRetailAndOthers() {
        return retailAndOthers;
    }

    public void setRetailAndOthers(Float retailAndOthers) {
        this.retailAndOthers = retailAndOthers;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Float getRoce() {
        return roce;
    }

    public void setRoce(Float roce) {
        this.roce = roce;
    }

    public Long getScreenerCompanyId() {
        return screenerCompanyId;
    }

    public void setScreenerCompanyId(Long screenerCompanyId) {
        this.screenerCompanyId = screenerCompanyId;
    }

    public Long getScreenerDataWarehouseId() {
        return screenerDataWarehouseId;
    }

    public void setScreenerDataWarehouseId(Long screenerDataWarehouseId) {
        this.screenerDataWarehouseId = screenerDataWarehouseId;
    }

    public Float getOperatingProfitMargin() {
        return operatingProfitMargin;
    }

    public void setOperatingProfitMargin(Float operatingProfitMargin) {
        this.operatingProfitMargin = operatingProfitMargin;
    }

    public Float getInterestCoverageRatio() {
        return interestCoverageRatio;
    }

    public void setInterestCoverageRatio(Float interestCoverageRatio) {
        this.interestCoverageRatio = interestCoverageRatio;
    }

    public Float getMarketCapSalesRatio() {
        return marketCapSalesRatio;
    }

    public void setMarketCapSalesRatio(Float marketCapSalesRatio) {
        this.marketCapSalesRatio = marketCapSalesRatio;
    }

    public Float getChangeFiiHold() {
        return changeFiiHold;
    }

    public void setChangeFiiHold(Float changeFiiHold) {
        this.changeFiiHold = changeFiiHold;
    }

    public Float getChangeDiiHold() {
        return changeDiiHold;
    }

    public void setChangeDiiHold(Float changeDiiHold) {
        this.changeDiiHold = changeDiiHold;
    }

    public Float getEpsGrowthThreeYear() {
        return epsGrowthThreeYear;
    }

    public void setEpsGrowthThreeYear(Float epsGrowthThreeYear) {
        this.epsGrowthThreeYear = epsGrowthThreeYear;
    }

    @Override
    public String toString() {
        return "StockDTO{" +
                "isin='" + isin + '\'' +
                ", searchId=" + searchId +
                ", nseScripCode='" + nseScripCode + '\'' +
                ", bseScripCode='" + bseScripCode + '\'' +
                ", growwCompanyId=" + growwCompanyId +
                ", industryId=" + industryId +
                ", industryName='" + industryName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", marketCap=" + marketCap +
                ", pbRatio=" + pbRatio +
                ", peRatio=" + peRatio +
                ", dividendYield=" + dividendYield +
                ", bookValue=" + bookValue +
                ", epsTtm=" + epsTtm +
                ", roe=" + roe +
                ", industryPe=" + industryPe +
                ", cappedType='" + cappedType + '\'' +
                ", dividendYieldInPercent=" + dividendYieldInPercent +
                ", faceValue=" + faceValue +
                ", debtToEquity=" + debtToEquity +
                ", returnOnAssets=" + returnOnAssets +
                ", returnOnEquity=" + returnOnEquity +
                ", cashRatio=" + cashRatio +
                ", debtToAsset=" + debtToAsset +
                ", evToSales=" + evToSales +
                ", evToEbitda=" + evToEbitda +
                ", earningsYield=" + earningsYield +
                ", sectorPb=" + sectorPb +
                ", sectorDivYield=" + sectorDivYield +
                ", sectorRoe=" + sectorRoe +
                ", sectorRoce=" + sectorRoce +
                ", priceToOcf=" + priceToOcf +
                ", priceToFcf=" + priceToFcf +
                ", roic=" + roic +
                ", pePremiumVsSector=" + pePremiumVsSector +
                ", pbPremiumVsSector=" + pbPremiumVsSector +
                ", divYieldVsSector=" + divYieldVsSector +
                ", currentRatio=" + currentRatio +
                ", sectorPe=" + sectorPe +
                ", priceToSales=" + priceToSales +
                ", pegRatio=" + pegRatio +
                ", yearLowPrice=" + yearLowPrice +
                ", yearHighPrice=" + yearHighPrice +
                ", fiis=" + fiis +
                ", diis=" + diis +
                ", promoters=" + promoters +
                ", otherDomesticInstitutions=" + otherDomesticInstitutions +
                ", retailAndOthers=" + retailAndOthers +
                ", symbol='" + symbol + '\'' +
                ", roce=" + roce +
                ", screenerCompanyId=" + screenerCompanyId +
                ", screenerDataWarehouseId=" + screenerDataWarehouseId +
                ", operatingProfitMargin=" + operatingProfitMargin +
                ", interestCoverageRatio=" + interestCoverageRatio +
                ", marketCapSalesRatio=" + marketCapSalesRatio +
                ", changeFiiHold=" + changeFiiHold +
                ", changeDiiHold=" + changeDiiHold +
                ", epsGrowthThreeYear=" + epsGrowthThreeYear +
                '}';
    }
}
