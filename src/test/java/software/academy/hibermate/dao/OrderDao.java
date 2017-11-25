package software.academy.hibermate.dao;

import software.academy.hibermate.orders.entity.Order;

public interface OrderDao {

    public Order findById(Integer id );

    public void save(Order order);
}
