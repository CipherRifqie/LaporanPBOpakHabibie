public class DiscountedPackage {
    public String code;
    public String nameofPackage;
    public int basicPrice;
    public float discount;
    
    public int afterDiscountedofPackage(int basicPrice, float discount){
       this.basicPrice = basicPrice;
       this.discount = discount;
       int discountedPackage = (int) (basicPrice - (discount*basicPrice));
       return discountedPackage;
    }
    public void tampilData(){
        System.out.println("Kode Barang : " +code);
        System.out.println("Nama Barang : " +nameofPackage);
        System.out.println("Harga Dasar : " +basicPrice);
        System.out.println("Diskon : " +discount +("%"));
    }
}