package aal.com.br.indicators.infrastructure.config;

import aal.com.br.indicators.application.port.output.IndicatorClientPort;
import aal.com.br.indicators.application.port.output.IndicatorRepositoryPort;
import aal.com.br.indicators.application.usecase.IndicatorsUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IndicatorsConfig {

    @Bean
    public IndicatorsUseCase indicatorsUseCase(
            IndicatorClientPort clientPort,
            IndicatorRepositoryPort repositoryPort) {
        return new IndicatorsUseCase(clientPort, repositoryPort);
    }

}
