public class GeometriApp {
    public static void main(String[] args) {
        Lingkaran lingKecil = new Lingkaran(2.0f);
        Lingkaran lingBesar = new Lingkaran(11.0f);

        float lK  = lingKecil.luas();
        float lB = lingBesar.luas();

        float kK = lingKecil.keliling();
        float kB = lingBesar.keliling();

        System.out.println("Luas dan Keliling Lingkaran Kecil " + lK + " dan " + kK);
        System.out.println("Luas dan Keliling Lingkaran Besar " + lB + " dan " + kB);
        
    }
}
