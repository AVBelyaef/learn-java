public class Employee extends Person implements Printable, SeasonHandler {
    private int salary;
    public String company;

    public Employee(String name, String birthday, String company, int salary) {
        super(name, birthday);
        this.company = company;
        this.salary = salary;
    }

    public String changeCompany(String newCompany) {
        return this.company = newCompany;
    }

    public int getSalary() {
        return salary - (salary / 100 * 13);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Company: " + this.company + "; Name: " + this.getName());
    }

    @Override
    public String getColorOfSeason() {
        return "Сейчас время года - " + Season.SPRING + "\nЦвет сезона - " + Season.SUMMER.getColor();
    }
}

