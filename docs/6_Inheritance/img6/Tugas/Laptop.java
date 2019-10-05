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
public class Laptop extends Komputer{
    protected String jnsBaterai;
    
    public Laptop(){
    
    }
    
    public Laptop(String merk, int sizeMemory,String jnsProsesor,String jnsBaterai){
        this.merk=merk;
        this.jnsProsesor=jnsProsesor;
        this.jnsBaterai=jnsBaterai;
        this.sizeMemory=sizeMemory;
    }
    
    public void tampilLaptop(){
    System.out.println("Merk                    ="+merk);
    System.out.println("Jenis Prosesor          ="+jnsProsesor);
    System.out.println("Jenis Baterai           ="+jnsBaterai);
    System.out.println("Size Memory             ="+sizeMemory);
    }
}
