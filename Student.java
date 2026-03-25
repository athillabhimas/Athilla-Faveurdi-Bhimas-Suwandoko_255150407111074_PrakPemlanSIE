public class Student {
    private String nama;
    private int skor;

    public Student(String nama) {
        this.nama = nama;
    }

    private void setNama(String nama) { 
        this.nama = nama;
    }

    public void aksesMethod(String nama) {
        setNama(nama);
    }

    String getNama() {
        return this.nama;
    }

    public static int setSkor(int skor) {
        return skor;
    }

    public int getSkor(int skor) {
        return skor;
    }
}
