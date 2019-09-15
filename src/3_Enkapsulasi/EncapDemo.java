public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        if(newAge >30){
            age = 30;
        }
        else{
            age = newAge;
        }
    }
}
/* private String nama;
    private float simpanan;
    private int pinjam;
    private int uang;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public int uang(){
        return uang;
    }
    public int pinjam(){
        return pinjam;
    }
    
    public void getLimitPinjam(int limitUang){
        if(pinjam > 500000 ){
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        }else{
            System.out.println("5000000");
        }
    }
    public void getJumlahPinjaman(int pinjamUang){
        pinjamUang = uang - pinjam;
    }
    */