package aal.com.br.indicators.infrastructure.config;

import aal.com.br.indicators.infrastructure.client.IndicatorHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpClientConfig {

    @Bean
    public IndicatorHttpClient indicatorHttpClient(
            @Value("${indicators.api.url}") String baseUrl
    ) {

        RestClient restClient = RestClient.builder()
                .baseUrl(baseUrl)
                .build();

        RestClientAdapter adapter = RestClientAdapter.create(restClient);

        HttpServiceProxyFactory factory =
                HttpServiceProxyFactory
                        .builderFor(adapter)
                        .build();

        return factory.createClient(IndicatorHttpClient.class);
    }
}
