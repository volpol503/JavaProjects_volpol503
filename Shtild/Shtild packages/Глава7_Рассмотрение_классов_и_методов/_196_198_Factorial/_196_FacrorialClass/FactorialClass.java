package Глава7_Рассмотрение_классов_и_методов._196_198_Factorial._196_FacrorialClass;

public class FactorialClass {
}
//Пример рекурсии
class Factorial {
    int fact(int n){
        int result;
        if(n == 1)
            return 1;           //Первое возвращаемое значение
        result = fact(n - 1) * n;
        return result;      //Второе возвращаемое значение
        //Особенность данного примера состоит в том что он имеет два возвращаемых значения
        //return 1 и return result срабатываение идет в соответствии с условиями
        //таким образом рекурсивнй метод это метод с двумя возвращаемыми значениями
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.fact(3) + " " + f.fact(2) + " " + f.fact(1));
    }
}
