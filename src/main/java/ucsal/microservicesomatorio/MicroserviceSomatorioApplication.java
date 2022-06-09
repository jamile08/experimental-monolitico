package ucsal.microservicesomatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceSomatorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSomatorioApplication.class, args);
	}

}
