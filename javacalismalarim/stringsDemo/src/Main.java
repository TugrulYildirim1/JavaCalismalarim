public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length()); //mesaj.length() string in kaç elemanı olduğunu gösterir. Yani kaç karakterden oluştuğunu gösterir. String de aslında bir karakter dizisidir.
        System.out.println("5. eleman : " + mesaj.charAt(4)); //mesaj.charAt(4) mesaj string inin 4. indexini verir yani n harfini.
        System.out.println(mesaj.concat("Yaşasın!")); //mesaj.concat() ile birleştirme işlemi yapılır. yani mesaj stringiyle concatin içerisindeki string birleştirilir yan yana yazılır.
        System.out.println(mesaj.startsWith("A")); //mesaj.startsWith() string in ilk karakterinin ne ile başladığını belirtmek için kullanılır. sonuç da true ya da false olur. boolean ifade döndürür. Yani startsWith() in parantezine doğru değer girilirse true yazdırır. Yanlış değer girilirse false yazdırır.
        System.out.println(mesaj.endsWith(".")); //mesaj.endsWith() string in son karakterinin ne ile bittiğini belirtmek için kullanılır. Bu da true ya da false yazdırır.
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler, 0); //Bu kodun anlamı mesaj string indeki karakterleri al , karakterler adında yeni bir char dizisine karakterlerini ata anlamına gelir. Yani burada mesaj string inde 0. indexten başla ve 0. index ten 5.index e kadar olan karakterleri al karakter dizisine yazdır demek. 5.index dahil değil.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); //mesaj.indexOf() belirttiğim karakterin mesajın içerisinde kaçıncı eleman olduğunu bulmaya yarar. Ve ilk bulduğunu verir operasyonu bitirir.
        System.out.println(mesaj.lastIndexOf("a")); //mesaj.lastIndexOf() aramaya en sağdan başlar. Ama yine index numarası baştan sayılır.

        String yeniMesaj = mesaj.replace(' ','-'); //mesaj.replace() karakterleri değiştirmek için kullanılır. Örneğin burada boşluk karakteri çizgi karakteri ile değiştirilmiştir. Boşluk olan yerler artık - olur.
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5)); //mesaj.substring() string in belli karakterlerini almak için kullanılır. Örneğin mesaj.substring(2) nin anlamı mesaj string inin 2.indexinden sonuna kadar yazdır demektir. mesaj.substring(2,5) in anlamı ise 2.indexten 5.indexe kadar olan karakterleri yazdır demektir. 5. dahil değil.

        for(String kelime : mesaj.split(" ")) { //mesaj.split() kelimeleri ayırmak için kullanılır. Burada kelimeler boşluğa göre ayırılır ve tek tek yazdırılır.
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); //mesaj.toLowerCase() kelimeleri küçük harfle yazdırır. Karakterleri küçük harfe çevirir.
        System.out.println(mesaj.toUpperCase()); //mesaj.toUpperCase() kelimeleri büyük harfle yazdırır. Karakterleri büyük harfe çevirir.
        System.out.println(mesaj.trim()); //mesaj.trim() string in başında ve sonundaki boşlukları atmaya yarar.


    }
}