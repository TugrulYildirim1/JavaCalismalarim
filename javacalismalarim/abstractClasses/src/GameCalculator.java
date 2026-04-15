public abstract class GameCalculator {  //abstract class lar ın normal class lardan farkı new lenemiyor. Yani main class da new yazarak sınıf çağırılamıyor. Ve abstract tanımlanan bir class ın metodu başka bir class tarafından extend edildiğinde o extend eden miras alan class metodu direk miras alamıyor o metodu override etmemiz gerekiyor. Yani metodu ezmeliyiz kendimiz aynı metodu yazmalıyız. Kod bloğunun içine ise istediğim gibi kod yazabiliriz. Base tek başına bir anlam ifade etmiyor(GameCalculator class ı).
    public abstract void hesapla(); //abstract class ın kullanımı yukarıda class tan öncec abstract tanımlancak ve metoddan önce de abstract tanımlancak. Bu şekilde bir class ın abstract class olduğu anlaşılır. Birden çok abstract lı metod oluşturulabilir. Ama extend edilen yerlerden yani bu class ın metodunu miras alan classların bu metodu kullanabilmesi için bu metodu override etmesi gerekir.

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }

}
