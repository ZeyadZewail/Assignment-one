package busCore;

public class Ticket {
    public static int count = 0;
    private int id;
    private int passengerID;
    private int BusID;
    private int seatNo;

    public Ticket(int passengerID, int busID, int seatNo) {
        count++;
        this.passengerID = passengerID;
        BusID = busID;
        this.seatNo = seatNo;
        this.id = count;

    }



}
