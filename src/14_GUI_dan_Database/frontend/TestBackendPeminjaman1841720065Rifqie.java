package frontend;

import backend.Anggota1841720065Rifqie;
import backend.Buku1841720065Rifqie;
import backend.Peminjaman1841720065Rifqie;

public class TestBackendPeminjaman1841720065Rifqie {

    public static void main(String[] args) {
        Anggota1841720065Rifqie agt = new Anggota1841720065Rifqie().getByIdRifqie(1);
        Buku1841720065Rifqie TimunMas = new Buku1841720065Rifqie().getByIdRifqie(1);
        Peminjaman1841720065Rifqie peminjaman1 = new Peminjaman1841720065Rifqie(agt, TimunMas, "2019/12/26", "2019/12/28");
        peminjaman1.saveRifqie();
        for (Peminjaman1841720065Rifqie p : new Peminjaman1841720065Rifqie().getAllRifqie()) {
            System.out.println("Nama Peminjam : " + p.getmAnggotaRifqie().getmNamaRifqie() + "\n"
                    + "Nama Buku : " + p.getmBukuRifqie().getmJudulRifqie()+ "\n"
                    + "Tanggal Pinjam: " + p.getmTanggalPinjamRifqie()+ "\n"
                    + "Tanggal Kembali: " + p.getmTanggalKembaliRifqie());
        }
    }
}
