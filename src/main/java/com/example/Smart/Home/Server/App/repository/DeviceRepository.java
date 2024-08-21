package com.example.Smart.Home.Server.App.repository;

import com.example.Smart.Home.Server.App.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {

    Device findByName(String name);

}
