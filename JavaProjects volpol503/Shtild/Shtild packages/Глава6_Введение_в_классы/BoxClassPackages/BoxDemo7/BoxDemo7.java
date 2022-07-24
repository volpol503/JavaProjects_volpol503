package Глава6_Введение_в_классы.BoxClassPackages.BoxDemo7;

class Box{
    double width;
    double height;
    double depth;
    //это конструктор класса Box
    Box(double w, double h, double d){
        //не вводить в конструкторе цифры вместо букв иначе они после
        //инициализации им нельзя присвоить другое значение
        width = w;
        height = h;
        depth = d;
    }
    //расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
    void SysOutPrintln(){
        System.out.println("Объем стандартного паррвлелипипеда равен" + volume());
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10,20,15);
        Box myBox2 = new Box(3,6,9);
        double vol;
        vol = myBox1.volume();
        System.out.println(vol);
        //myBox1.SysOutPrintln();
        vol = myBox2.volume();
        System.out.println(vol);
        //myBox2.SysOutPrintln();
    }
}