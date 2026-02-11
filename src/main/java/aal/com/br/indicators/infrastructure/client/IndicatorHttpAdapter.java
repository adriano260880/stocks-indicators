package aal.com.br.indicators.infrastructure.client;

import aal.com.br.indicators.application.port.output.IndicatorClientPort;
import aal.com.br.indicators.domain.model.StockIndicator;
import org.springframework.stereotype.Component;

@Component
public class IndicatorHttpAdapter implements IndicatorClientPort {

    private final IndicatorHttpClient httpClient;

    public IndicatorHttpAdapter(IndicatorHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public StockIndicator getIndicator(String stockId) {
        return httpClient.getIndicators(stockId);
    }
}
