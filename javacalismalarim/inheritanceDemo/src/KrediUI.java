public class KrediUI {
    public void KrediHesapla(BaseKrediManager baseKrediManager){ //KrediUI class ında oluşturulan KrediHesapla metoduna BaseKrediManager baseKrediManager parametre olarak gönderiliyor.
        baseKrediManager.Hesapla(); //basekrediManager ın Hesapla metodu çağırılıyor. Sonra KrediUI class ı main class ından çağırılıcak ve KrediUI ın KrediHesapla metodu çağırılcak ve parametre olarak da BaseKrediManager gönderilecek bu sayede BaseKrediManager Hesapla() metodu çalıştırılcak. Aynı şekilde OgretmenKrediManager, TarımKrediManager , AskerKrediManager mainde KrediUI ın KrediHesapla metoduna parametre olarak gönderilerek bu classlarda çalıştırılabilecek. Çünkü BaseKrediManager diğerlerinin annesi. Yani Diğerleri BaseKrediManagerın özelliklerini miras alıyor.
    }
}
