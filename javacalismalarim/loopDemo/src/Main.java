public class Main {
    public static void main(String[] args) {
        //For
        for(int i=1;i<10;i++){ //for döngüsü bu şekilde yazılır. Burada i yi 1 den başlatırız ve 10 a kadar birer birer arttırırız.
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");


        //While
        int i=1;
        while(i<10){ //while döngüsü bu şekilde yazılır. Önce yukarıda int i=1; yazılıp i nin veri tipi belirtilir sonra while() döngüsüne şart yazılır ve while döngüsünün kod bloğu içerisine de i++ yazılır.
            System.out.println(i);
            i++;
        }

        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=1;
        do{                       //do while döngüsü bu şekilde yazılır. do while döngüsünde döngü çalışmasa da kod bloğu 1 kez çalıştırılır. Döngü çalışırsa while döngüsü gibi çalışır.
            System.out.println(j);  //Burada j yi yazdır sonra j yi 2 arttır sonra while döngüsünün şartı sağlanıyorsa tekrar başa dön kodu çalıştır anlamına gelir. Bu durum döngü bitene kadar devam eder.
            j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");




    }
}