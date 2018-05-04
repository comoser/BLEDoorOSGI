package com.da.osgi.provider;

import org.eclipse.kura.bluetooth.le.BluetoothLeService;
import org.eclipse.kura.configuration.ConfigurableComponent;

public class BluetoothService implements ConfigurableComponent {

    private BluetoothLeService bluetoothLeService;

    public void setBluetoothLeService(BluetoothLeService bluetoothLeService) {
        this.bluetoothLeService = bluetoothLeService;
        
    }

    public void unsetBluetoothLeService(BluetoothLeService bluetoothLeService) {
        this.bluetoothLeService = null;
    }
}
