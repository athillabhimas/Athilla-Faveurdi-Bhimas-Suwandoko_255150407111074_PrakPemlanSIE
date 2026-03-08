import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String merk1 = in.nextLine();
        String nopol1 = in.nextLine();
        int waktu1 = in.nextInt();
        in.nextLine();

        //instansiasi objek bernama m1
        Mobil m1 = new Mobil();

        m1.setKecepatan(50);
        m1.setMerk(merk1);
        m1.setNopol(nopol1);
        m1.setWarna("Merah");
        m1.setWaktu(waktu1);
        m1.jarakDitempuh(waktu1);
        m1.ubahKecepatanMps();
        m1.display();

        System.out.println("---------------");

        
        String merk2 = in.nextLine();
        String nopol2 = in.nextLine();
        int waktu2 = in.nextInt();
        in.nextLine();

        //instansiasi objek bernama m2
        Mobil m2 = new Mobil();

        m2.setKecepatan(100);
        m2.setMerk(merk2);
        m2.setNopol(nopol2);
        m2.setWarna("Biru");
        m2.setWaktu(waktu2);
        m2.jarakDitempuh(waktu2);
        m2.ubahKecepatanMps();
        m2.display();

        System.out.println("---------------");
        System.out.println("Atribut pada objek m1 diubah");

        //mengubah warna dari objek m1
        m1.setWarna("Hijau");

        //menampilkan hasil perubahan
        m1.display();

    }
}
