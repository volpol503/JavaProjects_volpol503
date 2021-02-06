package OneFolder;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost){
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost){
        speed -= skorost;
        return  speed;
    }

    void showinfo(){
        System.out.println(" cvet: " + color + " motor: " + engine+ " skorost: " + speed);
    }
}
class Car2Test{
    public static void main(String[] args){
        Car2 car = new Car2();
//        car.showinfo();
        car.color = "blue";
        car.engine = "V6";
        car.speed = 60;

        car.showinfo();
        car.gaz(20);
        car.showinfo();
        car.tormoz(80);
        car.showinfo();
    }
}