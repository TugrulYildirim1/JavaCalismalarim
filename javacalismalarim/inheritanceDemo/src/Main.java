public class Main {
    public static void main(String[] args) {
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager()); //Buraya parametre olarak BaseKrediManager da gönderilse OgretmenKrediManager,TarimKrediManager,AskerKrediManager da gönderilse burası çalışır. Çünkü KrediUI class ındaki KrediHesapla metoduna BaseKrediManager parametre olarak gönderildi.
    }
}