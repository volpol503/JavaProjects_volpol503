package Глава5_Управляющие_операторы;

import java.io.IOException;

public class Управляющие_операторы {

        //    Операторы выбора

// В языке Java поддерживаются два оператора выыбора: if и else эти операторы
// позволяют управлять порядком выполнения команд программы в соответствии с
// с условиями, которые известны только во время выполнения


    void Условный_оператор_if(){

        //    Условный оператор if

// Это оператор ветвления программы на Java. С его помощью можно направить
// выполнение программы по двум разным ветвям
// Общая форма этого условного оператора выглядит следующим образом
// if (условие) оператор;
//     else оператор;
    }

    void Вложенные_условные_операторы_if(){

        //    Вложенные условные операторы if

// Вложенным называется такой условный оператор if который является целью другого
// условного оператора if или else В программах вложенные уловные операторы if
// встречаются очень часто но пользуясь вложенными условными операторами if
// не следует забывать что оператор else всегда связан с близжайшим условным
// оператором if находящимся в том же самом блоке кода и еще не связанным
// с другим оператором else
    }



    void if_else_if(){
        //    Конструкция if-else-if

// Конструкция if-else-if состоящая из последовательности вложенных условных
// операторов if достаточно распространнена в программировании

// Общая форма имеет следующий вид
// if(условие)
//    оператор;
// else if (условие)
//    оператор;
// else if (условие)
//    оператор;
// ...
// ...
// ...
// else
//    оператор;
// Условные операторы if выполняются последовательно, сверху вниз Как только одно из
// условий, управляющих оператором if, оказывается равным true, выполняется оператор
// связанный с данным условным оператором if, а остальная часть конструкции if-else-if
// пропускается. Если ни одно из условий не удовлетворяется то есть не равно true
// то выполняется заключительный оператор else
    }



    void Оператор_switch(){

        //    Оператор switch

// В языке Java оператор switch является оператором ветвления
// Он предоставляет простой способ направить поток исполнения команд
// по разным ветвям кода в зависимости от назначения управляющего выражения
// Зачастую оператор switch оказывается эффективнее длинных
// последовательностей операторов конструкций if - else - if
// Общая форма имеет следующий вид

// switch (выражение) {
// case значение1:
// последовательность операторов
//       break;
// case значение2:
//   последовательность операторов
//       break;
// ...
// ...
// ...
// case значениеN:
//   последовательность операторов
//       break;
// default:
//   последовательность операторов по умолчанию
//значение которое идет после case разумеется целое число
//
// }

    }
}

class IfElse {
    public static void main(String[] args) {
        int Month = 4; // Соответствует апрелю месяцу по счету
        String season;
        if(Month == 12||Month == 1 || Month == 2)season = "зиме";
        else if(Month == 3 || Month == 4 || Month == 5)season = "весне";
        else if(Month == 6 || Month == 7 || Month == 8)season = "лету";
        else if(Month == 9 || Month == 10 || Month == 11)season = "осени";
        else  season =  "вымшленным месяцам";   //При отсутствии данного блока кода
                                                //выйдет ошибка отсутствия присвоения
                                                //переменной season
        System.out.println("Апрель относится к " + season +"");

    }
}


//Оператор break служит для прерывания последователности
//операторов в ветвях выбора оператора switch

//Простой пример применения оператора switch
class SampleSwitch{
    public static void main(String[] args) {
        for(int i = 0; i < 8 ; i++)
            switch (i){
                case 0: System.out.println("i равно нулю"); break;
                case 1: System.out.println("i равно одному"); break;
                case 2: System.out.println("i равно двум"); break;
                case 3: System.out.println("i равно трем"); break;
                //все итерации которые происходят после default
                //выводится следующая строчка кода
                default:System.out.println("i больше трех");
        }
    }
}

//Усовершенствованная версия программы, в которой определяется
//принадлежность меяца времени года
class Switch{
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "зиме";
                break;
            default:
        }
        System.out.println();
    }
}






//в операторе switch совсем не обязательно указывать оператор break

