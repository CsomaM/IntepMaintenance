package com.intep.maintenance.controllers;

import com.intep.maintenance.modules.Client;
import com.intep.maintenance.repository.MaintenanceTable;
import com.intep.maintenance.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MaintenanceController {

    @Autowired
    ClientService clientService;

    @RequestMapping({"","/"})
    public String index (Model model) {
        model.addAttribute("clients", clientService.getAllClients());
        return "maintenance";
    }
    
    @RequestMapping({"/mobil"})
    public String mobileIndex (Model model) {
        model.addAttribute("clients", clientService.getAllClients());
        return "mobileMaintenance";
    }

    @RequestMapping("/add")
    public String add (Model model){
        model.addAttribute("newClient", new Client());
        model.addAttribute("clients", clientService.getAllClients());
        return "addclient";
    }

    @PostMapping("/addclient")
    public String addPost(@ModelAttribute Client client) {
        clientService.addNewClient(client);
        return "redirect:/";
    }

   @RequestMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
       clientService.deleteClient(id);
       return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public String clientEdit(@PathVariable Long id, Model model) {
        Client editedClient = clientService.findClient(id);
        model.addAttribute("editedClient", editedClient);
        return "editclient";
    }
    

    @PostMapping("/editclient")
    public String editClient(@ModelAttribute Client editedClient) {
        clientService.updateClient(editedClient.getId(), editedClient);
        return "redirect:/";
    }
}
