public class Karyawan1841720065Rifqie {
    private String Mnama;
    private String Mnip;
    private String Mgolongan;
    private double Mgaji;

    public void setNama1841720065Rifqie(String Mnama) {
        this.Mnama = Mnama;
    }

    public void setNip1841720065Rifqie(String Mnip) {
        this.Mnip = Mnip;
    }

    public void setGolongan1841720065Rifqie(String Mgolongan) {
        this.Mgolongan = Mgolongan;
    
    switch(Mgolongan.charAt(0)){
        case '1':this.Mgaji=5000000;
            break;
        case '2':this.Mgaji=3000000;
            break;
        case '3':this.Mgaji=2000000;
            break;
        case '4':this.Mgaji=1000000;
            break;
        case '5':this.Mgaji=750000;
            break;
    }
  }
    public void setGaji1841720065Rifqie(double Mgaji) {
        this.Mgaji = Mgaji;
    }

    public String getNama1841720065Rifqie() {
        return Mnama;
    }

    public String getNip1841720065Rifqie() {
        return Mnip;
    }

    public String getGolongan1841720065Rifqie() {
        return Mgolongan;
    }

    public double getGaji1841720065Rifqie() {
        return Mgaji;
    }
}