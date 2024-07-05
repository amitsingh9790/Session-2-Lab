package Car;

public class Main {
public static void main(String[] args) {
    Car car1 = new Car("Tesla", "X", (short) 2019, 50000);
    Car car2 = new Car("Honda", "AVS8", (short) 2018, 20000);

    System.out.println("Car1  :");
    car1.display();
    System.out.println("Car2 :");
    car2.display();
}
}