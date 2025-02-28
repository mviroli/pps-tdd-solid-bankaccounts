package devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeviceTest {

    public static final int ATTEMPTS = 1000;
    private Device device;

    @BeforeEach
    void init(){
        this.device = new Device();
    }

    @Test
    void isInitiallyOff(){
        assertFalse(device.isOn());
    }

    @Test
    void canBeSwitchedOn(){
        device.switchOn();
        assertTrue(device.isOn());
    }

    @Test
    void canBeSwitchedOff(){
        device.switchOn();
        device.switchOff();
        assertFalse(device.isOn());
    }

    @Test
    void canBeSwitchedOnAndOffMultipleTimes(){
        for (int i = 0; i < ATTEMPTS; i++){
            device.switchOn();
            device.switchOff();
        }
        device.switchOn();
        assertTrue(device.isOn());
    }

    @Test
    void cannotSwitchOnIfAlreadyOn(){
        this.device.switchOn();
        assertThrows(IllegalStateException.class, () -> this.device.switchOn());
    }
}
