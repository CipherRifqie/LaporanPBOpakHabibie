/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Perkalianku1841720065Rifqie {
    void perkalian1841720065Rifqie(int Ma, int Mb){
        System.out.println(Ma*Mb);
    }
    void perkalian1841720065Rifqie(int Ma,int Mb, int Mc){ // overloading
        System.out.println(Ma*Mb*Mc);
    }
    public static void main (String args []){
        Perkalianku1841720065Rifqie objek = new Perkalianku1841720065Rifqie();
        
        objek.perkalian1841720065Rifqie(25, 43);
        objek.perkalian1841720065Rifqie(34, 23, 56);
    }
}
