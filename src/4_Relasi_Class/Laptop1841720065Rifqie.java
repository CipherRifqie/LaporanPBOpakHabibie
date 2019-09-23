public class Laptop1841720065Rifqie {
    private String merk;
    private Processor1841720065Rifqie proc;

    public Laptop1841720065Rifqie() {
    }

    public Laptop1841720065Rifqie(String merk, Processor1841720065Rifqie proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerk1841720065Rifqie() {
        return merk;
    }

    public void setMerk1841720065Rifqie(String merk) {
        this.merk = merk;
    }

    public Processor1841720065Rifqie getProc1841720065Rifqie() {
        return proc;
    }

    public void setProc1841720065Rifqie(Processor1841720065Rifqie proc) {
        this.proc = proc;
    }

    public void info1841720065Rifqie(){
        System.out.printf("Merk Laptop = " +merk);
        proc.info1841720065Rifqie();
    }
}