package guru.springframework.dependencyInjection;

import guru.springframework.dependencyInjection.controllers.ConstructorInjectedController;
import guru.springframework.dependencyInjection.controllers.GetterInjectedController;
import guru.springframework.dependencyInjection.controllers.MyController;
import guru.springframework.dependencyInjection.controllers.PropertyInjectedController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

    MyController controller = (MyController) ctx.getBean("myController");

    System.out.println(controller.hello());
    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
  }
}
