public class PermanentEmployee1841720065Rifqie extends Employee1841720065Rifqie implements Payable1841720065Rifqie{
    private int Msalary;

    public PermanentEmployee1841720065Rifqie(String Mname, int Msalary) {
        this.Mname = Mname;
        this.Msalary = Msalary;
    }

    public int getSalary1841720065Rifqie() {
        return Msalary;
    }

    public void setSalary1841720065Rifqie(int Msalary) {
        this.Msalary = Msalary;
    }
    @Override
    public int getPaymentAmount1841720065Rifqie(){
        return (int) (Msalary+0.05*Msalary);
    }
    @Override
    public String getEmployeeInfo1841720065Rifqie(){
        String info = super.getEmployeeInfo1841720065Rifqie()+"\n";
        info += "Registered as Permanent Employees with salary "+Msalary+"\n";
        return info;
    }
}