package busCore;

import java.util.*;

public class Admin extends User {
    Scanner input = new Scanner(System.in);
    public static boolean loggedadmin=false;

    public static int adminCount = 0;

    public Admin(String username, String password) {
        super(username, password);
        adminCount++;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void setLoggedadmin(boolean loggedadmin) {
        Admin.loggedadmin = loggedadmin;
    }

    public float calcFare(Bus x) {
        if (logged) {
            return x.getDistance() * x.getFare();
        } else {
            System.out.println("Not Logged in");
            return -1;
        }
    }

    public float calcTotalFare(Bus x) {
        if (logged) {
            return x.getFare() * x.getDistance() * x.getPassengersNo();
        } else {
            System.out.println("Not Logged in");
            return -1;
        }
    }

    public void createAdmin(String Username, String Password) {
        if (logged) {

        } else {
            System.out.println("Not Logged in");
        }


    }

    public void delete() {

        setUsername("Deleted");
        setPassword(null);

    }

    public static void addA(Admin[] a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Username:");
        String U = input.nextLine();
        System.out.println("Password:");
        String P = input.nextLine();
        a[adminCount] = new Admin(U, P);
    }


    public static void manageA(Admin a) {
        Scanner input = new Scanner(System.in);
        if (logged) {
            System.out.println("Managing " + a);
            System.out.println("Press p to change password, d to delete");
            char in = input.next().charAt(0);
            input.nextLine();
            if (in == 'p') {
                System.out.println("New Password:");
                String in2 = input.nextLine();
                a.setPassword(in2);
                System.out.println("Password has been changed");
            } else if (in == 'd') {
                System.out.println("Confirm? Y/N");
                in = input.next().charAt(0);
                if (in == 'Y' || in == 'y') {
                    a.delete();
                } else {
                    System.out.println("Wrong Input");
                }

            } else {
                System.out.println("Wrong Input");
            }

        } else {
            System.out.println("Not Logged in");
        }
    }

    public static void createBusUpdate(Bus[] b) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bus ID:");
        int ID = input.nextInt();
        input.nextLine();
        System.out.println("Origin Location:");
        String Origin = input.nextLine();
        System.out.println("Destination Location:");
        String Destination = input.nextLine();
        System.out.println("Distance:");
        float Distance = input.nextFloat();
        System.out.println(" Running Times:");
        input.nextLine();
        String running_Time = input.nextLine();
        System.out.println("Fare:");
        float Fare = input.nextFloat();
        System.out.println("Passenger:");
        int passengerNo = input.nextInt();
        b[Bus.busCount] = new Bus(ID, Origin, Destination, Distance, running_Time, Fare,passengerNo);
    }

    public static void deleteBus(Bus[] b, int number) {
        b[number] = null;
        number=number+1;
        System.out.println("Bus Number "+number+" is Deleted.");
    }
    public static void createBusUpdate(Bus[] b,int number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bus ID:");
        int ID = input.nextInt();
        input.nextLine();
        System.out.println("Origin Location:");
        String Origin = input.nextLine();
        System.out.println("Destination Location:");
        String Destination = input.nextLine();
        System.out.println("Distance:");
        float Distance = input.nextFloat();
        System.out.println(" Running Times:");
        input.nextLine();
        String running_Time = input.nextLine();
        System.out.println("Fare:");
        float Fare = input.nextFloat();
        System.out.println("Passenger:");
        int passengerNo = input.nextInt();
        b[number] = new Bus(ID, Origin, Destination, Distance, running_Time, Fare,passengerNo);
    }

}



