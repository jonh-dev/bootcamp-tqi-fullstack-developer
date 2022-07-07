package dio.beanscomponents;

import com.google.gson.Gson;
import dio.beanscomponents.app.ConversorJson;
import dio.beanscomponents.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeansComponentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansComponentsApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception{
		return args -> {
			String json = "{\"cep\": \"83260-000\", \"logradouro\": \"Adaelton Jr de lima\", \"localidade\": \"Matinhos\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}
}
