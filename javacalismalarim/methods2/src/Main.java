public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer(); //Burada sehirVer() metodu çağırıldı. yeniMesaj ın değeri Ankara oldu.
        System.out.println(yeniMesaj);
        int sayi = topla(15,7); //topla() metodu çağırıldı. 15 ile 7 parametredir. 15 ile 7 nin toplamı sonucunda sayi nin değeri 22 oldu.
        System.out.println(sayi);
        int toplam = topla2(2,3,4); //topla2() metodu çağırılır. Burada metoda istediğimiz kadar parametre yazabiliriz. Variable arguments özelliği sayesinde yapılır.
        System.out.println(toplam);

    }

    public static void ekle(){ //void değer döndürmez.
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void güncelle(){
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2){ //int değer döndürür o yüzden return kullanılması gerekir. Aşağıdaki sayi1+sayi2 değeri döndürülür. sayi1 ile sayi2 parametredir. Parametreler parantez içine yazılır.
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){ //Burada int... 3 nokta variable arguments ı ifade eder. Yani 1 den fazla parametre verebilmek için kullanılır. 1 tane de verilebilir. Aslında burada dizi oluşturulur. Yani metod , dizi gibi birçok değere sahip olabilir.
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }

        return toplam;
    }

    public static String sehirVer(){ //String değer döndürür o yüzden return kullanılması gerkir aşağıdaki Ankara değeri döndürülür.
        return "Ankara";
    }


}