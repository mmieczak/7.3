class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String getFullInfo() {
        return getFirstName() + ", " +
                getLastName() + ", " +
                getAddress().getFullInfo() +
                ", wypłata: " + salary;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "" +
                "wyplata:'" + salary + '\'' +
                '}';
    }
}
