package Глава10_Обработка_исключений;

public class _294_296_table {
}

class MyException extends Exception {
    private int detail;

    MyException(int a){
        detail = a;
    }

    public String toString(){
        return "MyException { " + detail + " } " + "\n";
    }

}