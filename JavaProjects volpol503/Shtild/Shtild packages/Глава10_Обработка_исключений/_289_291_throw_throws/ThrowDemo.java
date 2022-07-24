package Глава10_Обработка_исключений._289_291_throw_throws;

public class ThrowDemo {
    static void demoproc(){

        //Оператор throw генерирует исключение в блоке контроля try{}

        try{
            throw new NullPointerException("Демонстрация");
        }catch (NullPointerException e){
            System.out.println("Исключения перехачено в теле ");
            throw e; //повторно сгенерировать исключение
        }
    }


    public static void main(String[] args) {
    try {
//          for (int i = 0; i < 8; i++)
         demoproc();
     }
     catch (NullPointerException e){
         System.out.println("Повторный перехват " + e);
     }
     }
}

class ThrowsDemo {

    static void throwOne() throws IllegalAccessException{
        System.out.println("В теле метода throwOne()");
        throw new IllegalAccessException("Демонстраия");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}



