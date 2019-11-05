public class Owner1841720065Rifqie{
    public void pay1841720065Rifqie(Payable1841720065Rifqie Mp){
        System.out.println("total payment = " +Mp.getPaymentAmount1841720065Rifqie());
        if(Mp instanceof ElectricityBill1841720065Rifqie){
            ElectricityBill1841720065Rifqie eb = (ElectricityBill1841720065Rifqie) Mp;
            System.out.println("" +eb.getBillInfo1841720065Rifqie());
        }else if(Mp instanceof PermanentEmployee1841720065Rifqie){
            PermanentEmployee1841720065Rifqie Mpe = (PermanentEmployee1841720065Rifqie) Mp;
            Mpe.getEmployeeInfo1841720065Rifqie();
            System.out.println("" +Mpe.getEmployeeInfo1841720065Rifqie());
        }
    }
    public void showMyEmployee1841720065Rifqie(Employee1841720065Rifqie Me){
        System.out.println(""+Me.getEmployeeInfo1841720065Rifqie());
        if(Me instanceof PermanentEmployee1841720065Rifqie)
            System.out.println("You have to pay immediately, STRANGER!!!");
        else
            System.out.println("Just Go. No need to pay me anymore, STRANGER!");
        }
    }