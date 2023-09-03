package br.com.spring.cineverse;

import br.com.spring.cineverse.model.DadosSerie;
import br.com.spring.cineverse.service.ConverteDados;
import br.com.spring.cineverse.service.ObterAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineverseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CineverseApplication.class, args);
	}

	//CommandLineRunner é executada apenas na inicialização da aplicação
	// Comumente usada para tarefas como carregar o banco de dados, chegar integridade, chegar conexões de rede.
	@Override
	public void run(String... args) throws Exception {
		var obterAPI = new ObterAPI();
		var json = obterAPI.obterDados("http://www.omdbapi.com/?t=gilmore+girls&apikey=a29384bc");
		System.out.println(json);
		ConverteDados converte = new ConverteDados();
		DadosSerie dados = converte.obterDados(json,DadosSerie.class);
		System.out.println(dados);
	}
}
