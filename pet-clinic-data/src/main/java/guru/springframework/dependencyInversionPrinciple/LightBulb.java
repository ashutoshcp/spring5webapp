package guru.springframework.dependencyInversionPrinciple;

public class LightBulb implements SwitchAble {
  @Override
  public void turnOn() {
    System.out.println("LightBulb: Bulb turned on...");
  }

  @Override
  public void turnOff() {
    System.out.println("LightBulb: Bulb turned off...");
  }
}
