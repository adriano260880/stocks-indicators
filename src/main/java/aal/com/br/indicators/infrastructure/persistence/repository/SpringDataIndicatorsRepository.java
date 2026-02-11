package aal.com.br.indicators.infrastructure.persistence.repository;

import aal.com.br.indicators.infrastructure.persistence.entity.StockIndicatorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataIndicatorsRepository extends JpaRepository<StockIndicatorsEntity, String> {

}
