public class Main {
    public static void main(String[] args) {
        int number = 25;
        boolean isPrime = true;

        if(number==1){
            System.out.println("Sayı asal değildir ");
            return; //return public static void main() fonksiyonunu bitirmeye yarıyor. Bu sayede aşağıdaki döngüye girmiyor.
        }

        if(number<1) {
            System.out.println("Geçersiz sayı");
            return; // burada da return eklenir. Kendim ekledim Doğru galiba ??
        }

        for (int i = 2; i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){ // Bu şekilde yazıldığında isPrime true kabul edilir.
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değildir");
        }


    }
}