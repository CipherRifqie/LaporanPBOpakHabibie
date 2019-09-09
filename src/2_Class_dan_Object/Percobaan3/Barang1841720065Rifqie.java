public class Barang1841720065Rifqie {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangRifqie(){
        System.out.println("Nama Barang : " +namaBrg);
        System.out.println("Jenis Barang : " +jenisBrg);
        System.out.println("Stok : " +stok);
    }
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk+stok;
        return stokBaru;
    }
}