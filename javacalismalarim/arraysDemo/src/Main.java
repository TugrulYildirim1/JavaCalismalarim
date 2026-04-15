public class Main {
    public static void main(String[] args){
        String[] ogrenciler = new String[4]; //Dizi bu şekilde yazılır. ogrenciler dizisinin eleman sayısı 4 dür. new String[4]; buradaki 4 , eleman sayısıdır.
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";

        for(int i=0;i<ogrenciler.length;i++){  //ogrenciler.length in anlamı ogrencilerin eleman sayısıdır.
            System.out.println(ogrenciler[i]); //Dizideki elemanlar bu şekilde yazdırılır
        }

        for(String ogrenci:ogrenciler){       //ogrenciler dizisindeki her bir öğrenciyi gez sonra her birini yazdır anlamına gelir. Yazımı bu şekildedir. ogrenci isimdir onun yerine başka bir şey de yazılabilir.
            System.out.println(ogrenci);      //Dizideki elemanlar bu şekilde yazdırılır. Yukarıdaki kod ile bu kod aynı anlama gelir.
        }

    }
}