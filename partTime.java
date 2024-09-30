package Person;

public class partTime extends teacher {
    private int houseworked;

    public int getHouseworked() {
        return this.houseworked;
    }

    public void setHouseworked(int houseworked) {
        this.houseworked = houseworked;
    }

    public partTime() {
        super();
        houseworked = 0;
    }

    public partTime(String name, int age, String subject, int houseworked) {
        super(name, age, subject);
        this.houseworked = houseworked;
    }

    public int setSalary() {
        int salary = houseworked * 30000;
        return salary;
    }

    public void print() {
        super.print();
        System.out.println("Salary: "+ setSalary());
    }
}
