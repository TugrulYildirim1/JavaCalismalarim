public class MySqlCustomerDal implements ICustomerDal, IRepository{ //Birden fazla interface implemente edilebilir.
    //override
    public void Add() {
        System.out.println("My sql eklendi");
    }

}
