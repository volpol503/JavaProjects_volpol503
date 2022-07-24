package Глава8_Наследование._232_extends_Box;

public class ExtendsBox {
}


class Box {
    private double width;
    private double height;
    private double depth;

    //сконструировать клон объекта
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;

    }

    //конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    //конструктор, применяемый в отсутствии размеров
    Box(){
        width  = -1;
        height = -1;
        depth = -1;
    //значение -1 служит для обозначения неинициализированного парралелипипеда
    }
    Box(double len){
        width = height = depth;
    }
    double volume(){
        return width * height * depth;
    }
}

// добавить поле веса
class BoxWeight extends Box{
    double weight; //вес парралелипипеда
    //сконстуировать клон объекта
    BoxWeight (BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
    //констуктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d); // вызвать конструктор суперкласса
        weight = m;
    }

    //конструктор применяемый по умолчанию
    public BoxWeight(){
        super();
        weight = - 1;
    }

    //Констуктор применяемыцй при создании куба
    public BoxWeight(double len, double m) {
    super(len);
    weight = m;
    }
}

//добавить поле стоисости доставки
class Shipment extends BoxWeight{
    double cost;

    //сконструировать клон объекта
    Shipment(Shipment ob){
        super (ob);
        cost = ob.cost;
    }

    //конструктор, используемый при указании всех параметров
    Shipment (double w,double h ,double d, double m, double c){
        super(w,h,d,m);
        cost = c;
    }

    Shipment (){super();}
   
    //конструктор, применяемый при создании куба
    Shipment(double len, double m, double c){
        super(len,m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment sh1 = new Shipment(12,20,15,12,5.12);
        Shipment sh2 = new Shipment(2,3,4,0.76,1.12);

       // В приере с наследование наглядно демонстрируется сокрытие переменных длин
       // коробки и вывод данных этой коробки

        double vol = sh1.volume();
        double weight = sh1.weight;
        double cost = sh1.cost;

        System.out.println("Объем sh1 равен " + vol);
        System.out.println("Вес sh1 равен" + weight);
        System.out.println("Стоимость доставки: " + cost +  " $" + "\n");

        vol = sh2.volume();
        weight = sh2.weight;
        cost = sh2.cost;

        System.out.println("Объем sh2 равен" + vol);
        System.out.println("Вес sh2 равен" + weight);
        System.out.println("Стоимость доставки: " + cost + " $");

    }
}
























