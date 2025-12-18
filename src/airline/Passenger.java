package airline;

public class Passenger {
    private String name;
    private String passportNumber;
    private int age;

    public Passenger(String name, String passportNumber, int age) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Passenger: " + name +
                ", Passport: " + passportNumber +
                ", Age: " + age);
    }
}
