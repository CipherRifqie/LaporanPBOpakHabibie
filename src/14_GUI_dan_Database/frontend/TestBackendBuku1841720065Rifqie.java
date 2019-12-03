package frontend;

import backend.Buku1841720065Rifqie;
import backend.Kategori1841720065Rifqie;

public class TestBackendBuku1841720065Rifqie {
    public static void main(String[] args) {
        Kategori1841720065Rifqie novel = new Kategori1841720065Rifqie().getByIdRifqie(1);
        Kategori1841720065Rifqie referensi = new Kategori1841720065Rifqie().getByIdRifqie(2);

        Buku1841720065Rifqie buku1 = new Buku1841720065Rifqie(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720065Rifqie buku2 = new Buku1841720065Rifqie(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720065Rifqie buku3 = new Buku1841720065Rifqie(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.saveRifqie();
        buku2.saveRifqie();

        // test update
        buku2.setmJudulRifqie("Aljabar Linier");
        buku2.saveRifqie();

        // test delete
        buku3.deleteRifqie();

        // test select all
        for (Buku1841720065Rifqie b : new Buku1841720065Rifqie().getAllRifqie()) {
            System.out.println("Kategori: " + b.getmKategoriRifqie().getmNamaRifqie() + ", Judul: " + b.getmJudulRifqie());
        }

        // test search
        for (Buku1841720065Rifqie b : new Buku1841720065Rifqie().searchRifqie("timun")) {
            System.out.println("Kategori: " + b.getmKategoriRifqie().getmNamaRifqie() + ", Judul: " + b.getmJudulRifqie());
        }

    }
}
