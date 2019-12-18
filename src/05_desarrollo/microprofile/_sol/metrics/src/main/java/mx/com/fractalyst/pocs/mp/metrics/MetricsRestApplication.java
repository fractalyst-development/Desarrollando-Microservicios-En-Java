package mx.com.fractalyst.pocs.mp.metrics;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 */
@ApplicationPath("/data")
@ApplicationScoped
public class MetricsRestApplication extends Application {
}
