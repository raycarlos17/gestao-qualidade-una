package org.una.geq.aula03.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class ContaTest {

    @Test
    void test_conta_valida() {
        Conta conta = new Conta();
        conta.setAgencia("Agência 44");
        conta.setCpfTitular("111.222.333-44");
        conta.validate();
    }

    @Test
    void test_conta_invalida() {
        Conta conta = new Conta();
        assertThrows(IllegalArgumentException.class, () -> {
            conta.validate();
        });
    }

}
