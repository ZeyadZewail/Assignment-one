package busCore;

public class Bus {
    private int id;
    private String origin;
    private String destination;
    private float distance;
    private String runningTimes;
    private float fare;
    private int passengersNo;

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

    public Bus(int id, String origin, String destination, float distance, String runningTimes, float fare) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.runningTimes = runningTimes;
        this.fare = fare;
        this.passengersNo = 0;
    }



}
