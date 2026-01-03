package airline;

public class AdultPassenger extends Passenger {

    public AdultPassenger(String name, String passportNumber) {
        super(name, passportNumber);
    }

    @Override
    public double getTicketPrice() {
        return 100.0;
    }
}
