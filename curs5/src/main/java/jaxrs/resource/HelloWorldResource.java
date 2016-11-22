package jaxrs.resource;

/**
 * Created by Mihai MOGOS on 22/11/16.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("helloworld")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public String getHello() {
        return "Hello JAX-RX";
    }

}
