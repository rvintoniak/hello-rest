package endpoints;

import beans.User;
import services.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Roman on 04.02.2016.
 */
@Path("/user")
public class UserController {
    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
        GenericEntity<List<User>> entity =
                new GenericEntity<List<User>>(userService.getAllUsers()) {};
        return Response.ok(entity).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response getUserById(@PathParam("id") Long id){
        GenericEntity<User> entity =
                new GenericEntity<User>(userService.getUserById(id)) {};
        return Response.ok(entity).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUser(User user){
        userService.addUser(user);
        GenericEntity<User> entity =
                new GenericEntity<User>(user) {};
        return Response.ok(entity).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateUser(User user){
        userService.updateUser(user);
        GenericEntity<User> entity =
                new GenericEntity<User>(user) {};
        return Response.ok(entity).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response removeUser(@PathParam("id") Long id){
        userService.removeUser(id);
        GenericEntity<List<User>> entity =
                new GenericEntity<List<User>>(userService.getAllUsers()){};
        return Response.ok(entity).build();
    }



}
