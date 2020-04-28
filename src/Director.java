class Director extends Employee {
    private double bonus;

    public Director(String firstName, String lastName, Address address, double salary) {
        super(firstName, lastName, address, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double totalPayment() {
        return this.bonus + super.getSalary();
    }

    @Override
    public String printInfo() {
        return "Director{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address=" + super.getAddress().getFullInfo() +
                ", salary=" + super.getSalary() +
                ", bonus=" + getBonus() +
                ", totalPayment=" + totalPayment() +
                '}';
    }
}
