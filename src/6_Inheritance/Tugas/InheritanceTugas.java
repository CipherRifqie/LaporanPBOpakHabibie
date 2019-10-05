/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetugas;

/**
 *
 * @author Dell
 */
public class InheritanceTugas{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Komputer1841720065Rifqie K = new Komputer1841720065Rifqie();
        K.mMerk="Vivin";
        K.mjnsProsesor="Lasd";
        K.mkecProsesor=25;
        K.msizeMemory=12;
        K.tampilData1841720065Rifqie();
        
        System.out.println("--------------------------------------------------------------------");
        
        Laptop1841720065Rifqie L = new Laptop1841720065Rifqie();
        L.mMerk="Vovon";
        L.mjnsBaterai="rtt";
        L.mjnsProsesor="Lolo";
        L.msizeMemory=10;
        L.tampilLaptop1841720065Rifqie();
        
        System.out.println("--------------------------------------------------------------------");
        
        Mac1841720065Rifqie M = new Mac1841720065Rifqie();
        M.mMerk="Loew";
        M.mjnsProsesor="ewes";
        M.msizeMemory=21;
        M.msecurity="asdsd";
        M.tampilMac1841720065Rifqie();
        
        System.out.println("--------------------------------------------------------------------");
        
        Pc1841720065Rifqie P = new Pc1841720065Rifqie();
        P.mMerk="sase";
        P.mjnsProsesor="sdawe";
        P.mkecProsesor=10;
        P.mukuranMonitor=19;
        P.tampilPc1841720065Rifqie();
        
        System.out.println("--------------------------------------------------------------------");
        
        Windows1841720065Rifqie W = new Windows1841720065Rifqie();
        W.mMerk="Lolp";
        W.mjnsBaterai="asdawe";
        W.mkecProsesor=10;
        W.msizeMemory=21;
        W.mkecProsesor=13;
        W.mfitur="asdaaaaaaa";
        W.tampilWindows1841720065Rifqie();
       
    }   
}