package day33_inheritance;

public class C04_RunnerClass {
    public static void main(String[] args) {
        C03_DizelCorolla dc1 = new C03_DizelCorolla();

        System.out.println(dc1.marka); // Toyota Toyota Class'ından
        System.out.println(dc1.model); // Corolla Dizel C Class'ından
        System.out.println(dc1.motor); // dizel DC Class'ından
        System.out.println(dc1.yakit); // dizel DC Class'ından
        System.out.println(dc1.uretimYeri); // Sakarya DC Class'ından
        System.out.println(dc1.sanzuman); // Belirtilmemis Araba Class'ından
        System.out.println(dc1.aku); // İnci DC Class'ından
        System.out.println(dc1.teker); // Pirelli 15 DC Class'ından
        System.out.println(dc1.guvenlik); // Extra T Class'ından
        System.out.println(dc1.renk); // Renk belirtilmemis DC Class'ından
        System.out.println(dc1.fren); // ABS fren DC Class'ından
    }
}
