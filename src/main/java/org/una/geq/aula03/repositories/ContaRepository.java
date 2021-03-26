package org.una.geq.aula03.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.una.geq.aula03.domain.Conta;

@Repository
public class ContaRepository {

    @Autowired
    private ContaRepositoryJPA repositoryJPA;

    public Conta create(Conta conta) {
        return repositoryJPA.save(conta);
    }
}
