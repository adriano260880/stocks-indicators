package aal.com.br.indicators.application.port.output;

import aal.com.br.indicators.domain.model.StockIndicator;

public interface IndicatorRepositoryPort {
    void save(StockIndicator indicator);
}
