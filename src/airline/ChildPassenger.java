package airline;

public class ChildPassenger extends Passenger {

    public ChildPassenger(String name, String passportNumber) {
        super(name, passportNumber);
    }

    @Override
    public double getTicketPrice() {
        return 50.0;
    }
}
