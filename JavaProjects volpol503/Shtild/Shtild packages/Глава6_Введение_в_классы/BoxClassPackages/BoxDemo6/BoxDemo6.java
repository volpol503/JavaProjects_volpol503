package Глава6_Введение_в_классы.BoxClassPackages.BoxDemo6;



class Box{
    double width;
    double height;
    double depth;
    //это конструктор класса Box
    Box(){
        //здесь в конструкторе инициализированы числа что не хорошая практика
        //потому что все равно придется при изменении вызвать ссылочное значение
        //переменных width height depth
        width = 12;
        height = 12;
        depth = 12;
    }
    //расчитать и возвратить объем
    double volume(){
        return width * height * depth;
    }
    void SysOutPrintln(){
        System.out.println("Объем стандартного паррвлелипипеда равен" + volume());
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        //в этом примере присвоение отличающиеся от стандартного
        myBox1.width = 13;
        vol = myBox1.volume();

        System.out.println("Объем стандартного параллелипипеда равен" + vol);
        vol = myBox2.volume();
        System.out.println("Объем стандартного параллелипипеда равен" + vol);
        //тот же вывод через метод
        myBox1.SysOutPrintln();
        myBox2.SysOutPrintln();

    }
}