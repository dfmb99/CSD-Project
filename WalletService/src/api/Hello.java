package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/bonjour")
public class Hello {
 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String direBonjour() {
        return "Bonjour, tout le monde!";
    }
}