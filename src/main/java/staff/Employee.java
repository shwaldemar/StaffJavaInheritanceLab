package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    //Class Methods below here

    //RAISE SALARY FUNCTION
    public void raiseSalary(int raise) {
        if (raise > 0) {
            salary = this.salary + raise;
        }
    }

    //PAY BONUS FUNCTION
    public double payBonus() {
        return this.salary * 0.01;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getNinumber() {
        return niNumber;
    }

    public void setNinumber(String ninumber) {
        this.niNumber = ninumber;
    }

    public int getSalary() {
        return salary;
    }

}
