package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Buku1841720065Rifqie {

    private int mIdBuku;
    private Kategori1841720065Rifqie mKategori = new Kategori1841720065Rifqie();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public Buku1841720065Rifqie() {
    }

    public Buku1841720065Rifqie(Kategori1841720065Rifqie mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getmIdBukuRifqie() {
        return mIdBuku;
    }

    public void setmIdBukuRifqie(int mIdBuku) {
        this.mIdBuku = mIdBuku;
    }

    public Kategori1841720065Rifqie getmKategoriRifqie() {
        return mKategori;
    }

    public void setmKategoriRifqie(Kategori1841720065Rifqie mKategori) {
        this.mKategori = mKategori;
    }

    public String getmJudulRifqie() {
        return mJudul;
    }

    public void setmJudulRifqie(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getmPenerbitRifqie() {
        return mPenerbit;
    }

    public void setmPenerbitRifqie(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulisRifqie() {
        return mPenulis;
    }

    public void setmPenulisRifqie(String mPenulis) {
        this.mPenulis = mPenulis;
    }


    public Buku1841720065Rifqie getByIdRifqie(int id) {
        Buku1841720065Rifqie buku = new Buku1841720065Rifqie();
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT "
                + "    b.idbuku as idbuku, "
                + "    b.judul as judul,"
                + "    b.penerbit as penerbit, "
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan"
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + "    where b.idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku1841720065Rifqie();
                buku.setmIdBukuRifqie(rs.getInt("idBuku"));
                buku.getmKategoriRifqie().setmIdkategoriRifqie(rs.getInt("idkategori"));
                buku.getmKategoriRifqie().setmNamaRifqie(rs.getString("nama"));
                buku.getmKategoriRifqie().setmKeteranganRifqie(rs.getString("keterangan"));
                buku.setmJudulRifqie(rs.getString("judul"));
                buku.setmPenerbitRifqie(rs.getString("penerbit"));
                buku.setmPenulisRifqie(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720065Rifqie> getAllRifqie() {
        ArrayList<Buku1841720065Rifqie> listBuku1841720065Rifqie = new ArrayList<>();
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT "
                + "    b.idbuku as idbuku, "
                + "    b.judul as judul, "
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis, "
                + "    k.idkategori as idkategori, "
                + "    k.nama as nama, "
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        try {
            while (rs.next()) {
                Buku1841720065Rifqie buku = new Buku1841720065Rifqie();
                buku.setmIdBukuRifqie(rs.getInt("idbuku"));
                buku.getmKategoriRifqie().setmIdkategoriRifqie(rs.getInt("idkategori"));
                buku.getmKategoriRifqie().setmNamaRifqie(rs.getString("nama"));
                buku.getmKategoriRifqie().setmKeteranganRifqie(rs.getString("keterangan"));
                buku.setmJudulRifqie(rs.getString("judul"));
                buku.setmPenerbitRifqie(rs.getString("penerbit"));
                buku.setmPenulisRifqie(rs.getString("penulis"));

                listBuku1841720065Rifqie.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listBuku1841720065Rifqie;
    }

    public ArrayList<Buku1841720065Rifqie> searchRifqie(String keyword) {
        ArrayList<Buku1841720065Rifqie> listBuku1841720065Rifqie = new ArrayList<>();

        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("Select "
                + "    b.idBuku as idbuku,"
                + "    b.judul as judul,"
                + "    b.penerbit as penerbit,"
                + "    b.penulis as penulis,"
                + "    k.idkategori as idkategori,"
                + "    k.nama as nama,"
                + "    k.keterangan as keterangan "
                + "    FROM buku b "
                + "    left join kategori k on b.idkategori = k.idkategori "
                + "    where b.judul like '%" + keyword + "%' "
                + "    OR b.penerbit like '%" + keyword + "%' "
                + "    OR b.penulis LIKE '%" + keyword + "%' ");
        try {
            while (rs.next()) {
                Buku1841720065Rifqie buku = new Buku1841720065Rifqie();
                buku.setmIdBukuRifqie(rs.getInt("idbuku"));
                buku.getmKategoriRifqie().setmIdkategoriRifqie(rs.getInt("idkategori"));
                buku.getmKategoriRifqie().setmNamaRifqie(rs.getString("nama"));
                buku.getmKategoriRifqie().setmKeteranganRifqie(rs.getString("keterangan"));
                buku.setmJudulRifqie(rs.getString("judul"));
                buku.setmPenerbitRifqie(rs.getString("penerbit"));
                buku.setmPenerbitRifqie(rs.getString("penulis"));

                listBuku1841720065Rifqie.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBuku1841720065Rifqie;
    }

    public void saveRifqie() {
        if (getByIdRifqie(mIdBuku).getmIdBukuRifqie()== 0) {
            String SQL = "INSERT INTO buku (idkategori, judul, penulis, penerbit) VALUES("
                    + " '" + this.getmKategoriRifqie().getmIdkategoriRifqie() + "', "
                    + " '" + this.mJudul + "', "
                    + " '" + this.mPenulis + "', "
                    + " '" + this.mPenerbit + "' "
                    + " )";
            this.mIdBuku = DBHelper1841720065Rifqie.insertQueryGetIdRifqie(SQL);
        } else {
            String SQL = "UPDATE buku set "
                    + " idkategori = '" + this.getmKategoriRifqie().getmIdkategoriRifqie() + "', "
                    + " judul = '" + this.mJudul + "', "
                    + " penulis = '" + this.mPenulis + "', "
                    + " penerbit = '" + this.mPenerbit + "' "
                    + " WHERE idbuku = '" + this.mIdBuku + "'";
            DBHelper1841720065Rifqie.executeQueryRifqie(SQL);
        }
    }

    public void deleteRifqie() {
        String SQL = "DELETE FROM buku where idbuku = '" + this.mIdBuku + "'";
        DBHelper1841720065Rifqie.executeQueryRifqie(SQL);
    }
}
