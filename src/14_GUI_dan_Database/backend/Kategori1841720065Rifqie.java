package backend;
import java.util.ArrayList;
import java.sql.*;
public class Kategori1841720065Rifqie {
    private int idkategori;
    private String nama;
    private String keterangan;

    public int getIdkategoriRifqie() {
        return idkategori;
    }

    public void setIdkategoriRifqie(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNamaRifqie() {
        return nama;
    }

    public void setNamaRifqie(String nama) {
        this.nama = nama;
    }

    public String getKeteranganRifqie() {
        return keterangan;
    }

    public void setKeteranganRifqie(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1841720065Rifqie() {
    }

    public Kategori1841720065Rifqie(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public Kategori1841720065Rifqie getByIdRifqie(int id){
        Kategori1841720065Rifqie kat = new Kategori1841720065Rifqie();
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT * FROM kategori " 
                                            + " WHERE idkategori = '" + id + "'");
    
    try
    {
        while(rs.next())
        {
            kat = new Kategori1841720065Rifqie();
            kat.setIdkategoriRifqie(rs.getInt("idkategori"));
            kat.setNamaRifqie(rs.getString("nama"));
            kat.setKeteranganRifqie(rs.getString("keterangan"));
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return kat;
}
    public ArrayList<Kategori1841720065Rifqie> getAllRifqie(){
        ArrayList<Kategori1841720065Rifqie> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie("SELECT * FROM kategori");
    
    try
    {
        while(rs.next())
        {
            Kategori1841720065Rifqie kat = new Kategori1841720065Rifqie();
            kat.setIdkategoriRifqie(rs.getInt("idkategori"));
            kat.setNamaRifqie(rs.getString("nama"));
            kat.setKeteranganRifqie(rs.getString("keterangan"));
            
            ListKategori.add(kat);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return ListKategori;
}
    public ArrayList<Kategori1841720065Rifqie> searchRifqie(String keyword){
        ArrayList<Kategori1841720065Rifqie> ListKategori = new ArrayList();
        
        String sql = "SELECT * FROM kategori WHERE "
                + "     nama LIKE '%" + keyword + "%' "
                + "     OR keterangan LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720065Rifqie.selectQueryRifqie(sql);
    
    try
    {
        while(rs.next())
        {
            Kategori1841720065Rifqie kat = new Kategori1841720065Rifqie ();
            kat.setIdkategoriRifqie(rs.getInt("idkategori"));
            kat.setNamaRifqie(rs.getString("nama"));
            kat.setKeteranganRifqie(rs.getString("keterangan"));
            
            ListKategori.add(kat);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return ListKategori;
}
    public void saveRifqie(){
        if(getByIdRifqie(idkategori).getIdkategoriRifqie()== 0){
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + "     '" + this.nama + "', "
                    + "     '" + this.keterangan + "' "
                    + "     )";
            this.idkategori = DBHelper1841720065Rifqie.insertQueryGetIdRifqie(SQL);
        }
        else
        {
            String SQL = "UPDATE kategori SET "
                    + "     nama = '" + this.nama + "', "
                    + "     keterangan = '" + this.keterangan + "' "
                    + "     WHERE idkategori = '" + this.idkategori + "'";
            DBHelper1841720065Rifqie.executeQueryRifqie(SQL);
        }
    }
    public void delete()
    {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1841720065Rifqie.executeQueryRifqie(SQL);
    }
}