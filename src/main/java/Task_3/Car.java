package Task_3;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car() {
        // Конструктор за замовчуванням
    }

    // Setter-методи для полів
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод init, який викликається при ініціалізації біна
    public void init() {
        System.out.println("Car бін ініціалізований.");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
