package aal.com.br.indicators.application.port.output;

import aal.com.br.indicators.domain.model.StockIndicator;

public interface IndicatorClientPort {
    StockIndicator getIndicator(String stockId);
}
