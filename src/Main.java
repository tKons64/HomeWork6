public class Main {
    public static void main(String[] args) {task1();task2();task3();task4();}

    public static void task1() {
        System.out.println("");
        System.out.println("Задание №1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла: " + i);
        }
    }

    public static void task2(){
        System.out.println("");
        System.out.println("Задание №2");

        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла: " + i);
        }
    }

    public static void task3(){
        System.out.println("");
        System.out.println("Задание №3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0 && i != 0){
                System.out.println("Это четное число - " + i);
            }
        }
    }

    public static void task4(){
        System.out.println("");
        System.out.println("Задание №4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла: " + i);
        }
    }

}