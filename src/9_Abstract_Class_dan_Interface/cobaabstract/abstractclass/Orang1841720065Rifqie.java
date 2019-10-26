/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaabstract.abstractclass;

/**
 *
 * @author Dell
 */
public class Orang1841720065Rifqie {
    private String Mnama;
    private Hewan1841720065Rifqie MhewanPeliharaan;
    
    public Orang1841720065Rifqie(String Mnama){
        this.Mnama=Mnama;
    }
    public void peliharaanHewan1841720065Rifqie(Hewan1841720065Rifqie MhewanPeliharaan){
        this.MhewanPeliharaan = MhewanPeliharaan;
    }
    public void ajakPeliharaanJalanjalan1841720065Rifqie(){
        System.out.println("Namaku "+this.Mnama);
        System.out.println("Hewan peliharaanku berjalan dengan cara :");
        this.MhewanPeliharaan.bergerak1841720065Rifqie();
        System.out.println("-------------------------------------------------------");
    }
}
