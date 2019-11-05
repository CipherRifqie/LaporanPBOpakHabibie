public class ElectricityBill1841720065Rifqie implements Payable1841720065Rifqie{
    private int Mkwh;
    private String Mcategory;

    public ElectricityBill1841720065Rifqie(int Mkwh, String Mcategory) {
        this.Mkwh = Mkwh;
        this.Mcategory = Mcategory;
    }

    public int getKwh1841720065Rifqie() {
        return Mkwh;
    }

    public void setKwh1841720065Rifqie(int Mkwh) {
        this.Mkwh = Mkwh;
    }

    public String getCategory1841720065Rifqie() {
        return Mcategory;
    }

    public void setCategory1841720065Rifqie(String Mcategory) {
        this.Mcategory = Mcategory;
    }

    public int getPaymentAmount1841720065Rifqie(){
        return Mkwh*getBasePrice1841720065Rifqie();
    }
    public int getBasePrice1841720065Rifqie(){
        int MbPrice = 0;
        switch(Mcategory){
            case "R-1" : MbPrice = 100;
            break;
            case "R-2" : MbPrice = 200;
            break;
        }
        return MbPrice;
    }
    public String getBillInfo1841720065Rifqie(){
        return "kWH = "+Mkwh+"\n"+
                "Category = " +Mcategory +"("+getBasePrice1841720065Rifqie()+"per kWH)\n";
    }
}