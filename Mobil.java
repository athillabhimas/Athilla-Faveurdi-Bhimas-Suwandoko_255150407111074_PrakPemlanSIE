public class Mobil {
    
    private String nopol;
    private String warna;
    private String merk;
    public int kecepatan;
    private int jarakTempuh;
    private int waktu;
    private double kecepatanMps;

    public void setNopol(String n){
        nopol = n;
    }

    public void setWarna(String s){
        warna = s;
    }

    public void setMerk(String m){
        merk = m;
    }

    public void setKecepatan(int k){
        kecepatan = k;
    }

    public void setWaktu(int w){
        waktu = w;
    }

    public void jarakDitempuh(int w){
        jarakTempuh = kecepatan * w;
    }

    public void ubahKecepatanMps(){
        kecepatanMps = kecepatan * 5/18;
    }

    public void display(){
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
        System.out.println("jika mobil melaju " + kecepatan + " kpj, selama " + waktu + " jam, jaraknya " + jarakTempuh + " km");
        System.out.println("kecepatan dalam meter per second adalah " + kecepatanMps + " mps");
    }
}
