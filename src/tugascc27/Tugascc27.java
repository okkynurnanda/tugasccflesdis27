package tugascc27;
import java.util.Scanner;
public class Tugascc27 {
    public static void main(String[] args) {
        fungsi untuk = new fungsi();
        untuk.identitas();
        
        System.out.println("Data Pengumpulan Flashdisk");
        System.out.print("Nama Mahasiswa: ");
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        System.out.print("Merk Flashdisk : ");
        Scanner scm = new Scanner(System.in);
        String merk = scm.next();
        System.out.print("Kapasitas Flashdisk : ");
        Scanner sck = new Scanner(System.in);
        String kapasiti = scm.next();
        System.out.print("----------------------\n");
        flesdis kumpul = new flesdis(name, merk, kapasiti);
        System.out.println(kumpul.name());
        System.out.println(kumpul.merk());
        System.out.println(kumpul.kapasiti());

        
        System.out.println("Terima Kasih.");   
    }
}
