package day12_stringManipulations;

public class C04_Trim {

    public static void main(String[] args) {
        String str = "     Ali    topa    vur    ";

        //Metinde fazla kullanilan space'leri temizleyin

        str= str.trim();

        str = str.replaceAll("\\s+"," ");
        System.out.println(str);
    }
}
