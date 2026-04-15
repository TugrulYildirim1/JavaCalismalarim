public class EmailLogger extends BaseLogger{
    public void log(String message){ //Burada override edilir.
        System.out.println("Logged to email : "+ message);
    }
}
