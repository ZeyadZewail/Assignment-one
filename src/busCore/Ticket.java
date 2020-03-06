package busCore;

public class Ticket {
    public static int count = 0;
    private int id;
    private int passengerID;
    private int seatNo;
    private int busNo;

    public Ticket(int passengerID, int seatNo,int bus_id) {
        count++;
        this.passengerID = passengerID;
        this.seatNo = seatNo;
        this.id = count;
        this.busNo=bus_id;

    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", passengerID=" + passengerID +
                ", seatNo=" + seatNo +
                ", busNo=" + busNo +
                '}';
    }
}