//Бесполезный пример
class MissingBreak{
    public static void main(String[] args) {

        int month = 5;
        String season;
//        for(int i = 0; i < 12; i ++)
            switch (month) {
                case 0:
                case 3:
                case 4:
                case 5:
                    season = "весне";
//                    System.out.println("Апрель относитя к " + season);
                    break;
                case 6:
                case 7:
                case 8:
                    season = "лету";
//                    System.out.println("Апрель относитя к " + season);
                    break;
                case 9:
                case 10:
                case 11:
                    season = "осени";
//                    System.out.println("Апрель относитя к " + season);
                    break;
                default:
                    season = "вымышленным месяцам";

//Вставка вывода в консоль внутри Switch(){ ... System.out.Println()}
//Приведет к выполнению самой близжайшей строковой ветви case к выводу
//в консоль
        }
//Вывод в консоль ставится за скобками switch(){}
        System.out.println("Апрель относитя к " + season);
    }
}

//Использовать символьные строки для управления оператором switch
class StringSwitch{
    public static void main(String[] args) {
        //при совпадении String str в символьной строке case <String>
        //Выполняется данный case по совпадению символьной строки
        String str = "два";
        switch(str){
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("Не совпало");
                break;
        }
    }
}
class DoubleSwitch{
    public static void main(String[] args) {
        //при совпадении String str в символьной строке case <String>
        //Выполняется данный case по совпадению символьной строки
        String str = "два";
        switch(str){
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("Не совпало");
                break;
        }
    }
}


/*

///==============================================================================///
///                           *** Примечание ***                                 ///
///==============================================================================///
|                                                                                  |
|//   в дальнейшем рассмотрение примеров используются любые примитивне типы        |
|//   данных для использования их в параметрах switch в параметре switch           |
|//   как выяснилось не использовать примитивные типы данных double float          |
|                                                                                  |
|//   типы byte ; short ; char ; int ; Enum ; String                               |
|//   специальные классы, которые являются обёрткой для                            |
|//   примитивных типов: Character, Byte, Short, Integer                           |
|                                                                                  |
///==============================================================================///
///                          *** Конец примечания ***                            ///
///==============================================================================///

*/


//Вложенные операторы switch
//Оператор switch можно использовать в последовательности операторов внешнего
//оператора switch Такой оператор switch называется вложенным

//пример типа кода с вложенным оператором switch
//switch(count){
//  case 1:
//      switch(target){
//      case 0:
//          System.out.println();
//          break;
//      case 1: //конфликты с внешиним оператором switch отсутствуют
//          System.out.println();
//          break;
//      }
//  break;
//  case 2: //...
//}
//

// * Оператор switch отличается от условного оператора if тем
// что в нем допускается выполнять проверку только на равенство, тогда
// как в условном операторе if можно вычислять результат логического
// выражения любого типа. Следовательно, в операторе switch обнаруживается
// совпадение выражения с константой только в одной из ветвей case

// * Константы ни в одной из двух ветвей case того же самого оператора
// switch не могут иметь одинаковые значения, внутренний оператор
// switch и содержащий его внешний оператор switch могут иметь одинаковые
// константы в ветвях case

// * Как правило, оператор switch действует эффективнее ряда вложенных
// условных операторов if

//При данном синатсисе цикл while может быть также как
//цикл for конечным при заданных условиях или бесконечным
class While {
    public static void main(String[] args) {
        int n = 12;
        while (n > 0) {
            System.out.print("такт " + n + " ");
            n--;
        }

        System.out.println("\n");
//дополнен условием с применением условных операторов
        while (n < 13 && n > -12) {
            System.out.print("такт " + n + " ");
            n--;
        }
    }
}

