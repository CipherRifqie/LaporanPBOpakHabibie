package backend;

import backend.DBHelper1841720065Rifqie;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota1841720065Rifqie {
    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720065Rifqie() {
    }

    public Anggota1841720065Rifqie(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getmIdAnggotaRifqie() {
        return mIdAnggota;
    }

    public void setmIdAnggotaRifqie(int idAnggota) {
        this.mIdAnggota = idAnggota;
    }

    public String getmNamaRifqie() {
        return mNama;
    }

    public void setmNamaRifqie(String nama) {
        this.mNama = nama;
    }

    public String getmAlamatRifqie() {
        return mAlamat;
    }

    public void setmAlamatRifqie(String alamat) {
        this.mAlamat = alamat;
    }

    public String getmTeleponRifqie() {
        return mTelepon;
    }

    public void setmTeleponRifqie(String telepon) {
        this.mTelepon = telepon;
    }

    public Anggota1841720065Rifqie getByIdRifqie(int id) {
        Anggota1841720065Rifqie agt = new Anggota1841720065Rifqie();
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720065Rifqie();
                agt.setmIdAnggotaRifqie(rs.getInt("idAnggota"));
                agt.setmNamaRifqie(rs.getString("nama"));
                agt.setmAlamatRifqie(rs.getString("alamat"));
                agt.setmTeleponRifqie(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720065Rifqie> getAllRifqie() {
        ArrayList<Anggota1841720065Rifqie> listAnggota1841720065Rifqie = new ArrayList<>();

        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720065Rifqie agt = new Anggota1841720065Rifqie();
                agt.setmIdAnggotaRifqie(rs.getInt("idAnggota"));
                agt.setmNamaRifqie(rs.getString("nama"));
                agt.setmAlamatRifqie(rs.getString("alamat"));
                agt.setmTeleponRifqie(rs.getString("telepon"));

                listAnggota1841720065Rifqie.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAnggota1841720065Rifqie;
    }

    public ArrayList<Anggota1841720065Rifqie> searchRifqie(String keyword) {
        ArrayList<Anggota1841720065Rifqie> listAnggota1841720065Rifqie = new ArrayList<>();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie(sql);

        try {
            while (rs.next()) {
                Anggota1841720065Rifqie agt = new Anggota1841720065Rifqie();
                agt.setmIdAnggotaRifqie(rs.getInt("idAnggota"));
                agt.setmNamaRifqie(rs.getString("nama"));
                agt.setmAlamatRifqie(rs.getString("alamat"));
                agt.setmTeleponRifqie(rs.getString("telepon"));

                listAnggota1841720065Rifqie.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAnggota1841720065Rifqie;
    }

    public void saveRifqie() {
        if (getByIdRifqie(mIdAnggota).getmIdAnggotaRifqie()== 0) {
            String SQL = "Insert into anggota (nama,alamat,telepon) values("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720065Rifqie.insertQueryGetIdRifqie(SQL);
        } else {
            String SQL = "Update anggota set"
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + "Where idAnggota = '" + this.mIdAnggota + "'";
            DBHelper1841720065Rifqie.executeQueryRifqie(SQL);
        }
    }

    public void deleteRifqie() {
        String SQL = "DELETE FROM anggota WHERE idAnggota = '" + this.mIdAnggota + "'";
        DBHelper1841720065Rifqie.executeQueryRifqie(SQL);
    }
}
