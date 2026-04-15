public class ProductValidator { //ProductValidator class ı static tanımlanamaz. Ama class içinde başka bir class static tanımlanabilir. Bu da inner class olur.

    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }

    }
    //inner class
    //public static class BaskaBirClass(){ //Burada class içinde başka bir class tanımlandı Yani iç içe class yapısı oluştu(inner class). Bu iç içe classta class ın içindeki class static olabilir.
        //public static void Sil(){

    //    }
    //  }
}