//Целевая часть цикла может быть пустой
class NoBody{
    public static void main(String[] args) {

        //расчитать среднее значение переменных i и j

        int a = 100, b = 200, c = 400,        /* для первого цикла */
            d = 800, e = 12,   f = 24;
        int i_new = 250,j_new = 500;          /* для второго цикла */
        int one_pair_int_first = 800,
        two_pair_int_first =1600;
//        при возвращении условия true цикл выполняет такты итерации
//        в данном примере без указания конкретных чисел не построить
//        бесконечный цикл



        while (++a < --b && a == b); //Цикл остановился на первой итерации
        while (++c < --d); //Цикл сработан до последней итерации по условию
        while (++e < --f ||
                 //дорабатывание цикла while
                e != f || e < f);

                                  //Цикл сработан до последней итерации по условию
                                  //Условие вычислиния среднего числа выполнено не точно
                                  //чтобы цикл выполнил последний такт если заменить условие e == f
                                  //на e < f или e != f или добавить в перечисление с или "||"

                                  //нельзя ставить одновременно в условии конструкцию e == f || e != f
                                  //иначе цикл будет бесконечно отрабатываться на выборе
                                  //условия то что внутри круглых скобок

                                  //оба условия доработают цикл while до точного завершения в данном примере
                                  //с вычислением среднего арифметического пары чисел

        while (i_new++ < j_new-- && i_new == j_new);//Цикл остановился на первой итерации
        while (++i_new < --j_new);//Цикл сработан по последовательности присвоения также как
                                  //предыдущий до последней итерации по условию
        a = 400;
        while (++b < --a);
//        эти блоки кода фукианируют также независимо цикла while потому что расположенны
//        не после круглых скобок цикла while после круглых скобок потому что после них стоит ";"
        {}{}{}{}{}{}{}{}{}{}
//        здесь вывод в консоль одно число потому что данный блок кода не стоит после круглых скобок
//        цикла while следовательно цикл while функианирует независимо от данного блока кода
        {
            System.out.println(
                    "Среднее значение a равно" + a + "\n" +
                    "Среднее значение b равно" + b + "\n" + "\n" +

                    "Среднее значение c равно" + c + "\n" +
                    "Среднее значение d равно" + d + "\n" + "\n" +

                    "Среднее значение e равно" + e + "\n" +
                    "Среднее значение f равно" + f + "\n" + "\n" +

                    "Среднее значение i_new равно" + i_new + "\n" +
                    "Среднее значение j_new равно" + j_new + "\n" + "\n"
            );

        }
    }
}



//условие цикла while это возвращаемое значение true или false в зависимости
//от этого будет производиться такт цикла или итерация в данном примере
//цикл while производит 12 итераций

//Продемонстрировать применение цикла do - while
//В данном примере демонстрируется что цикл while
//имеет 12 тактов
class DoWhile{
    public static void main(String[] args) {
        int n = 12;

        do {
            System.out.println("такт " + n);
            n--;
        }while (n > 0);
    }
}

//Цикл Do {} while это то же самое что цикл for(инициализация;условие;итерация){}
//только блок кода стоит перед условием в отличие от цикла for

class DoWhile2{
    public static void main(String[] args) {
        int n = 12;

        do {
            System.out.println("такт " + n);
            n--;
//Здесь цикл бесконечный
        } while (n < 0);
    }
}

