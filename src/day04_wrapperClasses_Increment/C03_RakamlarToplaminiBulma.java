package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // kullanicidan 3 basamakli bir tamsayi alip
        // sayinin rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen uc basamaklı pozitif bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        // diyelimki kullanici 375 sayisini girdi.
        // bize birler basamagini ve rakamlar toplamini kaydedecegimiz
        // 2 variable lazım

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = girilenSayi % 10; // ==> 5

        rakamlarToplami = rakamlarToplami+birlerBasamagi; // ==> 5

        // 5'i rakamlar toplamina ekledik,
        // 5'ten kurtulalim

        girilenSayi = girilenSayi / 10;  // ==> 37

        birlerBasamagi = girilenSayi % 10; // ==> 7

        rakamlarToplami = rakamlarToplami+birlerBasamagi;

        girilenSayi = girilenSayi / 10;  // ==> 37/10 ==> 3

        rakamlarToplami = rakamlarToplami+ girilenSayi;

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);







    }
}
