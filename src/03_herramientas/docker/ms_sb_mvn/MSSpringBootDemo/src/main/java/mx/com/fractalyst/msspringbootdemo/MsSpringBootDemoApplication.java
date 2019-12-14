package mx.com.fractalyst.msspringbootdemo;

import javax.servlet.ServletContextListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import mx.com.fractalyst.msspringbootdemo.web.GestorDatosListener;

@SpringBootApplication
public class MsSpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringBootDemoApplication.class, args);
	}
	  // Register ServletContextListener
	  @Bean
	  public ServletListenerRegistrationBean<ServletContextListener> listenerRegistrationBean() {
	    ServletListenerRegistrationBean<ServletContextListener> bean = 
	        new ServletListenerRegistrationBean<>();
	    bean.setListener(new GestorDatosListener());
	    return bean;

	  }
}
