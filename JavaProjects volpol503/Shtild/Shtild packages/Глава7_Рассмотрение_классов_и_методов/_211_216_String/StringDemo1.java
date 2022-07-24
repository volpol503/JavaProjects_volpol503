package Глава7_Рассмотрение_классов_и_методов._211_216_String;



class StringDemo1 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Второя строка";
        String strOb3 = strOb1 + " " + strOb2;

        System.out.println(strOb1);
        System.out.println(strOb2);
        System.out.println(strOb3);
    }
}


class StringDemo2 {
    public static void main(String[] args) {
        String Ob1 = "Первая строка";
        String Ob2 = "Вторая строка";
        String Ob3 = Ob1;
        String Ob4 = "Первая строка";


        System.out.println("Длина стоки Ob1" + Ob1.length());
        System.out.println("Символ по индексу 3 в строке Ob" +
                    Ob1.charAt(3));
            if(Ob1.equals(Ob2))
            System.out.println("Ob1 == Ob2");
            else
            System.out.println("Ob1 != Ob2");

            if (Ob1.equals(Ob3))
            System.out.println("Ob2 == Ob3");
            else
            System.out.println("strOb1 != strOb3");

            if(Ob1.equals(Ob4))
                System.out.println("Ob2 == Ob4");
            else
                System.out.println("strOb1 != strOb4");
    }
}