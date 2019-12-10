package frontend;

import backend.Anggota1841720065Rifqie;

public class TestBackendAnggota1841720065Rifqie {
    public static void main(String[] args) {
        Anggota1841720065Rifqie agt1 = new Anggota1841720065Rifqie("Rifqie", "Malang", "123");
        Anggota1841720065Rifqie agt2 = new Anggota1841720065Rifqie("Muhammad", "Blitar", "456");
        Anggota1841720065Rifqie agt3 = new Anggota1841720065Rifqie("Ambrose", "Surabya", "789");

        //test insert
        agt1.saveRifqie();
        agt2.saveRifqie();
        agt3.saveRifqie();

        //test update
        agt2.setmAlamatRifqie("Jawa Timur");
        agt2.saveRifqie();

        //test delete
        agt3.deleteRifqie();

        //tes select all
        for (Anggota1841720065Rifqie k : new Anggota1841720065Rifqie().getAllRifqie()) {
            System.out.println("Nama: " + k.getmNamaRifqie()+ ", Alamat : " + k.getmAlamatRifqie()+ ", Telepon : " + k.getmTeleponRifqie());
        }

        //test search
        for (Anggota1841720065Rifqie a : new Anggota1841720065Rifqie().searchRifqie("Timur")) {
            System.out.println("Nama: " + a.getmNamaRifqie()+ ", Alamat : " + a.getmAlamatRifqie()+ ", Telepon : " + a.getmTeleponRifqie());
        }
    }
}
