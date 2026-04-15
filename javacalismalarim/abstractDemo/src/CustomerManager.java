public class CustomerManager {

    BaseDatabaseManager databaseManager; //Bu classta tür olarak BaseDatabaseManager belirlendi. Bu sayede diğer databaselerde kullanılabilecek çünkü onlar da aynı referans tipte çünkü diğer classlar BaseDatabase class ının özelliklerini miras aldı. Yani extend ettiler.

    public void getCustomers(){ //Başka bir classtan CustomerManager classının getCustomers metodu çağırıldığında databaseManager ismiyle getData metodu çağırılır. Bu da tüm database classlarında mevcut bu sayede mainden hepsi çağırılabilir.
        databaseManager.getData();
    }
}
