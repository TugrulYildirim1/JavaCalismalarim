public class BaseKrediManager {
    public double hesapla(double tutar){ //public final double hesapla(double tutar) eğer bu şekilde kullanılırsa, burada final kullanılırsa başka class lar bu metodu override edemez.
        return tutar * 1.18;
    }
}
