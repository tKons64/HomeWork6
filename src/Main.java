public class Main {

    public static void main(String[] args) {
        task1_1();task1_2();task1_3();task1_4();
        task2_1();task2_2();task2_3();
    }

    public static void task1_1() {
        System.out.println("");
        System.out.println("Задание №1.1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла: " + i);
        }
    }

    public static void task1_2(){
        System.out.println("");
        System.out.println("Задание №1.2");

        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла: " + i);
        }
    }

    public static void task1_3(){
        System.out.println("");
        System.out.println("Задание №1.3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0 && i != 0){
                System.out.println("Это четное число - " + i);
            }
        }
    }

    public static void task1_4(){
        System.out.println("");
        System.out.println("Задание №1.4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла: " + i);
        }
    }

    public static void task2_1(){
        System.out.println("");
        System.out.println("Задание №2.1");

        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 100 == 0 && i % 400 != 0) {
                System.out.println("ИСключаем год: " + i);
            } else {
                System.out.println(i + " год является високосным!");
            }

        }
    }

    public static void task2_2(){
        System.out.println("");
        System.out.println("Задание №2.2");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task2_3(){
        System.out.println("");
        System.out.println("Задание №2.3");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

}