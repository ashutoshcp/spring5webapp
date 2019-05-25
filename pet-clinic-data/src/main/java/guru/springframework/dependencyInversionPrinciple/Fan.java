package guru.springframework.dependencyInversionPrinciple;

public class Fan implements SwitchAble {
  @Override
  public void turnOn() {
    System.out.println("Fan: Fan turned on...");
  }

  @Override
  public void turnOff() {
    System.out.println("Fan: Fan turned off...");
  }
}
