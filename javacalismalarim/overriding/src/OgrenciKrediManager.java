public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){ //Bunun anlamı BaseKrediManager ın hesapla() sını öğrenci için ezdik anlamına gelir. Yani Override ettik. Extend edilse bile artık burdaki hesapla() çalışır.
        return tutar * 1.10;
    }
}
