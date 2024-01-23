package day30_timeDate_varargs;

public class C03_Varargs {
    public static void main(String[] args) {
        // verilen iki sayinin toplamini yazdiran bir method olusturun

        topla(4,5); // 9
        topla(4,2,7);
    }
    public static void topla(int... sayi){

    }
    private static void topla(int sayi1,int sayi2, int sayi3){
        System.out.println(sayi1+sayi2+sayi3);
    }
    public static void topla (int sayi1, int sayi2){
        System.out.println(sayi1+sayi2);
    }
}
