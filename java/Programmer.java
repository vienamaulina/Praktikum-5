public class Programmer extends Pegawai {
    private double bonus;
     public Programmer() {
        super();
    }

    public void setbonus(double bonus){
        this.bonus = bonus;
    }

    public double getbonus(){
        return bonus;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Bonus       : "+this.bonus);
    }
}
