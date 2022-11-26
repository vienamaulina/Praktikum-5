public class Pegawai {
     private String nama;
     private double gajipokok;

     //Constructor
    public Pegawai(){
        this.nama = nama;
        this.gajipokok = gajipokok;

    }

    //setter
    public void setnama(String nama){
        this.nama = nama;
    }

    public void setgajipokok(double gajipokok){
        this.gajipokok = gajipokok;
    }

    //getter
    public String getnama(){
        return nama;
    }

    public double gajipokok(){
        return gajipokok;
    }

    public void cetakInfo(){
        System.out.println("Nama        : "+ this.nama);
        System.out.println("Gaji Pokok  : "+this.gajipokok);
    }
}
