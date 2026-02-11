package aal.com.br.indicators.infrastructure.config;

import aal.com.br.indicators.application.port.output.IndicatorClientPort;
import aal.com.br.indicators.application.port.output.IndicatorRepositoryPort;
import aal.com.br.indicators.application.usecase.IndicatorsUseCase;
import aal.com.br.indicators.infrastructure.client.IndicatorHttpAdapter;
import aal.com.br.indicators.infrastructure.client.IndicatorHttpClient;
import aal.com.br.indicators.infrastructure.persistence.IndicatorRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class IndicatorsConfig {

    @Bean
    public IndicatorsUseCase indicatorsUseCase(
            IndicatorClientPort clientPort,
            IndicatorRepositoryPort repositoryPort) {
        return new IndicatorsUseCase(clientPort, repositoryPort);
    }

}
