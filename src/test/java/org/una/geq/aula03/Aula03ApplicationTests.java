package org.una.geq.aula03;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.una.geq.aula03.domain.ContaTest;
import org.una.geq.aula03.repositories.ContaRepositoryTest;

//@SpringBootTest
@RunWith(JUnitPlatform.class)
@SelectClasses({ContaTest.class, ContaRepositoryTest.class})
class Aula03ApplicationTests {

//	@Test
//	void contextLoads() {
//	}

}
