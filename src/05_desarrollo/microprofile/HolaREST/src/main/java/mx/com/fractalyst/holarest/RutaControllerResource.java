/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.fractalyst.holarest;

import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * REST Web Service
 *
 * @author fractalyst
 */
@Path("/config")
public class RutaControllerResource {

    @Context
    private UriInfo context;

    @Inject
    @ConfigProperty(name = "PATH", defaultValue = "VALOR PREDETERMINADO")
    private String valorExternalizado;
    /**
     * Creates a new instance of RutaControllerResource
     */
    public RutaControllerResource() {
    }

    /**
     * Retrieves representation of an instance of mx.com.fractalyst.holarest.RutaControllerResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/inyeccion")
    @Produces(MediaType.APPLICATION_JSON)
    public Respuesta saluda() {
        //TODO return proper representation object
        return new Respuesta(200, "Hola"+valorExternalizado);
    }
    @Path("/configProvider")
    @GET
    public String getLookupConfigValue() {
        Config config = ConfigProvider.getConfig();
        String value = config.getValue("PATH", String.class);
        return "Config value from ConfigProvider " + value;
    }
}
