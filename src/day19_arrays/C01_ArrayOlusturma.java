package day19_arrays;

import java.util.Arrays;

public class C01_ArrayOlusturma {
    public static void main(String[] args) {


        int arr1 = 20;
        arr1 = 30;

        int[] arr2 = {3,4,5}; // data turu : int; uzunluk : 3
        // array'de herhangi bir elemana ulasmak veya deger atamak istersek
        // index kullaniriz.

        System.out.println(arr2[2]); // 5
        System.out.println(arr2[1]); // 4

        // arr2'nin icindeki 4'u 8 yapin

        arr2[1] = 8;

        // bu array 3 elemanlı olarak olusturuldu
        // 4. eleman olarak 3. index'e atama yapmak istersek
        // Java syntax olarak islem dogru oldugundan altini cizmez

        // arr2 [3] = 20; // ArrayIndexOutOfBoundsException

        // array'deki tüm elementleri yazdirin

        System.out.println(arr2[0]+ " "+ arr2 [1]+ " "+ arr2 [2]); // 3 8 5

        int [] arr3 = {2,3,4,5,6,7,6,5,4,2,4,5,7,9};
        // arr3'un tum elementlerini yazdirin

        for (int i = 0; i < arr3.length; i++) { // i = 2,3,4,5,6,7,6,5...
            System.out.print(arr3[i] + " ");

        }
        System.out.println("");
        // arr3 array'ni yazdirin

        System.out.println("tum array :" + arr3); // tum array :[I@15975490 (stack memory'deki referansını yazdirdi)

        // array non-primitiv bir java objesidir
        // non-primitive'lerin bazilari direk olarak yazdirilabilir
        // ancak Array'ler direk YAZDIRILAMAZ
        // Eger Array'in tamamini yazdirmak isterseniz
        // JAva'daki Arrays class'indan yardim almamiz gerekir

        System.out.println(Arrays.toString(arr3)); // [2, 3, 4, 5, 6, 7, 6, 5, 4, 2, 4, 5, 7, 9]

        // Arrays.toString(istenen arrays) ==> java tum elementleri
        // aralarinda ", " olacak sekilde koseli parantezicinde yazdirir

        int[] arr4 = new int[5];

        // icine 5 tane int alabilen bir array olusturur
        // bu durumda deger atanmadigi icin
        // Java biz deger atayincaya kadar
        // elementlere default degerleri tanimlar

        System.out.println(Arrays.toString(arr4)); // [0, 0, 0, 0, 0]

        arr4[0] = 6;
        arr4[3] = 9;
        arr4[1] = 2;
        System.out.println(Arrays.toString(arr4)); // [6, 2, 0, 9, 0]




    }
}
