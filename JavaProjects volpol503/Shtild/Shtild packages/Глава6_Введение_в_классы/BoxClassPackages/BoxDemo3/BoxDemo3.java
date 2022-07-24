package Глава6_Введение_в_классы.BoxClassPackages.BoxDemo3;


class Box{
    double width;
    double height;
    double depth;
    //вывести объем паррралелипипеда
    void volume(){
        System.out.println("Объем равен");
        System.out.println(width * height * depth);
    }
    //в этом примере независимый метод для расчета
    double volumevol() {
        return width * height * depth;
    }
}


class  BoxDemo3{
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        //присвоить значение пременным экземпляра mybox1
        myBox1.width = 11;
        myBox1.height = 12;
        myBox1.depth = 13;
        //присвоить значение переменнм экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;
        //вывести объем первого парралелипипеда
        vol = myBox1.volumevol();//независимая инициализация метода
        myBox1.volume();
        //вывести объем второго параллелипипеда
        vol = myBox2.volumevol();//независимая инициализация метода
        myBox2.volume();
    }
}