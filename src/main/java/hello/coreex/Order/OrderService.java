package hello.coreex.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
