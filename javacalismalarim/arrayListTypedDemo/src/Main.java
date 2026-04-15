import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String>(); //<> işaretleri arasında verilen türe göre o koleksiyonun elemanları o türde olur. Yani String tanımlanırsa elemanlarda String türünde olmalı.
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        sehirler.remove("İstanbul"); //bu şekilde de eleman kaldırılabilir. String ifade şeklinde yazarak da eleman silinebilir.
        Collections.sort(sehirler); //sehirler ArrayList ini sıralamak için sort kullanılır.
        for (String sehir: sehirler){
            System.out.println(sehir);
        }

    }
}