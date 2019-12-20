package mx.com.fractalyst.pocs.sb.hm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbHolaMundo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		SpringApplication.run(SbHolaMundo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("run:Hola Mundo");
	}

}
