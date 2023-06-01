package orderWeb;

import java.util.List;

public class OrderSoapService {
  private OrderService orderService;

  public OrderSoapService(OrderService orderService) {
    this.orderService = orderService;
  }

  // Get an order by ID
  public Order getOrderById(int id) {
    return orderService.getOrderById(id);
  }

  // Get all orders
  public List<Order> getAllOrders() {
    return orderService.getAllOrders();
  }
}
