public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {  //switch case kullanımı bu şekildedir. Bunun anlamı switch() deki parantez içine mesela buradaki grade yazılır ona göre case lere yani durumlara ayrılır grade ne ise o case e gider ve o case in altındaki kodu çalıştırır.
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:                  //default ise case durumlarının dışında bir durum olursa yani case durumlarından başka bir durum olursa default a girer ve default un altındaki kod yazdırılır.
                System.out.println("Geçersiz not girdiniz");
        }
    }
}