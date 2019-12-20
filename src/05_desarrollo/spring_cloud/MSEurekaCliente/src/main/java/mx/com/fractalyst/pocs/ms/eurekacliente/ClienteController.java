package mx.com.fractalyst.pocs.ms.eurekacliente;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClienteController.class);
	@Autowired
	private DiscoveryClient descubrimientoClientes;

	@Value("${server.port}")
	private String puerto;

	@GetMapping("/instancias")
	public List<ServiceInstance> obtenInfoInstancias() {
		List<ServiceInstance> instances = descubrimientoClientes.getInstances("SERVICIO-DE-CLIENTES");
		LOGGER.info("INSTANCIAS: cantidad={}", instances.size());
		instances.stream().forEach(it -> LOGGER.info("INSTANCIAS: id={}, puerto={}", it.getServiceId(), it.getPort()));
		return instances;
	}

	/*
	 */
	@GetMapping("/zona")
	public String puerto() {
		return "Cliente con puerto: " + puerto;
	}

}
