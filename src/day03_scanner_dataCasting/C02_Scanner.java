package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip,
        //        cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen çemberin yaricapini yaziniz");

        double yaricap = scanner.nextDouble();

        System.out.println("cemberin cevresi : " + 2 * 3.14 * yaricap);

        System.out.println("dairenin alani : " + 3.14 * yaricap*yaricap);
    }
}
