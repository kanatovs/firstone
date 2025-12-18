package airline;

public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("KC123", "Almaty", "Astana", 180);
        Flight flight2 = new Flight("KC124", "Almaty", "Astana", 180);
        Flight flight3 = new Flight("KC125", "Almaty", "Astana", 180);

        Passenger passenger1 = new Passenger("Aruzhan", "KZ123456", 19);
        Passenger passenger2 = new Passenger("Dias", "KZ654321", 21);
        Passenger passenger3 = new Passenger("Alimzhan", "KZ65423321", 268);

        Booking booking1 = new Booking(flight1, passenger1, "12A");
        Booking booking2 = new Booking(flight1, passenger2, "12B");
        Booking booking3 = new Booking(flight3, passenger3, "12C");

        booking1.displayBooking();
        System.out.println();
        booking2.displayBooking();
        System.out.println();
        booking3.displayBooking();

        System.out.println("\nComparison:");
        System.out.println("Same flight capacity? " +
                (flight1.getCapacity() == flight2.getCapacity()));

        System.out.println("Same destination? " +
                flight1.getDestination().equals(flight2.getDestination()));
    }
}
