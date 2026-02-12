package aal.com.br.indicators.infrastructure.persistence.entity;

import aal.com.br.indicators.domain.model.StockIndicator;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "stock_indicators")
@Data
@NoArgsConstructor
public class StockIndicatorsEntity {

    @Id
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

    public StockIndicatorsEntity(StockIndicator stockIndicator) {
        this.company = stockIndicator.getCompany();
        this.dividendYield = stockIndicator.getDividendYield();
        this.enterpriseValue = stockIndicator.getEnterpriseValue();
        this.pl = stockIndicator.getPl();
        this.netDebt = stockIndicator.getNetDebt();
        this.lastQuotationDate = stockIndicator.getLastQuotationDate();
        this.marketValue = stockIndicator.getMarketValue();
        this.netProfit = stockIndicator.getNetProfit();
        this.netRevenue = stockIndicator.getNetRevenue();
        this.price = stockIndicator.getPrice();
        this.pvp = stockIndicator.getPvp();
        this.roe = stockIndicator.getRoe();
        this.roic = stockIndicator.getRoic();
        this.ticker = stockIndicator.getTicker();
    }
}
