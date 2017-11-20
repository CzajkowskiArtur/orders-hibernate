package software.academy.hibermate.dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import software.academy.hibermate.orders.entity.Client;

import static org.junit.Assert.*;

public class ClientDaoImplTest {
    private Logger logger = Logger.getLogger(ClientDaoImpl.class);
    @Test
    public void findById() throws Exception {
        ClientDao clientDao = new ClientDaoImpl();
        Client client = clientDao.findById(1);
        logger.info(client.getEmail());
    }

}