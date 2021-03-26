package org.una.geq.aula03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.una.geq.aula03.domain.Conta;

@Repository
public interface ContaRepositoryJPA extends JpaRepository<Conta, Long> {
}
