public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";

        manager.add(product);

        // DatabaseHelper.Crud.Delete(); //inner class kullanımı bu şekildedir. DatabaseHelper class ından Crud classı çağırılır ordan da delete metodu çağırılır.
    }
}