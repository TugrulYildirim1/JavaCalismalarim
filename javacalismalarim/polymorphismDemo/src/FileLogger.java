public class FileLogger extends BaseLogger {
    public void log(String message){ //Burada override edilir.
        System.out.println("Logged to file : "+ message);
    }
}
