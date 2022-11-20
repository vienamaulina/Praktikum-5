# Praktikum-5

Pegawai.java
``` java
public class Pegawai {
    private String nama;
    private Double gajiPokok;
    
    //setter
    public void setnama(String nama){
        this.nama = nama;
    }
    public void setgajiPokok(Double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
  

    //getter
    public String getnama(){
        return this.nama;
    }
    public Double getgajiPokok(){
        return this.gajiPokok;
    }

    public Pegawai(String nama, Double gajiPokok) {
       
        System.out.println("Nama        : " + this.nama);
        System.out.println("Gaji Pokok  : " + this.gajiPokok);
     
    }
}
```

Manager.java

``` java
public class Manager extends Pegawai {
    private Double tunjangan;

    public void settunjangan(Double tunjangan){
        this.tunjangan = tunjangan;
    }

    public Double gettunjangan(){
        return this.tunjangan;
    }
    public Manager (Double tunjangan, String nama, Double gajiPokok){
       super(tunjangan, nama, gajiPokok);
        System.out.println("Tunjangan       : " +this.tunjangan);
    }

}

```

Programmer.java

```java
public class Programmer extends Pegawai {
    private Double bonus;

    public void setbonus(Double bonus){
        this.bonus = bonus;
    }
    
    public Double getbonus(){
        return this.bonus;
    }
    public Programmer (Double bonus, String nama, Double gajiPokok) {
      super(bonus, nama, gajiPokok );
        System.out.println("Bonus       : " + this.bonus);
     
    }
}
```

PegawaiBeraksi.java

```java
public class PegawaiBeraksi {
    public static void main(String[] args) {
        //membuat object
        Manager a = new Manager("Anton Santoso", 4791000,1000000);
        Programmer b = new Programmer("Riko Ardian", 5000000,2500000);
    
    }
}
```