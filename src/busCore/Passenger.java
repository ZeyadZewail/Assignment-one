package busCore;

public class Passenger extends User {
    public static int  passengerCount=0;
    public static boolean loggedpassenger=false;
    public Ticket[] Tickets = new Ticket[1000];
    public int ticketcount = 0;

    public Passenger(String username, String password) {
        super(username, password);
        passengerCount++;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static void setLoggedpassenger(boolean loggedpassenger) {
        Passenger.loggedpassenger = loggedpassenger;
    }

    public void addticket(int seatno,int Bus){
        Ticket X = new Ticket(index,seatno,Bus);
        Tickets[ticketcount]= X;
        ticketcount++;

    }

}
