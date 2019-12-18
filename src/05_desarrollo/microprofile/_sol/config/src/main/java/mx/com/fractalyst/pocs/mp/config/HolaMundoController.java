package mx.com.fractalyst.pocs.mp.config;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Path("/hola")
@Singleton
public class HolaMundoController {

    @GET
    public String saluda() {
        return "Hola Mundo";
    }
}
