package com.intep.maintenance.services;

import com.intep.maintenance.modules.Client;
import com.intep.maintenance.repository.MaintenanceTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    MaintenanceTable mt;

    public Iterable<Client> getAllClients() {
        return mt.findAll();
    }

    public void addNewClient(Client client) {
        mt.save(client);
    }

    public void deleteClient(Long id) {
        mt.deleteById(id);
    }

    public Client findClient(Long id) {
        return mt.findById(id).get();
    }

    public void updateClient(Long id, Client clientUpdate) {
        deleteClient(id);
        clientUpdate.setId(id);
        mt.save(clientUpdate);
    }

}
