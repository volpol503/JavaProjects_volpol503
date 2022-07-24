package Глава8_Наследование._241_rename_method;

public class Rename {
}

//Применение динамического полиморфизма
class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    double area(){
        System.out.println("Площадь фигуры не определена");
        return 0;
    }
}

class  Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
// переопределить метод area() для четырехугольника
    double area(){

        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    //переопределить метод area() для прямоугольного треугольника

    double area(){
        return dim1 * dim2 / 2;
    }
}

class FindAreas{
    public static void main(String[] args) {
        Figure F = new Figure(11,11);
        Rectangle R = new Rectangle(1,2);
        Triangle T = new Triangle(6,2);

        Figure FigureRef;

        FigureRef = R;
        System.out.println("Площадь равна " + FigureRef.area());
        FigureRef = T;
        System.out.println("Площадь равна " + FigureRef.area());
        FigureRef = F;
        System.out.println("Площадь равна " + FigureRef.area());
        System.out.println();
    }
}


