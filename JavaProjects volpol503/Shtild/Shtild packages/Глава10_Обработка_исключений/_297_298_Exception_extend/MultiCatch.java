package Глава10_Обработка_исключений._297_298_Exception_extend;



public class MultiCatch {
    public static void main(String[] args) {
        int a = 12, b = 0;
        int vals[] = {1,2,3};
        try{
            if(a > 0 | b > 0){}
            int result = a/b;
            vals[12] = 19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Иключение перехвачено: " + e);
        }



        System.out.println("После многократоного перехвата");
    }
}



