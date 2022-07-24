package OneFolder;

public class Human {
    String name;
    Car3 car;
    BankAccount ba;
    void info(){
        System.out.println("Imya: " + name + " cvet mashiny: "
         + " Balance bankovskogo scheta: " + ba.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {
         Human h = new Human();
         h.name = "David";
         h.car = new Car3("red","V8");
         h.ba = new BankAccount(1,200.5);
         h.info();
    }
}

class Car3 {
    Car3(String c, String e){
        color = c;
        engine=e;
    }
    String color;
    String engine;

}
class BankAccount{
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;

}