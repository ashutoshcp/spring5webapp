package guru.springframework.dependencyInversionPrinciple;

import lombok.Getter;

public class ElectricPowerSwitch implements Switch {

    private SwitchAble client;

    @Getter
    private boolean on;

    ElectricPowerSwitch(SwitchAble client) {
        this.client = client;
        this.on = false;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }

}
