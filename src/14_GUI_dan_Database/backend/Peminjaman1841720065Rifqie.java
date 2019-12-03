package backend;

import backend.Buku1841720065Rifqie;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Peminjaman1841720065Rifqie {
    private int mIdpeminjaman, mIdanggota, mIdbuku;
    private Anggota1841720065Rifqie mAnggota = new 1841720065Rifqie();
    private Buku1841720065Rifqie = new Buku1841720065Rifqie();
    private String mTanggalPinjam;
    private String mTanggalKembali;

    public Peminjaman1841720065Rifqie() {

    }

    public Peminjaman1841720065Rifqie(Anggota1841720065Rifqie anggota, Buku1841720065Rifqie buku, String tanggalpinjam, String tanggalkembali) {
        this.mAnggota = anggota;
        this.mBuku = buku;
        this.mTanggalPinjam = tanggalpinjam;
        this.mTanggalKembali = tanggalkembali;
    }

    public int getmIdanggotaRifqie() {
        return mIdanggota;
    }

    public void setmIdanggotaRifqie(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public int getmIdbukuRifqie() {
        return mIdbuku;
    }

    public void setmIdbukuRifqie(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public int getmIdpeminjamanRifqie() {
        return mIdpeminjaman;
    }

    public void setmIdpeminjamanRifqie(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public Anggota1841720065Rifqie getmAnggotaRifqie() {
        return mAnggota;
    }

    public void setmAnggotaRifqie(Anggota1841720065Rifqie mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720065Rifqie getmBukuRifqie() {
        return mBuku;
    }

    public void setmBukuRifqie(Buku1841720065Rifqie mBuku) {
        this.mBuku = mBuku;
    }

    public String getmTanggalPinjamRifqie() {
        return mTanggalPinjam;
    }

    public void setmTanggalPinjamRifqie(String mTanggalPinjam) {
        this.mTanggalPinjam = mTanggalPinjam;
    }

    public String getmTanggalKembaliRifqie() {
        return mTanggalKembali;
    }

    public void setmTanggalKembaliRifqie(String mTanggalKembali) {
        this.mTanggalKembali = mTanggalKembali;
    }

    public Peminjaman1841720065Rifqie getByIdRifqie(int id) {
        Peminjaman1841720065Rifqie pinjam = new Peminjaman1841720065Rifqie();
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
                + " a.idanggota AS idanggota, "
                + " b.idbuku AS idbuku "
                + " FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + " LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720065Rifqie();
                pinjam.setmIdpeminjamanRifqie(rs.getInt("idpeminjaman"));
                pinjam.setmIdanggotaRifqie(rs.getInt("idanggota"));
                pinjam.setmIdbukuRifqie(rs.getInt("idbuku"));
                pinjam.setmTanggalPinjamRifqie(rs.getString("tanggalpinjam"));

                pinjam.setmTanggalKembaliRifqie(rs.getString("tanggalkembali"));
                pinjam.setmAnggotaRifqie(new Anggota1841720065Rifqie().getByIdRifqie(getmIdanggotaRifqie()));
                pinjam.setmBukuRifqie(new Buku1841720065Rifqie().getByIdRifqie(pinjam.getmIdbukuRifqie()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720065Rifqie> getAllRifqie() {
        ArrayList<Peminjaman1841720065Rifqie> ListPinjam = new ArrayList<>();
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.idanggota AS idanggota, "
                + "b.idbuku AS idbuku "
                + "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720065Rifqie pinjam = new Peminjaman1841720065Rifqie();
                pinjam.setmIdpeminjamanRifqie(rs.getInt("idpeminjaman"));
                pinjam.setmIdanggotaRifqie(rs.getInt("idanggota"));
                pinjam.setmIdbukuRifqie(rs.getInt("idbuku"));
                pinjam.setmTanggalPinjamRifqie(rs.getString("tanggalpinjam"));

                pinjam.setmTanggalKembaliRifqie(rs.getString("tanggalkembali"));
                pinjam.setmAnggotaRifqie(new Anggota1841720065Rifqie().getByIdRifqie(pinjam.getmIdanggotaRifqie()));
                pinjam.setmBukuRifqie(new Buku1841720065Rifqie().getByIdRifqie(pinjam.getmIdbukuRifqie()));

                ListPinjam.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveRifqie() {
        if (getByIdRifqie(mIdpeminjaman).getmIdpeminjamanRifqie()== 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getmAnggotaRifqie().getmIdAnggotaRifqie()+ "', "
                    + "'" + this.getmBukuRifqie().getmIdBukuRifqie()+ "',"
                    + "'" + this.mTanggalPinjam + "', "
                    + "'" + this.mTanggalKembali + "' "
                    + ")";
            this.mIdpeminjaman = DBHelper1841720065Rifqie.insertQueryGetIdRifqie(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "idanggota = '" + this.getmAnggotaRifqie().getmIdAnggotaRifqie()+ "', "
                    + "idbuku = '" + this.getmBukuRifqie().getmIdBukuRifqie()+ "', "
                    + "tanggalpinjam = '" + this.mTanggalPinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalKembali + "'";
            DBHelper1841720065Rifqie.executeQueryRifqie(sql);
        }
    }

    public void cariAnggotaRifqie(int id) {
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getmAnggotaRifqie().setmIdAnggotaRifqie(rs.getInt("idanggota"));
                getmAnggotaRifqie().setmNamaRifqie(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuRifqie(int id) {
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getmBukuRifqie().setmIdBukuRifqie(rs.getInt("idbuku"));
                getmBukuRifqie().setmJudulRifqie(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRifqie() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720065Rifqie.executeQueryRifqie(sql);
    }
}