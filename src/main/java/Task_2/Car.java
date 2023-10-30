package Task_2;

public class Car {
    private String make;
    private String model;
    private int year;

    // Конструктор для задання полів make, model та year
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Setter-метод для задання поля make
    public void setMake(String make) {
        this.make = make;
    }

    // Setter-метод для задання поля model
    public void setModel(String model) {
        this.model = model;
    }

    // Setter-метод для задання поля year
    public void setYear(int year) {
        this.year = year;
    }

    // Метод init, який викликається під час ініціалізації біна
    public void init() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}
