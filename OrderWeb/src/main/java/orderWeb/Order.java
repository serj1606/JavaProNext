package orderWeb;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {
  private int id;
  private String date;
  private double cost;
  private List<Product> products;

  public Order(int id, String date, double cost) {
    this.id = id;
    this.date = date;
    this.cost = cost;
    this.products = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public String getDate() {
    return date;
  }

  public double getCost() {
    return cost;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void addProduct(Product product) {
    products.add(product);
  }
}
