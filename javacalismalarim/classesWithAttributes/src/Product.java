public class Product {

    public Product(int id, String name, String description, double price, int stockAmount, String renk){ //Bu bir constructor dır. Public yazılır sınıfın ismi yazılır içine parametreler yazılır. Parametrelerin yazılması gerekir.
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.renk = renk;
        this.name = name;     //this.id this.name bunları ve diğerlerini yazarak aşağıdaki private int id , private String name i ve diğerlerini set ettik.
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product(){             //Burada overloading(aşırı yükleme) yapılır. Yukarıdaki Product 6 parametrelidir buradaki Product parametresizdir. Aynı isim farklı parametre olunca overloading olur. public Product() parametresiz constructor dır.

    }

    //attribute | field
    private int id; //Product class ı özellik tutuyor. Özellikler bu şekilde tutulur.   //int id public özelliktedir. ama başına private yazarsak private özellikte olur. Yani sadece tanımlandığı kod bloğu içerisinde geçerlidir. private olan değer dışarıdan ulaşılamaz.
    private String name; //aynı şekilde burada da private String name yazarsak private özellikte olur. Burası da public özelliktedir çünkü yukarıda public tanımlandı.
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter           //getter setter kullanımları encapsulation da kullanılır. Anladığım kadarıyla getter ve setter lar private tanımlanan bir değerin dışarıdan yani başka bir classtan erişilebilir olması için yazılır.
    public int getId(){  //get kodu okumaya yarar read only özelliktedir. Bu bir return ifadedir. integer olduğu için değer döndürür.Sadece böyle bırakılırsa yani set olmazsa id yi okuyabilir demek yazamaz ama okuyabilir.
        return id;    //getter da yazılan tür değer döndürür o yüzden return yazılır. Burada int değer döndürür o yüzden return yazılır.
    }

    //setter
    public void setId(int id){  //set kodu yazmaya yarar. set demek git onun değerini kur demek. set edilen değer parametre olarak verilmeli.
        this.id=id; //this benim içerisinde bulunduğum class demek. setter da değer döndürmeye gerek yok o yüzden void kullanılır.
    }                           //getter ve setter kullanımı bu şekildedir. Yazımı bu şekildedir.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() { //kodu kullanıcının yazması engellenir. Sadece getter yazılarak.
        return this.name.substring(0,1) + id;
    }
}
