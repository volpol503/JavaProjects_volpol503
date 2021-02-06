package OneFolder.Overloading.Pr_1;

public class MethodOverloading {

    //Перегрузка метода с создание метода с тем же типом параметров
//Ошибка компилятора при раскомментировании кода
//      void show(int i1){
//      System.out.println(i1);
//      System.out.println("Data Type is int");
//    }
    void show(int a) {
        System.out.println(a);
        System.out.println("Data Type is int");
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data Type is boolean");
    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data Type is String");
    }
}



class MethodOverloadingTest {
    public static void main(String[] args){
        MethodOverloading mo = new MethodOverloading();
        int a = 500;
        mo.show(a);
        boolean bool = true;
        mo.show(bool);
        String s = "Privet";
        mo.show(s);

    }
}