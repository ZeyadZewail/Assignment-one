package busCore;

import java.util.*;

public class Admin extends User{
    Scanner input = new Scanner(System.in);

    public static int  adminCount=0;

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



    public float calcFare(Bus x){
        if (logged) {
            return x.getDistance() * x.getFare();
        }
        else{
            System.out.println("Not Logged in");
            return -1;
        }
    }

    public float calcTotalFare(Bus x) {
        if (logged) {
            return x.getFare() * x.getDistance() * x.getPassengersNo();
        }
        else{
            System.out.println("Not Logged in");
            return -1;
        }
    }

    public void createAdmin(String Username,String Password){
        if (logged) {

        }
        else{
            System.out.println("Not Logged in");
        }


    }

    public void delete(){

        setUsername("Deleted");
        setPassword(null);

    }

public static void addA(Admin[] a){
    Scanner input = new Scanner(System.in);
    System.out.println("Username:");
    String U = input.nextLine();
    System.out.println("Password:");
    String P = input.nextLine();
    a[adminCount]= new Admin(U,P);
}



    public static void manageA(Admin a){
        Scanner input = new Scanner(System.in);
        if (logged) {
            System.out.println("Managing " + a);
            System.out.println("Press p to change password, d to delete");
            char in = input.next().charAt(0);
            input.nextLine();
            if (in == 'p'){
                System.out.println("New Password:");
                String in2 = input.nextLine();
                a.setPassword(in2);
                System.out.println("Password has been changed");
            }else if (in == 'd'){
                System.out.println("Confirm? Y/N");
                in = input.next().charAt(0);
                if (in == 'Y' || in == 'y'){
                    a.delete();
                }else{
                    System.out.println("Wrong Input");
                }

            }else{
                System.out.println("Wrong Input");
            }

        }
        else{
            System.out.println("Not Logged in");
        }
    }




}
