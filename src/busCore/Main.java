package busCore;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Admin[] admins = new Admin[10];
        admins[0]= new Admin("admin","admin");
        Passenger[] passengers = new Passenger[10];
        passengers[0]= new Passenger("user","user");
        Bus[] buses = new Bus[10];
        buses[0]= new Bus(01,"Tagamo3","Dahab",729,"2:15 PM //8:00 PM ",4,20);
        buses[1]= new Bus(02,"Tagamo3","Sa7el",258,"3:15 PM //9:00 PM ",3,10);

        Scanner input2 = new Scanner(System.in);
        int inn = 3;
        while(inn != -1){
            if (!User.logged) {
                System.out.println("Press 1 to Login using admin or 2 to login using Passenger");
                inn = input2.nextInt();

                if (inn == 1) {
                    User.login(admins);

                }else if(inn == 2){

                    if (Passenger.passengerCount == 0){
                        System.out.println("No Passengers");
                    }else {
                        User.login(passengers);
                        if(User.logged & inn == 2){
                            System.out.println("Press 1 to book a ride, 2 to cancel or update, 3 to view tickets");
                            int innn=input2.nextInt();
                            if(innn==1){
                                System.out.println("Pick the ride you want to book ");
                                int counter = 1;
                                for(int i=0;i<buses.length;i++){
                                    if(buses[i]!=null)
                                        System.out.println(counter + ") " +buses[i]);
                                    counter++;
                                }
                            }
                        }
                        else{
                            System.out.println("wrong input");
                        }
                    }

                }else{
                    System.out.println("wrong input");
                }
            }else if(User.logged & inn == 1){

                System.out.println("Press 1 to Manage Admins or 2 to manage buses or 0 to logout");
                inn = input2.nextInt();
                if (inn == 1) {
                    System.out.println("Press 1 to Manage Admins or 2 to add Admins");
                    inn = input2.nextInt();
                    if (inn ==1){
                        int counter = 0;
                        for (int i = 0; i<admins.length; i++){
                            if (admins[i] != null){
                                counter++;
                                System.out.println(counter + ") " +admins[i]);
                            }
                        }
                        System.out.println("Choose the Account to be managed");
                        inn = input2.nextInt();
                        Admin.manageA(admins[inn-1]);
                    }else if(inn == 2){
                        Admin.addA(admins);
                        System.out.println(Admin.adminCount-1);
                        System.out.println("Added " + admins[Admin.adminCount-1]);
                    };


                }
                else if(inn == 2){
                    int counter = 1;
                    for(int i=0;i<buses.length;i++){
                        if(buses[i]!=null)
                        System.out.println(counter + ") " +buses[i]);
                        counter++;
                    }
                    System.out.println("Input 1 to add Bus, 2 to Remove Bus, 3 to Update Bus");
                    inn = input2.nextInt();
                    if (inn == 1) {
                        Admin.createBusUpdate(buses);
                        System.out.println(Bus.busCount-1);
                        System.out.println("Added " + buses[Bus.busCount-1]);
                    }
                    else if (inn==2){
                        System.out.println("Please enter the bus number that you want to delete. ");
                        inn=input2.nextInt();
                        Admin.deleteBus(buses,inn-1);
                    }
                    else if(inn==3){
                        System.out.println("Please enter the bus number that you want to edit. ");
                        inn=input2.nextInt();
                        Admin.createBusUpdate(buses,inn-1);
                        System.out.println(Bus.busCount-1);
                        System.out.println("Edited Bus Number "+ inn );
                    }
                    else {
                        System.out.println("Wrong Input");
                }

                }else if(inn == 0){User.logout();}


        }

    }

}
}
