public class SalaryTeacher extends Teacher{
    private double weeklySalary;

    public SalaryTeacher(String name, String address, double weeklySalary ){
        super(name, address);
        this.weeklySalary = weeklySalary;
    }

    public double getweeklySalary(){
        return this.weeklySalary;
    }
    public void setweeklySalary(){
        if(weeklySalary > 0)
            this.weeklySalary = weeklySalary;
        else
            throw new ExceptionInInitializerError("valor inválido");
    }

    public double calculateWeeklyPay(){
        return weeklySalary;
    }

    public String toString(){
        return super.toString() + ", weeklySalary = "+weeklySalary;
    }
}
