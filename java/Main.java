public class Main {
    public static void main(String[] args) {
        Pegawai a = new Pegawai();
        Manager b = new Manager ();
        Programmer c = new Programmer();

        a.setnama("Andi");
        a.setgajipokok(5200000);
        b.setnama("Riki");
        b.setgajipokok(6800000);
        b.settunjangan(4000000);
        c.setnama("Anto");
        c.setgajipokok(8000000);
        c.setbonus(5000000);
    
        a.cetakInfo();
        b.cetakInfo();
        c.cetakInfo();
    }
    
    
}
