package com.gesplan.msgeneratepurchase.service;

import com.gesplan.msgeneratepurchase.dao.ClientDao;
import com.gesplan.msgeneratepurchase.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDao clientDao;

    @Override
    public Client getRandomClient() {
        return clientDao.getRandomClient();
    }
}
