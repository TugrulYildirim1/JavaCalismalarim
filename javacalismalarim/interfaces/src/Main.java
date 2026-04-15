public class Main {
    public static void main(String[] args) {                //interface ler referans tutucudur.
    //    ICustomerDal customerDal = new OracleCustomerDal(); //interface ler new lenmezler. new ICustomerDal yazarsan olmaz. Ama new OracleCustomerDal ya da new MySqlCustomerDal yazarsak olur çünkü bu classlar interface i implemente etti.Galiba referans tip oldukları için bu şekilde yazılabiliyor ??
        CustomerManager customerManager =new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

    }
}