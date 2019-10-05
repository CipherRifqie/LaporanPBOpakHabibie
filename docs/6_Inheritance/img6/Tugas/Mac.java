/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancetugas;

public class Mac extends Laptop{
    protected String security;
    
    public Mac(){
    
    }
    
    public Mac(String merk, int sizeMemory,String jnsProsesor,String jnsBaterai,String security){
        this.merk=merk;
        this.jnsProsesor=jnsProsesor;
        this.sizeMemory=sizeMemory;
        this.security=security;
    }
    
    public void tampilMac(){
    System.out.println("Merk                    ="+merk);
    System.out.println("Jenis Prosesor          ="+jnsProsesor);
    System.out.println("Size Memory             ="+sizeMemory);
    System.out.println("Security                ="+security);
    }
    
}
