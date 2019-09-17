package Tugasnomor4sampai6;
public class MemberAnggota1841720065Rifqie{
    private String ktp;
    private String nama;
    private int limitPinjam;
    private int pinjam;
    private int angsur;
    
  MemberAnggota1841720065Rifqie(String ktp, String nama,int limitPinjam ){
        this.nama = nama;
        this.ktp = ktp;
        this.limitPinjam = limitPinjam;
    }
    
    public int getPinjam(int pinjam){
        this.limitPinjam = pinjam;
        return limitPinjam;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getLimitPinjam(){
        return limitPinjam;
    }
    
    public int pinjam(int pinjam1){
        this.pinjam = pinjam1;
        return this.pinjam;   
    }
    
    public int angsur(int angsur1){
        this.angsur = angsur1;
        return this.angsur;   
    }
    
    public int getJumlahPinjam(){
        if( this.pinjam >= 5000000 && pinjam <= 0.1){
            System.out.println("Maaf jumlah pinjaman melebihi limit");
            System.out.println("Maaf Angsuran harus 10% dari jumlah pinjam");
        }else{
            System.out.println(" "+ pinjam);
            pinjam = pinjam - angsur;
            return pinjam;
        }
        return pinjam;
    }    
}
/*private String nama;
    private float simpanan;
    private int pinjam;
    private int uang;
    
    public void getNama(String nama){
        this.nama = nama;
    }
    public int uang(){
        return uang;
    }
    public int pinjam(){
        return pinjam;
    }
    
    public int getLimitPinjam(){
        if(pinjam > 500000 ){
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        }else{
            System.out.println("5000000");
        }
    }
    public void getJumlahPinjaman(int pinjamUang){
        pinjamUang = uang - pinjam;
    }*/