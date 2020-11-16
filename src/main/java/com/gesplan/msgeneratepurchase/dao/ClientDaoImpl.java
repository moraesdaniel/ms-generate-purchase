package com.gesplan.msgeneratepurchase.dao;

import com.gesplan.msgeneratepurchase.domain.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class ClientDaoImpl implements ClientDao {
    @Override
    public Client getRandomClient() {
        List<Client> clients = new ArrayList<Client>();

        clients.add(new Client(1, "Larissa Macedo"));
        clients.add(new Client(2, "Claucirlei Jovêncio de Souza"));
        clients.add(new Client(3, "Arlete Pinheiro"));
        clients.add(new Client(4, "Senor Abravanel"));
        clients.add(new Client(5, "Leno Maycon Viana Gomes"));
        clients.add(new Client(6, "José Ivaldo Gomes de Andrade Filho"));
        clients.add(new Client(7, "Maria Augusta Labatut Stresser"));
        clients.add(new Client(8, "Roobertchay Domingues da Rocha Filho"));
        clients.add(new Client(9, "Fátima Palha de Figueiredo"));
        clients.add(new Client(10, "Emival Eterno Costa"));

        Random random = new Random();

        return clients.get(random.nextInt(9));
    }
}
