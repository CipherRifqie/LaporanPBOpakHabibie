package backend;
import backend.*;

public class TestBackend1841720065Rifqie {
public static void main(String[] args)
{
Kategori1841720065Rifqie kat1 = new Kategori1841720065Rifqie("Novel", "Koleksi buku novel");
Kategori1841720065Rifqie kat2 = new Kategori1841720065Rifqie("Referensi", "Buku referensi ilmiah");
Kategori1841720065Rifqie kat3 = new Kategori1841720065Rifqie("Komik", "Komik anak-anak");

// test insert kat1.save();
kat2.saveRifqie();
kat3.saveRifqie();

// test update
kat2.setKeteranganRifqie("Koleksi buku referensi ilmiah"); kat2.saveRifqie();

// test delete kat3.delete();

// test select all
for(Kategori1841720065Rifqie k : new Kategori1841720065Rifqie().getAllRifqie())
{
System.out.println("Nama: " + k.getNamaRifqie()+ ", Ket: " + k.getKeteranganRifqie());
}

// test search
for(Kategori1841720065Rifqie k : new Kategori1841720065Rifqie().searchRifqie("ilmiah"))
{
System.out.println("Nama: " + k.getNamaRifqie()+ ", Ket: " + k.getKeteranganRifqie());
}
}
}