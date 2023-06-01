package orderWeb;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class OrderService {
  private final OrderRepository orderRepository = new OrderRepository();

  public OrderService() {
  }

  @WebMethod
  public Order getOrderById(int id) {
    return orderRepository.getOrderById(id);
  }

  @WebMethod
  public List<Order> getAllOrders() {
    return orderRepository.getAllOrders();
  }

  @WebMethod
  public void addOrder(Order order) {
    orderRepository.addOrder(order);
  }

}
