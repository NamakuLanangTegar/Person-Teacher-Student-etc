package Person;

public class fullTime extends teacher {
    private int anualSalary;
    private String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public fullTime() {
        
        super();
        unit = "Teaching Staff";
        anualSalary = 10000000;
    }

    public fullTime(String name, int age, String subject, int anualSalary, String unit) {
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Anual Salary: "+anualSalary); 
        System.out.println("Unit: "+unit); 
    }

}
