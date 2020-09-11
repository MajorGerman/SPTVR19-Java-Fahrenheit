package sptvr19.fahrenheit;
import java.util.Scanner;

class App {
    private Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println(" ========================== ");
        System.out.println(" ||  Конвертер градусов  || ");
        System.out.println(" ||  Автор: Георг Лаабе  || ");
        System.out.println(" ========================== \n");
        
        double Celsius = 0;
        double Fahrenheit = 0;     
        
        while (true) {
            
            System.out.println("\n[Выбор функции]");
            System.out.print("Цельсия в Фаренгейта (1) / Фаренгейта в Цельсия (2): ");
            
            String function = scanner.nextLine();
            
            if (null == function) {
                System.out.print("Такой функции нет!\n");
                continue;
            } else {
                switch (function) {
                    case "1":
                        System.out.print("Введите градусы по Цельсию: ");
                        Celsius = scanner.nextInt();
                        Fahrenheit = Celsius * 1.8 + 32;
                        System.out.printf("В градусах по Фаренгейту это: %.2f\n", Fahrenheit);
                        scanner.nextLine();
                        break;
                    case "2":
                        System.out.print("Введите градусы по Фаренгейту: ");
                        Fahrenheit = scanner.nextInt();
                        Celsius = (Fahrenheit - 32) / 1.8;
                        System.out.printf("В градусах по Цельсию это: %.2f\n", Celsius);
                        scanner.nextLine();
                        break;
                }
            }
        }
    }
}

