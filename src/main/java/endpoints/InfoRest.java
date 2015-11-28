package endpoints;

import beans.MainInfo;
import beans.ResponseWrapper;
import org.jboss.resteasy.annotations.providers.jackson.Formatted;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by Roman Vintonyak
 */
@Path("/message")
public class InfoRest {

    public static final String TEAM_NAME = "in code we trust";
    public static final String VERSION = "0.0.1";

    @GET
    @Produces("application/json")
    @Formatted
    public Response getInfo(){
        MainInfo mainInfo = new MainInfo(TEAM_NAME, VERSION);
        ResponseWrapper wrapper = new ResponseWrapper(mainInfo);
        return Response.status(200).entity(wrapper).build();
    }

}
