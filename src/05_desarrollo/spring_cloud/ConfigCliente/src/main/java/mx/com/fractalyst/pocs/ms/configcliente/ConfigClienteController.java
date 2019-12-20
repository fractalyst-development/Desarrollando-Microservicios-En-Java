package mx.com.fractalyst.pocs.ms.configcliente;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClienteController {
	
	@Value("${demo.nombreArchivo:Valor default}")
	private String nombreArchivo;

	@GetMapping("/propDemo")
	public String leePropDemo() {
		return nombreArchivo;
	}
}
