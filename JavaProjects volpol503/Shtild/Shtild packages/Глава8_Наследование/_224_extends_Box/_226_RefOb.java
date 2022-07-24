package Глава8_Наследование._224_extends_Box;

public class _226_RefOb {
}

class RefDemo{
    public static void main(String[] args) {
        BoxWeight w = new BoxWeight(3,5,7,8.37);
        Box plainBox = new Box();
        double vol;

        // ссылатся можно на переменную суперкласса
        vol = w.volume();
        System.out.println();

        // присвоить переменной ссылки на объект типа BoxWeight
        // ссылку на Объект типа Box
//        plainBox = w;
        vol = plainBox.volume();
        System.out.println("Объем plainBox равен " + vol);
        /* Следующий оператор ошибочен, поскольку член supOb
        не определяет член weight - вес коробки
        System.out.println("Вес supOb" + plainBox.weight ); */
    }
}
