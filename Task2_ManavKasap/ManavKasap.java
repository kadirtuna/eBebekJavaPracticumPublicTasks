/**
 * Title: ManavKasap Application
 * Author: Kadir Tuna
 * Assignment: eBebek Java & QA & SAP Spartacus Practicum
 * Description: This project is to calculate the total price of a fruit shopping in greengrocer.
 *
 * Contacts;
 * Instagram: kadir.tuna
 * Github : github.com/kadirtuna
 * LinkedIn : linkedin.com/in/kadirtuna20
 *
 * by;
 * @author Kadir Tuna
 */

import java.util.Scanner;

public class ManavKasap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float sum = 0;
        System.out.print("Armut Kaç Kilo ? :");
        sum += scan.nextFloat() * 2.14; //Pear's price is 2.14 unit.
        System.out.print("Elma Kaç Kilo ? :");
        sum += scan.nextFloat() * 3.67; //Apple's price is 3.67 unit.
        System.out.print("Domates Kaç Kilo ? :");
        sum += scan.nextFloat() * 1.11; //Tomato's price is 1.11 unit.
        System.out.print("Muz Kaç Kilo ? :");
        sum += scan.nextFloat() * 0.95; //Banana's price is 0.95 unit.
        System.out.print("Patlıcan Kaç Kilo ? :");
        sum += scan.nextFloat() * 5; //Aubergine's price is 5 unit.
        System.out.print("Toplam Tutar : " + sum);
    }
}
