public class Manager  extends Pegawai {
    private double tunjangan;

    public Manager() {
        super();
    }

    public void settunjangan(double tunjangan){
        this.tunjangan = tunjangan;
    }

    public double gettunjangan(){
        return tunjangan;
    }
    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Tunjangan   : "+this.tunjangan);
    }
}
