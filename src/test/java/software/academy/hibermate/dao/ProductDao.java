package software.academy.hibermate.dao;

import software.academy.hibermate.orders.entity.Product;

public interface ProductDao {

    public Product findById(Integer id);
}
