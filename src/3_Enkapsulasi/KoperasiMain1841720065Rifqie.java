public class KoperasiMain1841720065Rifqie {
    public static void main(String[] args) {
        Anggota1841720065Rifqie anggota1 = new Anggota1841720065Rifqie("Rifqie", "Jalan Bantaran");
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp " +anggota1.getSimpanan());
        
        anggota1.setNama("Rifqie Muhammad");
        anggota1.setAlamat("Jalan Bantaran No.2 Malang");
        anggota1.setor(250000);
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp " +anggota1.getSimpanan());
     
        anggota1.pinjam(50000);
        System.out.println("Simpanan " +anggota1.getNama() +" : Rp " +anggota1.getSimpanan());
    }
}