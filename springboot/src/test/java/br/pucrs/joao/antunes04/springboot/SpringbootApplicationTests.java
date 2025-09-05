package br.pucrs.joao.antunes04.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGetLivrosDoAutor() {
		// Test the endpoint /livrosautor with a specific author
	}

	@Test
	void testGetLivrosDoAutorEano() {
		// Test the endpoint /livrosautorano/{autor}/ano/{ano} with a specific author and year
	}
}
