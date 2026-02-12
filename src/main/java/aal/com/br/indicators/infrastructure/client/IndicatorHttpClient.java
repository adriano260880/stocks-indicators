package aal.com.br.indicators.infrastructure.client;

import aal.com.br.indicators.domain.model.StockIndicator;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface IndicatorHttpClient {
    @GetExchange("/stock/{stockId}")
    StockIndicator getIndicators(@PathVariable(value = "stockId") String stockId);
}
