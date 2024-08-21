package com.example.Smart.Home.Server.App.service;

import com.example.Smart.Home.Server.App.model.Device;

import java.util.Collection;

public interface IDeviceService {
    Device createDevice(Device device);
    Collection<Device> listOfDevices(int limit);
    Device getDevice(Long id);
    Device updateDevice(Device device);
    Boolean deleteDevice(Long id);
}
