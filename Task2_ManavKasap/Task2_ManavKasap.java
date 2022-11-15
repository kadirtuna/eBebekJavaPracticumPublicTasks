import java.util.Scanner;

public class Task2_ManavKasap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sum = 0;
        System.out.print("Armut Kaç Kilo ? :");
        sum += scan.nextFloat() * 2.14;
        System.out.print("Elma Kaç Kilo ? :");
        sum += scan.nextFloat() * 3.67;
        System.out.print("Domates Kaç Kilo ? :");
        sum += scan.nextFloat() * 1.11;
        System.out.print("Muz Kaç Kilo ? :");
        sum += scan.nextFloat() * 0.95;
        System.out.print("Patlıcan Kaç Kilo ? :");
        sum += scan.nextFloat() * 5;
        System.out.print("Toplam Tutar : " + sum);
    }
}
