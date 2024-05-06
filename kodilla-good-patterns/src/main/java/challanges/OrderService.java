package challanges;

import java.util.List;

public interface OrderService {
    OrderStatus createOrder(User user, List<Product> products);
    boolean cancelOrder(Order order);
    OrderStatus getOrderStatus(Order order);
    List<Order> getAllOrders(User user);;
}


