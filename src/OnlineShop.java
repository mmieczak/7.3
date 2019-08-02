class OnlineShop {
    public static void main(String[] args) {
        Address address = new Address("Wrocław", "Podwale", "62A", "316");
        Customer customer = new Customer("Jan", "Kowalski", address, 5000);
        System.out.println(customer.getFullInfo());

        Employee employee = new Employee("Karol", "Woźniak", address, 7000);
        System.out.println(employee.getFullInfo());
    }
}
