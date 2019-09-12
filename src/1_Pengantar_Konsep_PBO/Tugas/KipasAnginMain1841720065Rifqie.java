public class KipasAnginMain1841720065Rifqie {
    public static void main(String[] args) {
        //Make an object first
        KipasAnginDinding1841720065Rifqie kps1 = new KipasAnginDinding1841720065Rifqie();
        KipasAnginDinding1841720065Rifqie kps2 = new KipasAnginDinding1841720065Rifqie();
        KipasAnginLantai1841720065Rifqie kps3 = new KipasAnginLantai1841720065Rifqie();
        
        // Panggil method didalam objek kipas angin
        kps1.setMerek("Maspion");
        kps1.Mode("ON");
        kps1.gantiGear(2);
        kps1.aturWaktu(40);
        kps1.setWarna("Abu-abu");
        kps1.Price(200000);
        kps1.cetakStatus();
        
        kps2.setMerek("Cosmos");
        kps2.Mode("OFF");
        kps2.gantiGear(3);
        kps2.aturWaktu(55);
        kps2.setWarna("Hijau");
        kps2.Price(365000);
        kps2.cetakStatus();
        
        kps3.setMerek("Miyako");
        kps3.Mode("OFF");
        kps3.gantiGear(6);
        kps3.aturWaktu(0);
        kps3.setWarna("Putih");
        kps3.Price(1200000);
        kps3.cetakStatus();
    }
}