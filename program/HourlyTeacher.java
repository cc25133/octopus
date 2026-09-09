public class HourlyTeacher extends Teacher {
    private double hourlySalary;
    private int hoursWorked = 0;
    private Department departament;

    public HourlyTeacher(String name, String address, double hourlySalary, Department departament){
        super(name, address);
        this.hourlySalary = hourlySalary;
        this.departament = departament;
    }

    public HourlyTeacher(String name, String address, double hourlySalary, Department departament,  int hoursWorked){
        this(name, address, hourlySalary, departament);
        this.hoursWorked = hoursWorked;
    }

    public double getHourlySalary(){
        return this.hourlySalary;
    }

    public void setHourlySalary(double hourlySalary){
        if(hourlySalary >= 0)
            this.hourlySalary = hourlySalary;
        else
            throw new ExceptionInInitializerError("valor inválido");
    }

    public double calculateWeeklyPay(){
        return hoursWorked*hourlySalary;
    }

    public String toString(){
        String message = super.toString() + "hoursWorked = "+hoursWorked+", hourlySalary= "+hourlySalary;
        return message;
    }
}
