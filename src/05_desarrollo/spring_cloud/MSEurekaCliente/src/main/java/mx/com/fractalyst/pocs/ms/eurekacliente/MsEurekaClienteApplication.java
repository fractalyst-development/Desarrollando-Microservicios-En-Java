package mx.com.fractalyst.pocs.ms.eurekacliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsEurekaClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEurekaClienteApplication.class, args);
	}

}
