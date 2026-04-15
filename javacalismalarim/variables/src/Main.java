public class Main {
    public static void main(String[] args){
        int ogrenciSayisi =12; //değişken isimleri yazılırken ilk kelime küçük harfle başlar. Diğer kelimeler büyük harf ile başlar. java küçük büyük harfe duyarlıdır.
        String mesaj ="Öğrenci sayısı : "; //javada string ifadenin s si büyük yazılır String şeklinde.
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci sayım : "+ ogrenciSayisi); //javada string bir ifade ile int bir ifade toplanırken int ifadeyi de string gibi kabul edip string şeklinde toplama yapılır. Yani + işaretiyle toplama yapılır bu toplamanın anlamı da yan yana yazmaktır. Eğer iki değerde int olsaydı normal toplama işlemi yapılırdı.
        System.out.println("Öğrenci sayım : "+ ogrenciSayisi);
        System.out.println("Öğrenci sayım : "+ ogrenciSayisi);

    }

}