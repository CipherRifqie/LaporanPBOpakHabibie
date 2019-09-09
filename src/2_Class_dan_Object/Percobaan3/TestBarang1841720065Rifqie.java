public class TestBarang1841720065Rifqie {
    public static void main(String[] args) {
        Barang1841720065Rifqie brg1 = new Barang1841720065Rifqie();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangRifqie();
        System.out.println("Stok Baru adalah : " +brg1.tambahStok(20));
}
}