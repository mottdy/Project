
public class Booking {

    private String Name;
    private double hour;
    private char size;

    public Booking(String Name, double hour, char size) {
        this.Name = Name;
        this.hour = hour;
        this.size = size;
    }

    public String getName() {
        return Name;
    }

    public double getHour() {
        return hour;
    }

    public char getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Name : " + Name + "\n" + "Hour : " + hour + "\n" + "Size : " + size;
    }

}
