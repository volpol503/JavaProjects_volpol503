package Глава7_Рассмотрение_классов_и_методов._196_198_Factorial._198_RecurionArray;

public class RecursionArray {
}
class RecTest{
    int values [];
    RecTest(int i){
        values = new int[i];
    }
    //вывести рекурсивно в элементы массива
    void printArray(int i){
        if(i == 0)return;
        else printArray(i -1);
        System.out.print((i - 1) + " " + values[i - 1] + " ");
    }
}

class Recursion2 {
    public static void main(String[] args) {
        int array  = 12;
        RecTest ob = new RecTest(array);

        for(int i = 0;i < array;i ++)
            //внутри скобки [] пишется величина i высота массива [i]
            //[ i = "###" ] = a величина порядкового номера

            //внутри скобки [][] пишется величина i n высота массива [i][n]
            //[ i = "###" ][ n = "###" ] = a величина порядкового номера

            //в данном примере в отличии от примера в книге высота массива задается в одной переменной и вызывается
            //в разных местах в условии for и вызове метода
            ob.values[i] = i;
        ob.printArray(array);
    }
}