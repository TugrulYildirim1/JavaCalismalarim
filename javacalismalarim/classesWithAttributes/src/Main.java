public class Main {
    public static void main(String[] args) {
        //Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Siyah"); //Bu parametreli constructor anlamına geliyor Bu şekilde de set edilir. Bu şekilde de yazdırılır. Aşağıdaki set kullanımı ile de yazdırılır. İkiside sonuç verir
        Product product = new Product(); //Product class ı çağırıldı.
        product.setName("Laptop"); // Product class ının özellikleri tanımlandı.Yani özelliklerine değer verildi.
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager(); //ProductManager class ı çağırıldı.
        productManager.Add(product); //ProductManager ın Add metodu çağırıldı ve product parametresi yazıldı. Bu sayede Add metodunun içindeki kod yazdırılır.
        System.out.println(product.getKod()); //Kodun okunmasını sağlıyor.

    }
}