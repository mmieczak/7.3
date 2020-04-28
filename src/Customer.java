class Customer extends Person {
    private double totalPayments;

    public Customer(String firstName, String lastName, Address address, double totalPayments) {
        super(firstName, lastName, address);
        this.totalPayments = totalPayments;
    }

    public double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(double totalPayments) {
        this.totalPayments = totalPayments;
    }

    String getFullInfo() {
        return getFirstName() + ", " +
                getLastName() + ", " +
                getAddress().getFullInfo() +
                ", zakupy na kwotę: " + totalPayments;
    }

    @Override
    public String printInfo() {
        return "Person{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", address=" + super.getAddress().getFullInfo() +
                ", totalPayments=" + getTotalPayments() +
                '}';
    }
}
