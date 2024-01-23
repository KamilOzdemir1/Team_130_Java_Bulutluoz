package day10_stringManipulations;

public class C02_equals {

    public static void main(String[] args) {


        String str1 = "Ahmet";
        String str2 = "AHMET";
        String str3 = "ahmet";
        String str4 = "AhMeT";
        String str5 = "Ahmet";
        String str6 = new String("Ahmet");
        String str7 = "Ah";
        String str8 = "met";
        String str9 = str7+str8; // Ahmet

        // 1- String case sensitive'dir.
        // str1, str2, str3 ve str4'ün degerleri birbirinden farklıdır.
        // str1, str5, str6 ve str9'un degerleri birbirinin aynidir.

        // String'de karsilastirma icin == kullanirsaniz
        // metni ayni olan String'lerde bile false dönebilir.
        // == hem metin degerine hem de referansa baktigi icin
        // metni ayni olan farkli String'ler icin farkli sonuclar verebilir

        System.out.println(str1 == str5); // Ahmet == Ahmet  true
        System.out.println(str1 == str6); // Ahmet == Ahmet false
        System.out.println(str1 == "Ahmet"); // Ahmet == Ahmet true
        System.out.println(str1 == str9); // Ahmet == Ahmet false

        // Iki String'in metin olarak ayni olup olmadigini kontrol etmek icin
        // SIMDILIK ==kullanmayacagiz.
        // Stringler'de metin olarak ayni olmayi kontrol etmek icin
        // equals kullanilir.

        // equals() metodu ayni metinler icin true doner
        System.out.println(str1.equals(str5)); // Ahmet == Ahmet  true
        System.out.println(str1.equals(str6)); // Ahmet == Ahmet  true
        System.out.println(str1.equals("Ahmet")); // Ahmet == Ahmet  true
        System.out.println(str1.equals(str9)); // Ahmet == Ahmet  true
       //System.out.println(str1.equals(str7+str8)); // Ahmet == Ahmet  true


        // equals() ayni metnin farkli yazimlari icin
        System.out.println(str1.equals(str2)); // Ahmet == AHMET  false
        System.out.println(str1.equals(str3)); // Ahmet == ahmet  false
        System.out.println(str1.equals(str4)); // Ahmet == AhMeT  false


        // EGER buyuk-kucuk harf farkli yazimlari da esit kabul edelim derseniz
        System.out.println(str1.equalsIgnoreCase(str2)); // Ahmet == AHMET  true
        System.out.println(str1.equalsIgnoreCase(str3)); // Ahmet == ahmet  true
        System.out.println(str1.equalsIgnoreCase(str4)); // Ahmet == AhMeT  true








    }
}
