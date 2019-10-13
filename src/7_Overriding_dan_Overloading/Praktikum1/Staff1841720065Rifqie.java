public class Staff1841720065Rifqie extends Karyawan1841720065Rifqie{
    private int Mlembur;
    private double MgajiLembur;

    public int getLembur1841720065Rifqie() {
        return Mlembur;
    }

    public void setLembur1841720065Rifqie(int Mlembur) {
        this.Mlembur = Mlembur;
    }

    public double getGajiLembur1841720065Rifqie() {
        return MgajiLembur;
    }

    public void setGajiLembur1841720065Rifqie(double MgajiLembur) {
        this.MgajiLembur = MgajiLembur;
    }

    public double getGaji1841720065Rifqie(int Mlembur, double MgajiLembur) {
        return super.getGaji1841720065Rifqie() + Mlembur*MgajiLembur;
    }

    public double getGaji1841720065Rifqie() {
        return super.getGaji1841720065Rifqie() + Mlembur*MgajiLembur;
    }
    public void lihatInfo1841720065Rifqie(){
        System.out.println("NIP : " +this.getNip1841720065Rifqie());
        System.out.println("Nama : " +this.getNama1841720065Rifqie());
        System.out.println("Golongan : " +this.getGolongan1841720065Rifqie());
        System.out.println("Jumlah Lembur : " +this.getLembur1841720065Rifqie());
        System.out.printf("Gaji Lembur :%.0f\n",this.getGajiLembur1841720065Rifqie());
        System.out.printf("Gaji :%.0f\n", this.getGaji1841720065Rifqie());
    }
}