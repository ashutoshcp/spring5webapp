package guru.springframework.dependencyInversionPrinciple;

import org.junit.Test;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() {
        SwitchAble switchAbleBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchAbleBulb);
        for (int i = 0; i < 2; i++) {
            bulbPowerSwitch.press();
        }

        SwitchAble switchAbleFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchAbleFan);
        for (int i = 0; i < 3; i++) {
            fanPowerSwitch.press();
        }
    }
}