class OnlineShop {
    public static void main(String[] args) {

       /* W projekcie z poprzedniego ćwiczenia w klasie reprezentującej osobę zdefiniuj metodę printInfo(),
          która wyświetla wszystkie informacje zapisane w polach obiektu.
          Nadpisz ją w klasach pochodnych. Dodaj adnotację @Override w miejscach gdzie ma to sens.

        *Dodaj u dyrektora metodę totalPayment, która zwraca całkowitą jego wypłatę (podstawa + premia).
        Utwórz obiekt tego typu, ustaw w nim zarówno wypłatę jak i premię i wyświetl na ekranie informacje
        danej osoby oraz całkowitą wypłatę.*/


        Address address = new Address("Wrocław", "Podwale", "62A", "316");
        Customer customer = new Customer("Jan", "Kowalski", address, 5000);
     //  System.out.println(customer.getFullInfo());
        System.out.println(customer.printInfo());

        Director theBoss = new Director("Karol", "Woźniak", address, 70000);
        theBoss.setBonus(30000);
        System.out.println(theBoss.printInfo());


    }
}
