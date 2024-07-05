package Car;

public class Car {
    String make;
    String model;
    short year;
    int price;

    Car( String make, String model, short year, int price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    void display(){
        System.out.println("make= "+make);
        System.out.println("model= "+model);
        System.out.println("year ="+year);
        System.out.println("price= $"+price);
    }
}


