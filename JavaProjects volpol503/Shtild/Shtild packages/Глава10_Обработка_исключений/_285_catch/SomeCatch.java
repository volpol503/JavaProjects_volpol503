package Глава10_Обработка_исключений._285_catch;

public class SomeCatch {
}



class MultipleCatches{
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        }
        catch(ArithmeticException e){
            System.out.println("Деление на нуль: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индексации за пределами массива" + e);
        }
    System.out.println("После блока операторов try catch");
    }
}

class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42/a;
        }
        catch(Exception e){
        System.out.println("Перехват исключений из общего класса Exception");
        }
        /* Этот оператор catch вообще не будет достигнут так как подкласс
        ArithmeticException явяется производнм откласса Exception

        catch (ArithmeticException e){
            System.out.println("Этот код вообще недостижим");
        }
        */
    }
}





