
import org.example.client.generated.Order;
import org.example.client.generated.OrderService;
import org.example.client.generated.OrderServiceService;

public class Main {
  public static void main(String[] args) {
    System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
    System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump",
        "true");
    System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
    System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
    System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");

    OrderService service = new OrderServiceService().getOrderServicePort();

    Order order = new Order();
    order.setId(1);
    order.setDate("Car");
    order.setCost(250.5);

    service.getOrderById(1);
    service.getAllOrders();
  }
}

