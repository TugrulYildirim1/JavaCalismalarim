public class Main {
    public static void main(String[] args){
        int sayi = 24;
        if(sayi<20){ //eğer if() in parantez içindeki değer doğruysa altındaki kodu çalıştır anlamına gelir .Değilse else if e bak o da doğru değilse else e bak ve else in kod bloğunu çalıştır anlamına gelir.
            System.out.println("Sayı 20'den küçüktür");
        }else if(sayi==20){
            System.out.println("Sayı 20'ye eşittir");
        }else{
            System.out.println("Sayı 20'den büyüktür");
        }

    }
}