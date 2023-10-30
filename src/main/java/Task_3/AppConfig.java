package Task_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car carBean() {
        Car car = new Car();
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setYear(2023);
        return car;
    }
}
