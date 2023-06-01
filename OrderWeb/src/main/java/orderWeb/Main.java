package orderWeb;

import javax.xml.ws.Endpoint;
import lombok.SneakyThrows;


public class Main {
  private static final String ADDRESS = "http://localhost:8888/orders?wsdl";
  private static final Object SERVICE = new OrderService();

  public static void main(String[] args) {
    Endpoint endpoint = Endpoint.publish(ADDRESS, SERVICE);
    System.out.println("Endpoint: " + ADDRESS);
    sleep();
    endpoint.stop();
  }

  @SneakyThrows
  private static void sleep() {
    while (true) {
      Thread.sleep(1000000);
    }
  }
}
