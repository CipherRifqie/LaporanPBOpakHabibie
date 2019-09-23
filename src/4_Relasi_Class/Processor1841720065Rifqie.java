public class Processor1841720065Rifqie{
    private String merk;
    private double cache;

    public Processor1841720065Rifqie() {
    }

    public Processor1841720065Rifqie(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public String getMerk1841720065Rifqie() {
        return merk;
    }

    public void setMerk1841720065Rifqie(String merk) {
        this.merk = merk;
    }

    public double getCache1841720065Rifqie() {
        return cache;
    }

    public void setCache1841720065Rifqie(double cache) {
        this.cache = cache;
    }
   
    public void info1841720065Rifqie(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
    
}