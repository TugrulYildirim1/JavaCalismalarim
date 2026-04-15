public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(); //CustomerManager class ı çağırıldı.
        customerManager.databaseManager = new MySqlDatabaseManager(); //Burada sağ kısma new den sonra yazılan kısıma tüm database class ları yazılabilir çünkü customerManager class ında tür olarak BasedatabaseManager tanımlandı ve diğer classlarla bu Base classı aynı referans tiptedir. databaseManager ismiyle CustomerManager classında getData() metodu çağırılır.
        customerManager.getCustomers(); //customerManager ismiyle getCustomers() metodu çağırıldı ve bu sayede CustomerManager Class ına ulaşılır oradan da getData metoduna ulaşılır ve yukarıda tanımlanan MysqlDatabaseManager class ına gidilir ve oradaki getData() metodu yazdırılır.


    }
}