public class Main {
    public static void main(String[] args) { //Bellekte 2 yer vardır. Biri stack dir biri heap dir.
        //referans tip
        CustomerManager customerManager = new CustomerManager(); //Buradaki CustomerManager yani 1. olan türdür. Yani int veri tipi gibi düşün. 2. olan ise yani customerManager isimdir. Oraya herhangi bir isim yazılabilir. new CustomerManager anlamı ise bellekte o an CustomerManager türünde bir nesne üretmiş oluyoruz. new diyince o nesneden bir örnek oluşturuyor. Sol kısım ise yani ilk yazılan stack de yer tutar. Bir class ın çağırımı bu şekildedir.
        CustomerManager customerManager2 = new CustomerManager(); //Burada da customerManager2 oluşturuldu . Class lar referans tiptir.
        customerManager = customerManager2; //Burada customerManager2 nin referans numarası customerManager a atandı yani ikiside aynı referans numarasına sahip olur.
        customerManager.Add(); //Bu şekilde diğer classtaki metodlar çağırılır.
        customerManager.Remove();
        customerManager.Update();

        //değer tip
        int sayi1 = 10;//değer tip in anlamı bir değişken başka bir değişkene atandığı zaman sadece değeri atanır. Birisinde değer değişirse diğerini etkilemez.
        int sayi2 = 20;//int gibi veri tipleri değer tiptir.
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        //referans tip
        int[] sayilar1 = new int[]{1,2,3};//referans tip in anlamı bir değişken başka bir değişkene atandığı zaman ikisi de aynı yeri gösterir. Yani birisinde değer değiştiği zaman diğerinde de değişir.
        int[] sayilar2 = new int[]{4,5,6};//diziler referans tiptir. int tipinde olsa bile referans tip olur.
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

    }
}