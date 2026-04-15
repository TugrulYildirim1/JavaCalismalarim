public class DortIslem {
    public int topla(int sayi1, int sayi2){  //Burada int topla(int sayi1, int sayi2) ile aşağıdaki topla(int sayi1, int sayi2, int sayi3) yazılarak Overloading yapılmıştır. Bu bir Overloading tir.
        return sayi1+sayi2;                  //Overloading, aynı isime sahip ama farklı parametrelere sahip metotlara denir.
    }

    public int topla(int sayi1, int sayi2, int sayi3){
        return sayi1+sayi2+sayi3; //Eğitimde sayi1+sayi2 yazmış ama sayi1+sayi2+sayi3 de oluyor. Galiba 3 parametreyi de kullanabiliriz.
    }
}
