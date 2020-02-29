package busCore;

public class Passenger extends User {
    public static int  passengerCount=0;
    public static int[] rides=new int[10];
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




}
