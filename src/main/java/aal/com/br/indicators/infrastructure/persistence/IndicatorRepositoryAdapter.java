package aal.com.br.indicators.infrastructure.persistence;

import aal.com.br.indicators.application.port.output.IndicatorRepositoryPort;
import aal.com.br.indicators.domain.model.StockIndicator;
import aal.com.br.indicators.infrastructure.persistence.entity.StockIndicatorsEntity;
import aal.com.br.indicators.infrastructure.persistence.repository.SpringDataIndicatorsRepository;
import org.springframework.stereotype.Component;

@Component
public class IndicatorRepositoryAdapter implements IndicatorRepositoryPort {

    private final SpringDataIndicatorsRepository repository;

    public IndicatorRepositoryAdapter(SpringDataIndicatorsRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(StockIndicator indicator) {
        repository.save(new StockIndicatorsEntity(indicator));
    }
}
