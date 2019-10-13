/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Segitiga1841720065Rifqie{
    private int Msudut;
    
    public int totalSudut1841720065Rifqie(int MsudutA){
        System.out.println(Msudut= 180 - MsudutA);
        return Msudut;
    }
    public int totalSudut1841720065Rifqie(int MsudutA, int MsudutB){
        System.out.println(Msudut = 180-(MsudutA+MsudutB));
        return Msudut;
    }
    public int keliling1841720065Rifqie(int MsisiA, int MsisiB, int MsisiC){
        System.out.println(Msudut =MsisiA + MsisiB + MsisiC);
        return Msudut;
    }
    public double keliling1841720065Rifqie(int MsisiA, int MsisiB){
        double Mc = Math.sqrt( Math.pow(MsisiA,2) + Math.pow(MsisiB,2) );
        System.out.println(Mc);
        return Mc;
    }
    
    
    public static void main(String[] args) {
        Segitiga1841720065Rifqie S = new Segitiga1841720065Rifqie();
        
        S.totalSudut1841720065Rifqie(30);
        S.totalSudut1841720065Rifqie(20, 30);
        S.keliling1841720065Rifqie(60, 40);
        S.keliling1841720065Rifqie(20, 30, 40);
    }
}
