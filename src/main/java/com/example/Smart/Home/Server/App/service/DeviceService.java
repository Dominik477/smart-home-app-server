package com.example.Smart.Home.Server.App.service;

import com.example.Smart.Home.Server.App.model.Device;
import com.example.Smart.Home.Server.App.repository.DeviceRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class DeviceService implements IDeviceService {

    private DeviceRepository deviceRepository;

    @Override
    public Device createDevice(Device device) {
        log.info("Saving new device: {}", device.getName());
        return deviceRepository.save(device);
    }



    @Override
    public Collection<Device> listOfDevices(int limit) {
       log.info("Fetching all devices");
       return deviceRepository.findAll(PageRequest.of(0, limit)).toList();
    }

    @Override
    public Device getDevice(Long id) {
        log.info("Fetching device by ID {}", id);
        return deviceRepository.findById(id).get();
    }

    @Override
    public Device updateDevice(Device device) {
        log.info("Updating device: {}", device.getName());
        return deviceRepository.save(device);    }

    @Override
    public Boolean deleteDevice(Long id) {
        log.info("Deleting device by ID: {}", id);
        deviceRepository.deleteById(id);
        return Boolean.TRUE;
    }


}
