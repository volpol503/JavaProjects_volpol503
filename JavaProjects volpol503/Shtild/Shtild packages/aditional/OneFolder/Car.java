package OneFolder;

public class Car {
    Car() {}

    String color = "red";
    String engine = "V6";
}
 class CarTest{
    public static void main(String[] args){
        int a;
        Car car1 = new Car();
        car1.color = "black";
        car1.color = "V8";
        System.out.println("Color: " + car1.color);
        System.out.println("Motor: " + car1.color);

    }

}


