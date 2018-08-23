package com.intep.maintenance.controllers;

import com.intep.maintenance.modules.Client;
import com.intep.maintenance.repository.MaintenanceTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MaintenanceController {

    @Autowired
    MaintenanceTable mt;

    @RequestMapping({"","/"})
    public String index (Model model) {
        model.addAttribute("clients", mt.findAll());
        return "maintenance";
    }

    @RequestMapping("/add")
    public String add (Model model){
        model.addAttribute("newClient", new Client());
        return "addclient";
    }
}
