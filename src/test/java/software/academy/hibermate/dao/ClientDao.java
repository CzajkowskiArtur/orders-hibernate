package software.academy.hibermate.dao;

import software.academy.hibermate.orders.entity.Client;

public interface ClientDao {
    public Client findById(Integer id);
    public void save(Client client);
    public void delete(Integer id);
    public void update(Client client);


}
