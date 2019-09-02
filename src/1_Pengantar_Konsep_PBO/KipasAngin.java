public class KipasAngin {
    private String merek;
    private String modePutar;
    private int gear;
    private int waktu;
    private String warna;
 
   public void setMerek(String newValue){
       merek = newValue;
   }
   public void Mode(String newValue){
       modePutar = newValue;
   }
   public void gantiGear(int newValue){
       gear = newValue;
   }
   public void aturWaktu(int newValue){
       waktu = newValue;
   }
   public void setWarna (String newValue){
       warna = newValue;
   }
   public void cetakStatus(){
       System.out.println("Merek : " +merek);
       System.out.println("Mode putar : " +modePutar);
       System.out.println("Gear : " +gear);
       System.out.println("Atur waktu (dalam hitungan menit) : " +waktu);
       System.out.println("Warna : " +warna);
   }
}