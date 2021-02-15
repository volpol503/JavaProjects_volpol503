package Глава7_Рассмотрение_классов_и_методов._201_206_StackClass._201_StackAccess;

public class StackAccess {
//    Перестренная версия примера со стеком который представляет
//    из себя наложение тарелок одну на другую
//    в этом примере с задействованием модификаторов доступа
}


//В этом классе определяется целочисленный стек
//который может содержать 12 значений

class Stack {
    /*

    Теперь значение stck и tos являются закрытыми
    Это означает что они немогут бть случайно или
    намеренно измененны таким образом чтобы нарушить стек

    */

    private int stck[] = new int[13];
    private int tos;
    //инициализировать вершину стека

//    Overload конструкторы
//    Stack(String a){}
//    Stack(String a, String b){}

    Stack(){
        tos = 0;
    }
    //разместить элемент в стеке
    void push(int item){
        if(tos == 11){
            System.out.println();
        }
        else stck[++tos] = item;
    }

    //извлечь элемент из стека
    int pop(){
        return stck[--tos];
    }

}

class TestStack {
    public static void main(String[] args) {
        Stack first_stack = new Stack();
        Stack second_stack = new Stack();
        String first = "first_stack";
        String second = "second_stack";
        //разместить числа в стеке
        System.out.println("\n" + "загужаем стек " + first);
        for (int i = 0; i < 11; i++) {
            first_stack.push(i);
            System.out.print(i + " ");
        }
        System.out.println("\n" + "загужаем стек " + second);
        for (int i = 11; i < 22; i++) {
            second_stack.push(i);
            System.out.print(i + " ");
        }
        //извлечь эти числа из стека
        System.out.println("\n" + "выгружаем стек " + first);
        for(int i = 0 ; i < 11 ; i++){
            System.out.print(first_stack.pop() + " ");
        }

        System.out.println("\n" + "выгружаем стек " + second);
        for(int i = 0 ; i < 11 ; i++){

            System.out.print(second_stack.pop() + " ");
        }


        // эти операторы недопустимы
        // first_stack.tos = -2;
        // second_stack.stck[3] = 100;

    }
}

