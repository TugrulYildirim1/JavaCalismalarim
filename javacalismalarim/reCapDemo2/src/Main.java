public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.3, 5.6}; //Dizi bu şekilde de yazılabilir.
        double total = 0;
        double max = myList[0];
        for (double number : myList) { //myList dizisindeki tüm elemanları gez anlamına gelir. number isimdir sadece. Yani buradaki kodun anlamı myList deki numberları gez demektir.
            if (max < number) { //dizideki en büyük sayıyı bulmak için bu kod yazılır.
                max = number;
            }
            total = total + number; //dizideki elemanların toplam değerini bulmak için bu kod yazılır.
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);

    }
}