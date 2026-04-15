public class DatabaseLogger extends BaseLogger {
    public void log(String message){  //Override ın anlamı BaseLoggerdaki yapıyı,kodları aynen başka classlarda da yazmak anlamına gelir. Yani public void Log(String message) ı BaseLogger da kullanıp birde başka classlarda kullanmak override etmek anlamına gelir. Bunu yapınca bu classtaki kod çalışır. Burada override edilir.
        System.out.println("Logged to database : "+ message);
    }
}
