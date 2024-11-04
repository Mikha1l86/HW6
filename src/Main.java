public class Main {
    public static void main(String[] args) {

//Задача 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//Задача 2
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

//Задача 3
        System.out.println("Задача 3");

        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

//Задача 4
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

//Задача 5
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }

//Задача 6
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();


//Задача 7
        System.out.println("Задача 7");

        for (int i = 2; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

//Задача 8
        System.out.println("Задача 8");

        int amount = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month++) {
            sum = sum + amount;
            sum = sum + amount / 12;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей.");
        }

//Задача 9
        System.out.println("Задача 9");

        sum = 0;
        double percent = 1D / 100;
        for (int month = 1; month <= 12; month++) {
            sum = sum + amount;
            sum = (int) (sum * (1 + percent));
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей.");
        }

        //Задача 10
        System.out.println("Задача 10");
        for (int multiplicat = 1; multiplicat <= 10; multiplicat ++) {
            System.out.printf("%d * %d = %d%n", 2, multiplicat, 2 * multiplicat);
        }
    }
}
