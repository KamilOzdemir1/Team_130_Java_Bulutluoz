package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //    bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz");

        int girilenTamsayi = scanner.nextInt();

        System.out.println("Ondalikli bir sayi giriniz");

        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("Girilen Sayiların Toplami : " + (girilenTamsayi+girilenOndalikliSayi));

        System.out.println("Girilen sayilarin carpimi : " + (girilenTamsayi*girilenOndalikliSayi) );



    }
}
