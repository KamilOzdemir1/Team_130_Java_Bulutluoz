package day34_inheritanceConstructorCall;

/*
Bu Classa ait çözümler ekran görüntülerinin içinde Day_34 Class_3 klasörünün içinde.
en altta child1, child2 ve child3 adlı 3 soru var.
bu üç duruma ait üç ayrı soru ve çözüm Day_34 Class_3 klasörünün içinde bulunuyor.
 */

public class C03_Child extends C02_Parent{
    C03_Child(){
        System.out.println("Child parametresiz constructor");
    }
    C03_Child(int sayi){
        super("Sedat");
        System.out.println("Child int parametreli constructor");
    }
    C03_Child(String str){
        super(true);
        System.out.println("Child String parametreli constructor");
    }
    C03_Child(boolean a){
        System.out.println("Child boolean parametreli constructor");
    }
    public static void main(String[] args) {
        C03_Child child3 = new C03_Child("Kamil");
        // C03_Child child2 = new C03_Child(5);
        // C03_Child child1 = new C03_Child();
    }
}








