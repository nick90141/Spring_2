package Task_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) context.getBean("carBean");

        car.init();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
