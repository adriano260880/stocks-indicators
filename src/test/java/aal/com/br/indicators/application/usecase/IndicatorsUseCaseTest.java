package aal.com.br.indicators.application.usecase;

import aal.com.br.indicators.application.port.output.IndicatorClientPort;
import aal.com.br.indicators.application.port.output.IndicatorRepositoryPort;
import aal.com.br.indicators.domain.model.StockIndicator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class IndicatorsUseCaseTest {

    @Test
    void shouldGetIndicatorsOfStocks() {
        IndicatorClientPort clientPort = mock(IndicatorClientPort.class);
        IndicatorRepositoryPort repositoryPort = mock(IndicatorRepositoryPort.class);

        IndicatorsUseCase useCase = new IndicatorsUseCase(clientPort,repositoryPort);

        List<String> stocks = List.of("TAEE11", "ITUB4");

        when(clientPort.getIndicator(anyString())).thenReturn(getIndicators());

        useCase.execute(stocks);

        StockIndicator indicator = getIndicators();


        verify(clientPort).getIndicator("TAEE11");
        verify(clientPort).getIndicator("ITUB4");
        verify(repositoryPort, times(2)).save(indicator);
    }

    StockIndicator getIndicators() {
        StockIndicator indicator = new StockIndicator();
        indicator.setCompany("Taesa");
        indicator.setPl(BigDecimal.valueOf(1L));
        indicator.setPvp(BigDecimal.valueOf(1L));
        indicator.setPrice(BigDecimal.valueOf(1L));
        indicator.setDividendYield(BigDecimal.valueOf(1L));
        indicator.setRoe(BigDecimal.valueOf(1L));
        indicator.setEnterpriseValue(BigDecimal.valueOf(1L));
        indicator.setLastQuotationDate(LocalDate.now());
        indicator.setMarketValue(BigDecimal.valueOf(1L));

        return indicator;
    }

}