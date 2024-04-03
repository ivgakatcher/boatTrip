import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество участников: ");
        int pers = scanner.nextInt();
        System.out.println("Введите грузоподъёмность байдарок: ");
        int cargo = scanner.nextInt();

        System.out.println("Hello world!");
    }
    public static int[] inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество участников: ");
        int number = scanner.nextInt();
        System.out.println("Введите грузоподъёмность байдарок: ");
        int cargo = scanner.nextInt();
    }
    //Done: input initial data
    //TODO: write "procedure" for analyze and output certain data
}