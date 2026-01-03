package airline;

public class Booking {
    private Flight flight;
    private Passenger passenger;
    private String seat;

    public Booking(Flight flight, Passenger passenger, String seat) {
        this.flight = flight;
        this.passenger = passenger;
        this.seat = seat;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void printBooking() {
        System.out.println(passenger);
        System.out.println(flight);
        System.out.println("Seat: " + seat);
        System.out.println("Ticket price: $" + passenger.getTicketPrice());
        System.out.println("-------------------------");
    }
}
