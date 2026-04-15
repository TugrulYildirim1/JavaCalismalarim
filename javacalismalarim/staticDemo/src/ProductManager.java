public class ProductManager {
    public void add(Product product) {
        if(ProductValidator.isValid(product)){ //ProductValidator ın metodu static olduğu için ProductValidator newlenmeden isValid metodu çağırılabilir.
            System.out.println("Eklendi");     //static ler direk class ismiyle çağırılır ve çağırıldığı anda da bellekte oluşturulur. Burada ProductValidator class ının isValid metodu ProductValidator.isValid() şeklinde çağırıldı. Yani ProductValidator class ı newlenmedi ve direk class ismiyle metod çağırıldı. Bu static metod sayesinde oldu.
        }else{
            System.out.println("Ürün bilgileri geçersizdir.");
        }

    }
}
