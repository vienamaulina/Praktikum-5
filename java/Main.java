public class Main {
    public static void main(String[] args) {
        Pegawai a = new Pegawai("Andi", 5200000);
        Manager b = new Manager ("Riki", 6800000, 4000000);
        Programmer c = new Programmer("Anto", 8000000, 5000000);
    
        a.cetakInfo();
        b.cetakInfo();
        c.cetakInfo();
    }
    
    
}
