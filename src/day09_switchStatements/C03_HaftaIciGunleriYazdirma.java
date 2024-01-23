package day09_switchStatements;

import java.util.Scanner;

public class C03_HaftaIciGunleriYazdirma {

    public static void main(String[] args) {

        // Kullanicidan gun ismini isteyin.
        // girilen gunleri haftaici veya hafta sonu oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scanner.next().toLowerCase();

       /* switch (gunIsmi){         // istersek asagidaki gibi gruplandirarak yazabiliriz
            case "pazartesi" :
            System.out.println("haftaici");
            break;
            case "sali" :
                System.out.println("haftaici");
                break;
            case "carsamba" :
                System.out.println("haftaici");
                break;
            case "persembe" :
                System.out.println("haftaici");
                break;
            case "cuma" :
                System.out.println("haftaici");
                break;
            case "cumartesi" :
                System.out.println("haftasonu");
                break;
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Gun ismi yanlis");

        */

        switch (gunIsmi){
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("haftaici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Gun ismi yanlis");
        }
    }
}
