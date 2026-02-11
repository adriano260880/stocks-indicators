package aal.com.br.indicators.domain.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class StockIndicator {

    private String ticker;
    private String company;
    private BigDecimal price;
    private LocalDate lastQuotationDate;

    // Valuation
    private BigDecimal pl;
    private BigDecimal pvp;
    private BigDecimal marketValue;
    private BigDecimal enterpriseValue;

    // Profitability
    private BigDecimal dividendYield;
    private BigDecimal roe;
    private BigDecimal roic;

    // Financials
    private BigDecimal netRevenue;
    private BigDecimal netProfit;
    private BigDecimal netDebt;
}
