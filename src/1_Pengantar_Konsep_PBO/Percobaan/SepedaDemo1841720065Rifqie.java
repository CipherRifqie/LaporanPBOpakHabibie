public class SepedaDemo1841720065Rifqie {
    public static void main(String[] args) {
        //Make an object first
        Sepeda1841720065Rifqie spd1 = new Sepeda1841720065Rifqie();
        Sepeda1841720065Rifqie spd2 = new Sepeda1841720065Rifqie();
        SepedaGunung1841720065Rifqie spd3 = new SepedaGunung1841720065Rifqie();
        
        // Panggil method didalam objek sepeda
        spd1.setMerek("Polygon");
        spd1.tambahKecepatan(15);
        spd1.gantiGear(2);
        spd1.setWarna("Merah");
        spd1.cetakStatus();
        
        spd2.setMerek("United");
        spd2.tambahKecepatan(32);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.setWarna("Biru");
        spd2.cetakStatus();
        
        spd3.setMerek("Kleenex");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.setWarna("Kuning");
        spd3.cetakStatus();
    }
} 