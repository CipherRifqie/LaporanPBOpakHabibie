public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;
    public int nomorTelepon;
    public String asalNegara;
    
    public void tampilBiodata(){
        System.out.println("NIM : " +nim);
        System.out.println("Nama : " +nama);
        System.out.println("Alamat : " +alamat);
        System.out.println("Kelas : " +kelas);
        System.out.println("Nomor Telepon : " +nomorTelepon);
        System.out.println("Asal Negara : " +asalNegara);
    }
}