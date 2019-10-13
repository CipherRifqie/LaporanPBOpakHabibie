public class Utama1841720065Rifqie {
    public static void main(String[] args) {
        System.out.println("Beta Test Class Manager & Staff: ");
        Manager1841720065Rifqie man[] = new Manager1841720065Rifqie[2];
        Staff1841720065Rifqie staff1[] = new Staff1841720065Rifqie[2];
        Staff1841720065Rifqie staff2[] = new Staff1841720065Rifqie[3];
        
        //making some managers
        
        man[0]=new Manager1841720065Rifqie();
        man[0].setNama1841720065Rifqie("Wiro Sableng");
        man[0].setNip1841720065Rifqie("212");
        man[0].setGolongan1841720065Rifqie("1");
        man[0].setTunjangan1841720065Rifqie(5000000);
        man[0].setBagian1841720065Rifqie("Administrator");
        
        man[1]=new Manager1841720065Rifqie();
        man[1].setNama1841720065Rifqie("Rey Mysterio");
        man[1].setNip1841720065Rifqie("619");
        man[1].setGolongan1841720065Rifqie("1");
        man[1].setTunjangan1841720065Rifqie(2500000);
        man[1].setBagian1841720065Rifqie("Marketing");
        
        staff1[0]=new Staff1841720065Rifqie();
        staff1[0].setNama1841720065Rifqie("Steve Austin");
        staff1[0].setNip1841720065Rifqie("316");
        staff1[0].setGolongan1841720065Rifqie("2");
        staff1[0].setLembur1841720065Rifqie(10);
        staff1[0].setGajiLembur1841720065Rifqie(10000);
        
        staff1[1]=new Staff1841720065Rifqie();
        staff1[1].setNama1841720065Rifqie("AJ Styles");
        staff1[1].setNip1841720065Rifqie("450");
        staff1[1].setGolongan1841720065Rifqie("2");
        staff1[1].setLembur1841720065Rifqie(10);
        staff1[1].setGajiLembur1841720065Rifqie(55000);
        man[0].setSt1841720065Rifqie(staff1);
        
        staff2[0]=new Staff1841720065Rifqie();
        staff2[0].setNama1841720065Rifqie("Kofi Kingston");
        staff2[0].setNip1841720065Rifqie("505");
        staff2[0].setGolongan1841720065Rifqie("3");
        staff2[0].setLembur1841720065Rifqie(15);
        staff2[0].setGajiLembur1841720065Rifqie(5500);
        
        staff2[1]=new Staff1841720065Rifqie();
        staff2[1].setNama1841720065Rifqie("Daniel Bryan");
        staff2[1].setNip1841720065Rifqie("559");
        staff2[1].setGolongan1841720065Rifqie("4");
        staff2[1].setLembur1841720065Rifqie(5);
        staff2[1].setGajiLembur1841720065Rifqie(100000);
        
        staff2[2]=new Staff1841720065Rifqie();
        staff2[2].setNama1841720065Rifqie("Serj Tankian");
        staff2[2].setNip1841720065Rifqie("238");
        staff2[2].setGolongan1841720065Rifqie("3");
        staff2[2].setLembur1841720065Rifqie(6);
        staff2[2].setGajiLembur1841720065Rifqie(20000);
        man[1].setSt1841720065Rifqie(staff2);
        
        //print out the informations from manager and staff
        
        man[0].lihatInfo1841720065Rifqie();
        man[1].lihatInfo1841720065Rifqie();
    }
}