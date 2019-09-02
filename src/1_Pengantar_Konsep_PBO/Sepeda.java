public class Sepeda {
   private String merek;
   private int kecepatan;
   private int gear;
   private String warna;
   
   public void setMerek(String newValue){
       merek = newValue;
   }
   public void gantiGear(int newValue){
       gear = newValue;
   }
   public void tambahKecepatan(int increase){
       kecepatan = kecepatan + increase;
   }
   public void rem(int decrease){
       kecepatan = kecepatan - decrease;
   }
   public void setWarna (String newValue){
       warna = newValue;
   }
   public void cetakStatus(){
       System.out.println("Merek : " +merek);
       System.out.println("Kecepatan : " +kecepatan);
       System.out.println("Gear : " +gear);
       System.out.println("Warna : " +warna);
   }
}