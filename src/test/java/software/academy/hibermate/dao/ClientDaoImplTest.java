package software.academy.hibermate.dao;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import software.academy.hibermate.orders.entity.Client;
import software.academy.hibermate.orders.entity.ClientType;

import static org.junit.Assert.*;

public class ClientDaoImplTest {
    private Logger logger = Logger.getLogger(ClientDaoImpl.class);
    @Test
    public void findById() throws Exception {
        ClientDao clientDao = new ClientDaoImpl();
        Client client = clientDao.findById(5);
        logger.info("Email" +client.getEmail());
        logger.info("Street"+client.getAddress().getStreet());
    }






    @Test
    public void shouldSaveClient(){
        ClientDao clientDao = new ClientDaoImpl();
        Client client = new Client("Artur","Czajkowski","braun@com", ClientType.PREMIUM);
        clientDao.save(client);
    }

@Test
    public void shouldUpdateClient(){
        //Given
        ClientDao clientDao = new ClientDaoImpl();
    Client client = new Client(7,"artur","czajkowski","braun@com", ClientType.PREMIUM);
    //When
    clientDao.update(client);

    //Then
    Client clientFromDatabase = clientDao.findById(7);
    Assert.assertEquals("Second name shold be the same","brownie",clientFromDatabase.getSecondName());
}
}