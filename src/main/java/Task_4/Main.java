package Task_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myMap.xml");
        HashMap<String, String> myMap = (HashMap<String, String>) context.getBean("myMap");

        System.out.println("myMap содержит: " + myMap);
    }
}
