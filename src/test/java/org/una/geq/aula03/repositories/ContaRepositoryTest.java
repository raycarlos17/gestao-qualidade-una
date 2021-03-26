package org.una.geq.aula03.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.una.geq.aula03.domain.Conta;

@SpringBootTest
public class ContaRepositoryTest {

    @Autowired
    private ContaRepository contaRepository;

    @Test
    void test_create_conta() {
        Conta conta = new Conta();
        conta.setAgencia("Floriano Peixoto");
        conta.setCpfTitular("111.222.333-44");
        conta.validate();
        conta = contaRepository.create(conta);
        Assert.notNull(conta.getNumero(), "Número da conta com valor nullo!");
    }
}
