public class Manager1841720065Rifqie extends Karyawan1841720065Rifqie{
    private double Mtunjangan;
    private String Mbagian;
    private Staff1841720065Rifqie Mst[];

    public double getTunjangan1841720065Rifqie() {
        return Mtunjangan;
    }

    public void setTunjangan1841720065Rifqie(double Mtunjangan) {
        this.Mtunjangan = Mtunjangan;
    }

    public String getBagian1841720065Rifqie() {
        return Mbagian;
    }

    public void setBagian1841720065Rifqie(String Mbagian) {
        this.Mbagian = Mbagian;
    }

    public Staff1841720065Rifqie[] getSt1841720065Rifqie() {
        return Mst;
    }

    public void setSt1841720065Rifqie(Staff1841720065Rifqie[] Mst) {
        this.Mst = Mst;
    }
    
    public void viewStaff1841720065Rifqie(){
        int i;
        System.out.println("---------------------------");
        for (int j = 0; j < Mst.length; j++) {
           Mst[j].lihatInfo1841720065Rifqie();    
        }
        System.out.println("----------------------------");
    }
    public void lihatInfo1841720065Rifqie(){
        System.out.println("Manager : " +this.getBagian1841720065Rifqie());
        System.out.println("NIP : " +this.getNip1841720065Rifqie());
        System.out.println("Nama : " +this.getNama1841720065Rifqie());
        System.out.println("Golongan : " +this.getGolongan1841720065Rifqie());
        System.out.printf("Tunjangan :%.0f\n", this.getTunjangan1841720065Rifqie());
        System.out.printf("Gaji :%.0f\n",this.getGaji1841720065Rifqie());
        System.out.println("Bagian : " +this.getBagian1841720065Rifqie());
        this.viewStaff1841720065Rifqie();
    }
    public double getGaji1841720065Rifqie() {
        return super.getGaji1841720065Rifqie() + Mtunjangan;
    }
}