package br.ufjf.dcc193.exm00;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

	public static void main(final String[] args) {
		ConfigurableApplicationContext contexto = SpringApplication.run(MainApplication.class, args);
		System.out.println("Hello World!");

		final Missao m1 = contexto.getBean(Missao.class);
		m1.Resolver();

		final Missao m2 = contexto.getBean(Missao.class);
		m2.Resolver();
	}

}
