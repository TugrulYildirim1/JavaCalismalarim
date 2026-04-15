import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList(); //ArrayList i çağırmak için import etmek gerekiyor.

        sayilar.add(1); //eleman eklemeyi sağlar.
        sayilar.add(10);
        sayilar.add("Ankara"); //Elemanlar string te eklenebilir int de eklenebilir.
        //System.out.println(sayilar.size()); //kaç tane eleman olduğunu gösterir.
        //System.out.println(sayilar.get(0)); //0.indexi getir anlamına gelir.
        //sayilar.set(0,100); //set, elemanın değerini değiştirmek için kullanılır.Buradaki kodun anlamı 0.indexin değerini 100 yap demektir.
        //sayilar.remove(0); //elemanları silmek için kullanılır. Bunun anlamı 0. indexi yani 1.elemanı sil demektir.
        //sayilar.clear(); //Tüm elemanları silmeye yarar.

        for(Object i:sayilar){ // sayilar ArrayList inde hem int hem de String veri tipi olduğu için i yi Object tanımlarız.
            System.out.println(i);
        }
    }
}