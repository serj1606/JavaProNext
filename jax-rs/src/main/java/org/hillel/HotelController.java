package org.hillel;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hotels")
public class HotelController {

  @GET
  @Path("/hi") // метод делает как в сервлетах doGet (класс WelcomeServlet)
  public Response hi(){
    return Response.ok("hi").build();
  }
  @GET
  @Path("/hello")
  public Response hello(){
    return Response.ok("hello there").build();
  }
}