class Menu {
    public static void main(String[] args) throws java.io.UncheckedIOException, IOException {
        char choice;
//        String Protected = "IP23";
        do {
            System.out.println("Справка по оператору");
            System.out.print("1) if\n");
            System.out.print("2) switch\n");
            System.out.print("3) while\n");
            System.out.print("4) do - while\n");
            System.out.print("5) for\n");
            System.out.println("Выберите нужный пункт");
            choice = (char) System.in.read();
            //Узнать как произвводить то же самое только со String и оператором switch
            //Protected = System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");
        switch (choice){
            case '1':
                System.out.println("Справка if:\n");
                System.out.println("if (условие) оператор;");
                System.out.println("else оператор");break;
            case '2':
                System.out.println("Справка switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("   case константа:");
                System.out.println("        последовательность операторов");
                System.out.println(" break;" + "\n" + "// ..." + "\n" + "}");
                break;
            case '3':
                System.out.println("Справка while:");
                System.out.println("while(условие) оператор;");
            case '4':
                System.out.println();
                System.out.println("do-while: \n");
                break;
            case '5':
                System.out.println("for");
                System.out.println("for(инициализация; условие; итерация)");
                System.out.println("блок кода { код выполнения цикла for } \n " +
                        "или запись без блока кода в этом случае выполняется \n" +
                        "близжайшее условие записанное рядом с круглыми скобками");
                break;
//для этого примера организовать несколько потоков ввода вывода если не в консоль то в отдельные окна
//построенные на Swing или других окон где производить ввод вывод значений высоты оси из таблицы или
//значение по графику где в отличие от данного примера организоввать обратный переход в ввод значения
//


        }
    }
}

//Продемонстрировать применение цикла for
class ForTick {
    public static void main(String[] args) {
        int n;
            for(n = 11; n > 0 ; n--){
                System.out.println("такт " + n);
            }
    }
}
class ForTickIn {
    public static void main(String[] args) {
        //здесь переменная n объявляется в самом цикле for

        for (int n = 12; n > 0 ; n--)
            System.out.println("такт " + n);
    }
}

class Sample {
    public static void main(String[] args) {
        int a,b;
        int c = 13;
        int d = 3;
        double e = 0;
        long f = 13l;
        f = 9999999999999999l;
        b = 24;
        for(a = 1; a < b; a++){
            System.out.println("a = " + a + " | b = " + b + " | c =" + c + " | d = " + d + " | e = " + e + " | f = " + f);
//          различне примеры исполнения итерация для int b,c,d,e,f
            b --; c += 2; d -- ; e *= 3; f/=13;
        }
    }
}
// Использование запятой в операторе цикла for
class Comma {
    public static void main(String[] args) {
        int a,b;
        for(a = 1, b =4; a < b; a++, b-- ){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}

//второй стейтмент в цикле for это условие
//значение возврата либо true либо false
//не обязательно целевое значение

class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = true;
//        boolean d = !done;
//        d = !done;
        for(i = 0; done ; i++ ){
            System.out.println("i равно " + i);
        //без условия if как в этом примере цикл
        //станет бесконечным
//           if(i == 12) done = true;
           if(i != 12) done = true;
           if(i <  12) done = true;
               else done = false;
        }
//        System.out.println(d);
    }
}

class ForVarTrue {
    public static void main(String[] args) {
        int i;
//        boolean done = false;
        for(i = 0; true ;i++ ){
            System.out.println("i равно" + i);
            //без условия if как в этом примере цикл
            //станет бесконечным
            if(i == 12){
//            оператор break также останавливает цикл
                break;
            }
        }
    }
}

class ForTrue {
    public static void main(String[] args) {
        int i;
        // это также бесконечнй цикл пока в условиях стоит true
        for(i = 0; true ; i++ ){
            System.out.println("i равно" + i);
        }
    }
}

class WhileTrue {
    public static void main(String[] args) {
        int i = 1;
        while(true) {
            i++;
            System.out.println("бесконечный цикл" + i);
        }
    }
}

class for_foreach {
    public static void main(String[] args) {
        int nums[] = { 3 , 8 , 32 , 12 , 5 , 6 , 7 , 8, 9, 10, 11 };
        int sum = 0;
        int i;
        //Присвоение значений массива через цикл
        for(i = 0; i < 11; i++){
            sum += nums[i];
            System.out.println("текущий порядковый номер массива nums[" + i + "]" +
                    " значение числа массива nums[i] i = " + sum + "\n");
        }
        {
            System.out.println("текущий порядковый номер массива nums[] номер = " +
                    i + " значение числа массива nums[i] i = " + sum);
        }
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
        System.out.println(nums[11]);
//        System.out.println(nums[61]); Exception ArrayIndexOutBoundsException
    }
}

class ForEach{
    public static void main(String[] args) {
        int nums[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8, 9, 10, 11 };
        int sum = 0;
        int i;
        //В данном примере рассматривается цикл for(тип итераионная_переменная : коллекция)
        for(int x : nums){
            System.out.println("текущий порядковый номер массива nums[" + x + "]" + " значение числа массива nums[i] i = " + sum + "\n");
            sum += x;
        }
    }
}