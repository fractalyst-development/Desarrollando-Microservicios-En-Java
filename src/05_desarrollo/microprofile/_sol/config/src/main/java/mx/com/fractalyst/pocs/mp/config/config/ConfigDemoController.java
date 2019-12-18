package mx.com.fractalyst.pocs.mp.config.config;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/config")
@RequestScoped
public class ConfigDemoController {

    @Inject
    @ConfigProperty(name = "variable.en.archivo", defaultValue = "VALOR PREDETERMINADO")
    private String valorVariableInyectada;

    @Path("/variableArchivoInyectada")
    @GET
    public String getValorArchivoInyeccion() {
        return "Valor recuperado mediante CDI: " + valorVariableInyectada;
    }

    @Path("/variableArchivoConfigProvider")
    @GET
    public String getValorArchivoConfigProvider() {
        Config config = ConfigProvider.getConfig();
        String value = config.getValue("variable2.en.archivo", String.class);
        return "Valor recuperado mediante ConfigProvider " + value;
    }

    //
    @Inject
    @ConfigProperty(name = "MP_CONFIG_VAR", defaultValue = "VALOR PREDETERMINADO")
    private String valorVariableEnv;

    @Path("/variableEnvInyectada")
    @GET
    public String getValorEnvInyeccion() {
        return "Valor recuperado mediante CDI: " + valorVariableEnv;
    }

    @Path("/variableEnvConfigProvider")
    @GET
    public String getValorEnvConfigProvider() {
        Config config = ConfigProvider.getConfig();
        String value = config.getValue("MP_CONFIG_VAR", String.class);
        return "Valor recuperado mediante ConfigProvider: " + value;
    }

    @Inject
    @ConfigProperty(name = "JAVA_VAR", defaultValue = "VALOR PREDETERMINADO")
    private String valorVariableJVM;

    @Path("/variableJVMInyectada")
    @GET
    public String getValorJVMInyeccion() {
        return "Valor recuperado mediante CDI: " + valorVariableJVM;
    }

    @Path("/variableJVMConfigProvider")
    @GET
    public String getValorJVMConfigProvider() {
        Config config = ConfigProvider.getConfig();
        String value = config.getValue("JAVA_VAR", String.class);
        return "Valor recuperado mediante ConfigProvider: " + value;
    }

    //
    @Inject
    @ConfigProperty(name = "VARIABLE_NO_DEFINIDA", defaultValue = "VALOR PREDETERMINADO")
    private String valorVariableNoDefinida;

    @Path("/variableNoDefinidaInyectada")
    @GET
    public String getValorNoDefinidaInyeccion() {
        return "Valor recuperado mediante CDI: " + valorVariableNoDefinida;
    }

    @Path("/variableNoDefinidaConfigProvider")
    @GET
    public String getValorNoDefinidaConfigProvider() {
        Config config = ConfigProvider.getConfig();
        String value = config.getValue("VARIABLE_NO_DEFINIDA", String.class);
        return "Valor recuperado mediante ConfigProvider: " + value;
    }
}