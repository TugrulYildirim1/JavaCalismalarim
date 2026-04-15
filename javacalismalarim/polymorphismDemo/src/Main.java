public class Main {
    public static void main(String[] args) {
        //Bu polymorphism dir. Çokbiçimlilik.
    //    BaseLogger[] loggers =new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger};
    //    for (BaseLogger logger:loggers){
    //        logger.Log("Log mesajı");
    //    }

        CustomerManager customerManager =new CustomerManager (new FileLogger());
        customerManager.add();

    }
}