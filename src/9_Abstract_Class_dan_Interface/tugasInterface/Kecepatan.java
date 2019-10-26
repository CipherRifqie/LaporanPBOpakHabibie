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
public class Kecepatan extends Info implements IData{

    public Kecepatan(String nama) {
        super(nama);
    }
    

    @Override
    public void pindahGigi() {
        if(pindahgigi2 == true){
            System.out.println("Memindah gigi masih Amatir");
        } else {
            System.out.println("Memindah gigi sudah Profesional");
        }
    }

    @Override
    public void putarKemudi() {
        if(ugalugalan1 == true){
            System.out.println("Putar Kemudi masih Amatir");
        } else {
            System.out.println("Putar Kemudi sudah Profesional");
        }
    }

    @Override
    public void injakPedalGas() {
        if(tekanantinggi1 == true){
            System.out.println("Injak gas masih Amatir");
        } else {
            System.out.println("Injak gas sudah Profesional");
        }
    }

    @Override
    public void injakPedalRem() {
        if(tekanantinggi2 == true){
            System.out.println("Injak rem masih Amatir");
        } else {
            System.out.println("Injak rem sudah Profesional");
        }
    }
    
}
