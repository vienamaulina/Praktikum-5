public class Programmer extends Pegawai {
    double bonus;
     public Programmer(String nama, double gajipokok, double bonus) {
        super(nama, gajipokok);
        this.bonus = bonus;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Bonus       : "+this.bonus);
    }
}
