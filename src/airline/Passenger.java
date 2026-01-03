package airline;

public abstract class Passenger {
    protected String name;
    protected String passportNumber;

    public Passenger(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public abstract double getTicketPrice();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Passenger{name='" + name + "', passport='" + passportNumber + "'}";
    }
}
