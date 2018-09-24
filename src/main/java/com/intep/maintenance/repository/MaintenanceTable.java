package com.intep.maintenance.repository;

import com.intep.maintenance.modules.Client;
import org.springframework.data.repository.CrudRepository;

public interface MaintenanceTable extends CrudRepository <Client, Long> {

}
