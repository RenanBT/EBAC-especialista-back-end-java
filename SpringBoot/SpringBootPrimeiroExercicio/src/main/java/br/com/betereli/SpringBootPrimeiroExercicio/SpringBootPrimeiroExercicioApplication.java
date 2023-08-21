package br.com.betereli.SpringBootPrimeiroExercicio;

import br.com.betereli.domain.Cliente;
import br.com.betereli.repository.IClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;


@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.betereli.repository")
@EntityScan("br.com.betereli.*")
@ComponentScan(basePackages = "br.com.betereli")
@Service
public class SpringBootPrimeiroExercicioApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(SpringBootPrimeiroExercicioApplication.class);

	@Autowired
	private IClienteRepository repository;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrimeiroExercicioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Cliente cliente = createCliente();
		repository.save(cliente);

	}

	private Cliente createCliente() {
		return Cliente.builder()
				.cidade("SP")
				.cpf(12312312310L)
				.email("Teste@teste.com")
				.end("End")
				.estado("SP")
				.nome("Teste Spring Boot")
				.numero(102030)
				.tel(10203040L)
				.build();
	}

}
