# Praktikum-5

<h2> Nama : Viena Dwi Putri Maulina <h2>
<h2> Nim : 312110469 <h2>
<h2> Kelas : TI.21.C1 <h2>
<h2> Mata Kuliah : Pemrograman Berorietansi Objek <h2>
<h3> Tugas  Pertemuan 9 <h3>

<p> Tugas : <p>

![gambar 1](ss/1.png)

<p> Jawab <p>

<p> Pegawai.java <p>

``` java
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

```

<p> Manager.java <p>

```java
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

```
<p> Programmer.java <p>

```java
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

```

<p> main.java <p>

```java
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

```

<p> Outputnya sebagai berikut <p>

![gambar 2](ss/2.png)