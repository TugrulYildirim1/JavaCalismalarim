public class Main {
    public static void main(String[] args) {
        //try-catch
//        try
//        {
//            int[] sayilar = new int[]{1,2,3}; //try ın anlamı altındaki kodu çalıştırmayı dene demektir. Eğer çalışmazsa catch bloğu çalışır.
//            System.out.println(sayilar[2]);
//        }catch (Exception exception) {        //try çalışmazsa catch in altındaki kod çalışır. Mutlaka try ya da catch in ikisinden biri çalışır.
//            System.out.println(exception);
//        }finally {                            //finally ise try ya da catch in ikisinden biri çalışsa bile mutlaka finally de çalışır.
//            System.out.println("Ben her türlü çalışırım");
//        }
//    }
        try {
            int[] sayilar = new int[]{1, 2, 3};
            System.out.println(sayilar[4]);
        } catch (StringIndexOutOfBoundsException exception) { //buradaki exception türü Exception dan türer.
            System.out.println(exception);
        } catch (ArrayIndexOutOfBoundsException exception) { //buradaki exception türü Exception dan türer.
            System.out.println(exception);
        } catch (
                Exception exception) {                      //Birden fazla catch bloğu yazılabilir. Exception tüm exception türlerini içerir. O yüzden yukarıdaki exceptionlardan birisi çalışmasa bile en son buradaki catch bloğu çalışır çünkü Exception türünde. Ama burada 2. catch çalışır buna gerek kalmaz. Çünkü bu bir Array hatasıdır.
            System.out.println("Loglandı : " + exception);
        } finally {                                           //finally hertürlü çalışır.
            System.out.println("Ben her türlü çalışırım");
        }

    }

}