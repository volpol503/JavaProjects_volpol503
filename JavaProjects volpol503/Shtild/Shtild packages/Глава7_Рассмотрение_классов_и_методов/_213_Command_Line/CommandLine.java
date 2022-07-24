package Глава7_Рассмотрение_классов_и_методов._213_Command_Line;

public class CommandLine {
    //Неизвестно как использовать коммандную строку при запуске данного приложения
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("" + args[i]);
        }
    }
}


