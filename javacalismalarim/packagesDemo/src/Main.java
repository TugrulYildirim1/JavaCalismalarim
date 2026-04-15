import matematik.DortIslem; //bunlar yerine import matematik.* yazılarak matematik paketindeki her şeyi import et anlamına gelir.
import matematik.Logaritma;
import java.util.Scanner; //bir paketi başka projede kullanmak için onu import etmek gerekiyor. paketler arası erişim import ile olur.
public class Main { //import edince main in içerisinde java.util.Scanner kullanılacak anlamına gelir. Bu da kullanıcıdan bilgi almaya yarıyor.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Kullanıcıdan bilgi almak için bu kodlar yazılır.

        System.out.println("Adınız:");

        String isim = scanner.nextLine(); //Kullanıcıdan bilgi almak için bu kodlar yazılır.

        System.out.println("Merhaba "+isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);
        Logaritma logaritma = new Logaritma();
    }
}