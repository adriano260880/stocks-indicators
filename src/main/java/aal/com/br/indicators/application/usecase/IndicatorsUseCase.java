package aal.com.br.indicators.application.usecase;

import aal.com.br.indicators.application.port.output.IndicatorClientPort;
import aal.com.br.indicators.application.port.output.IndicatorRepositoryPort;

import java.util.List;

public class IndicatorsUseCase {

    private final IndicatorClientPort clientPort;
    private final IndicatorRepositoryPort repositoryPort;


    public IndicatorsUseCase(IndicatorClientPort clientPort, IndicatorRepositoryPort repositoryPort) {
        this.clientPort = clientPort;
        this.repositoryPort = repositoryPort;
    }

    public void execute(List<String> stocks) {
        for (String stock : stocks) {
            var indicator = clientPort.getIndicator(stock);
            repositoryPort.save(indicator);
        }
    }
}
