public class VelocityMobil1841720065Rifqie {
    private double Acceleration;
    private int TopSpeed;

    public VelocityMobil1841720065Rifqie() {
    }

    public VelocityMobil1841720065Rifqie(double Acceleration, int TopSpeed) {
        this.Acceleration = Acceleration;
        this.TopSpeed = TopSpeed;
    }

    public double getAcceleration() {
        return Acceleration;
    }

    public void setAcceleration(double Acceleration) {
        this.Acceleration = Acceleration;
    }

    public int getTopSpeed() {
        return TopSpeed;
    }

    public void setTopSpeed(int TopSpeed) {
        this.TopSpeed = TopSpeed;
    }
    
    public void info1841720065Rifqie(){
        System.out.printf("Akselerasi mulai dari kecepatan 0-60 mph = %s\n", Acceleration +"detik");
        System.out.printf("Kecepatan Maksimum = %s\n", TopSpeed +"mph");
    }
}