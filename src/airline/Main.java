package airline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Data pool
        ArrayList<Flight> flights = new ArrayList<>();

        flights.add(new Flight("KC123", "Almaty", "Astana", 180));
        flights.add(new Flight("KC124", "Astana", "Aktau", 150));
        flights.add(new Flight("KC125", "Almaty", "Aktau", 200));

        // Sorting
        flights.sort(Comparator.comparingInt(Flight::getCapacity));

        System.out.println("Sorted flights:");
        for (Flight f : flights) {
            System.out.println(f);
        }

        System.out.println("\nFiltered flights (capacity > 160):");
        for (Flight f : flights) {
            if (f.getCapacity() > 160) {
                System.out.println(f);
            }
        }

        // Passengers (polymorphism)
        Passenger p1 = new AdultPassenger("Aruzhan", "KZ123");
        Passenger p2 = new ChildPassenger("Ali", "KZ456");

        // Booking
        Booking b1 = new Booking(flights.get(0), p1, "12A");
        Booking b2 = new Booking(flights.get(1), p2, "12B");

        b1.printBooking();
        b2.printBooking();

        // equals demonstration
        Flight testFlight = new Flight("KC123", "X", "Y", 0);
        System.out.println("flight equals testFlight: " + flights.get(0).equals(testFlight));
    }
}
