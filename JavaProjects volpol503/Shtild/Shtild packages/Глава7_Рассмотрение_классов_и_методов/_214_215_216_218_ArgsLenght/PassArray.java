package Глава7_Рассмотрение_классов_и_методов._214_215_216_218_ArgsLenght;


//Использовать массив для передачи методу переменного
//количества аргументов. Это старый подход к обработке
//аргументов переменной длины
public class PassArray {

    static void vaTest(int v[]){
        System.out.print("Количество аргументов " + v.length + " Содержимое: ");
    for (int x:v) {System.out.print(x + "  ");}
    System.out.println();

    }

    public static void main(String[] args) {
        // Обратите внимание на эпорядок создания
        // массива для храниения аргументов
    int n1[] = {12};
    int n2[] = {1,2,3};
    int n3[] = {};
    vaTest(n1);
    vaTest(n2);
    vaTest(n3);
    }
}


// Продемонстрировать применение аргументов
// переменной длины

class VarArgs{
    // теперь метод vaTest() ъявляется с аргументами
    // переменной длины
    static void vaTest(int ... v){
        System.out.print("Количество аргументов" + v.length +
                " Содержимое: ");
        for(int x : v){
            //System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    // Обратите внимание на возможные способы вызова
    // переменной длины
    vaTest(12);
    vaTest(1,2,3);
    vaTest();
    }
}



class VarArgs2 {
    // В данном примере msg - обычный параметр
    // a v - параметр переменной длины
    static void vaTest(String msg, int ... v){
        System.out.print(msg + v.length + " Содержимое ");

        for (int x : v){System.out.print(x + " ");}
        System.out.println();

    }

    public static void main(String[] args) {
    vaTest("Один параметр меременной длины",1);
    vaTest("Три параметра переменной длины",1,2,3);
    vaTest("Без параметра переменной длины:");
    }
}

class ArgsLenghtOverloading {
}

class VarArgs3 {
    static void vaTest(int ... v){
        System.out.print("vaTest (int ...): " + v.length + " элемента массива Содержимое: ");
        for (int x:v){System.out.print(x + " ");}
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.print("vaTest (boolean ...): " + v.length + " элемента массива Содержимое: ");
        for (boolean x : v) {System.out.print(x + " ");}
        System.out.println();
    }
    static void vaTest(String msg, int ... v){
        if(v.length == 1)
        System.out.print(msg + "vaTest (String msg, int ...): " + v.length + " элемент массива Содержимое: ");
        else
        System.out.print("vaTest (String msg, int ...): " + v.length + " элемента массива Содержимое: ");
        for (int x:v){System.out.print(x + " ");}
        System.out.println();
    }

    public static void main(String[] args) {
       vaTest(1,2,3);
       vaTest("Проерка: ", 12);
       vaTest(true,false,false);
    }
}

// Аргументы переменной длины и неоднозначность
// Аргументы переменной длины, перегрузка и
// неоднозначность в примере с ошибкой

class VarArgs4 {
    static void vaTest(){}

    static void vaTest(int ... v){
     System.out.print("VaTest(int ... v):"
     + "Количество аргументов"
     + v.length + " Содержимое");
     for(int x:v){System.out.print(x + " ");}
    System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("VaTest(int ... v):"
                + "Количество аргументов"
                + v.length + " Содержимое");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,false,false);
        vaTest(); //Ошибка неоднозначность
        // Если добавить пустой метод vaTest то ошибка
        // пропадет
    }
    // Добавив метод с двумя параметром и переменным
    // количеством аргементов при перегрузке метода
    // возникает неоднозначность
    //    static void vaTest(int a,int ... v){}
}








