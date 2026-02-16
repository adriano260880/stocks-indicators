package aal.com.br.indicators.adapters.in.web;

import aal.com.br.indicators.application.usecase.IndicatorsUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StocksIndicatorsController {

    private final IndicatorsUseCase indicatorsUseCase;

    public StocksIndicatorsController(IndicatorsUseCase indicatorsUseCase) {
        this.indicatorsUseCase = indicatorsUseCase;
    }
    @PostMapping("stocks")
    public void create(@RequestParam List<String> stocks) {
        indicatorsUseCase.execute(stocks);
    }
}
