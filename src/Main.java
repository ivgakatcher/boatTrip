import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите грузоподъёмность байдарок: ");
        int cargo = scanner.nextInt();
        inputCount() ;
    }
    public static int[] inputCount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество участников: ");
        int number = scanner.nextInt();
        int [] kayakerWeight = new int[];
        System.out.println("Введите вес участников: ");
        for ( int i = 0; i < number; i++) {
            kayakerWeight[i] = scanner.nextInt();
        }
        return kayakerWeight;
    }
    public static int orderBoats(int[] kayakerWeight){
        int n = kayakerWeight.length;
        int sumWeight = 0;
        for ( int i = 0; i < n; i++) {
            if ()
        }
    }
}