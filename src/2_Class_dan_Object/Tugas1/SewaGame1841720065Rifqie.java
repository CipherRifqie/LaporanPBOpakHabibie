public class SewaGame1841720065Rifqie {
    public int ID;
    public String namaMember;
    public String namaGame;
    public int hargaSewa;
    public int lamaSewa;
    public int hargaTotal;
    
public void tampilkanTotalHargaRifqie(){
    hargaTotal = lamaSewa*hargaSewa;
    System.out.println("ID Member : " +ID);
    System.out.println("Nama Member : " +namaMember);
    System.out.println("Nama Game : " +namaGame);
    System.out.println("Lama Sewa : " +lamaSewa +("hari"));
    System.out.println("Harga Sewa : " +hargaSewa);
    System.out.println("Harga Total : " +hargaTotal);
}
}