package mx.com.fractalyst.pocs.mp.config;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 */
@ApplicationPath("/poc")
@ApplicationScoped
public class ConfigRestApplication extends Application {
}
