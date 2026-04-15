import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile(){
        File file =new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\javademos\\files\\students.txt");
        if(file.exists()){ //dosya var mı anlamına gelir.
            System.out.println("Dosya adı : " + file.getName()); //getName() dosyanın adını verir
            System.out.println("Dosya yolu : " + file.getAbsolutePath()); //getAbsolutePath() dosyanın nerede olduğunu gösterir.
            System.out.println("Dosya yazılabilir mi : "+file.canWrite()); //canWrite() dosyaya yazılabilir mi anlamına gelir true yada false döndürür.
            System.out.println("Dosya okunabilir mi : "+file.canRead()); //canRead() dosya okunabilir mi anlamına gelir. true yada false döndürür.
            System.out.println("Dosya boyutu (byte) : "+file.length()); //length() dosyanın boyutunu verir.
        }
    }

    public static void readFile() {
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}