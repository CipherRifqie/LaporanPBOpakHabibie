/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasInterface;

/**
 *
 * @author Dell
 */
public class Info {
    protected String nama;
    protected boolean pindahgigi1 = true;
    protected boolean pindahgigi2 = false;
    protected boolean ugalugalan1 = true;
    protected boolean ugalugala2 = false;
    protected boolean tekanantinggi1 = true;
    protected boolean tekanantinggi2 = false;
    
    public Info(String nama){
        this.nama=nama;
    }
    public void inFore(){
        System.out.println("Aku Ojol, namaku "+this.nama);
    }
}
