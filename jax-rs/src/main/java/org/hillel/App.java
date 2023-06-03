package org.hillel;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/rest")
public class App extends Application {

  private final Set<Object> singletons = new HashSet<>();
  public App(){
    singletons.add(new HotelController());
  }

  @Override
  public Set<Object> getSingletons() {
    return singletons;
  }
}
