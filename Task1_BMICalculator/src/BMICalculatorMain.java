import java.util.Scanner;

public class BMICalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        float height = scan.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz : ");
        float weight = scan.nextFloat();
        System.out.println("Vücut Kitle İndeksiniz : " + Task1_BMICalculator.BMICalculate(height, weight));
    }
}