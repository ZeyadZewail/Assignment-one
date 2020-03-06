package busCore;

public class Bus {
    private int id;
    private String origin;
    private String destination;
    private float distance;
    private String runningTimes;
    private float fare;
    private int passengersNo;
    public static int maxseats=20;
    private int seat;


    public static int  busCount=0;

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setRunningTimes(String runningTimes) {
        this.runningTimes = runningTimes;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public void setPassengersNo(int passengersNo) {
        this.passengersNo = passengersNo;
    }

    public int getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public float getDistance() {
        return distance;
    }

    public String getRunningTimes() {
        return runningTimes;
    }

    public float getFare() {
        return fare;
    }

    public int getPassengersNo() {
        return passengersNo;
    }

    public Bus(int id, String origin, String destination, float distance, String runningTimes, float fare,int passengersNo) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.runningTimes = runningTimes;
        this.fare = fare;
        this.passengersNo = passengersNo;
        busCount++;
    }
    public Bus(Bus q){
        this.id = q.id;
        this.origin = q.origin;
        this.destination = q.destination;
        this.distance = q.distance;
        this.runningTimes = q.runningTimes;
        this.fare = q.fare;
        this.passengersNo = q.passengersNo;
    }

    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", passengersNo=" + passengersNo +
                '}';
    }

}
