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
public class InheritanceTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Komputer K = new Komputer();
        K.merk="Vivin";
        K.jnsProsesor="Lasd";
        K.kecProsesor=25;
        K.sizeMemory=12;
        K.tampilData();
        
        System.out.println("--------------------------------------------------------------------");
        
        Laptop L = new Laptop();
        L.merk="Vovon";
        L.jnsBaterai="rtt";
        L.jnsProsesor="Lolo";
        L.sizeMemory=10;
        L.tampilLaptop();
        
        System.out.println("--------------------------------------------------------------------");
        
        Mac M = new Mac();
        M.merk="Loew";
        M.jnsProsesor="ewes";
        M.sizeMemory=21;
        M.security="asdsd";
        M.tampilMac();
        
        System.out.println("--------------------------------------------------------------------");
        
        Pc P = new Pc();
        P.merk="sase";
        P.jnsProsesor="sdawe";
        P.kecProsesor=10;
        P.ukuranMonitor=19;
        P.tampilPc();
        
        System.out.println("--------------------------------------------------------------------");
        
        Windows W = new Windows();
        W.merk="Lolp";
        W.jnsBaterai="asdawe";
        W.kecProsesor=10;
        W.sizeMemory=21;
        W.kecProsesor=13;
        W.fitur="asdaaaaaaa";
        W.tampilWindows();
       
    }   
}