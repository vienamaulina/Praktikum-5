public class Pegawai {
     String nama;
     double gajipokok;

    public Pegawai(String nama, double gajipokok){
        this.nama = nama;
        this.gajipokok = gajipokok;

    }

    public void cetakInfo(){
        System.out.println("Nama        : "+ this.nama);
        System.out.println("Gaji Pokok  : "+this.gajipokok);
    }
}
