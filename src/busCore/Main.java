package busCore;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Admin[] admins = new Admin[1000];
        admins[0]= new Admin("admin","admin");
        Passenger[] passengers = new Passenger[1000];
        passengers[0]= new Passenger("user","user");
        Bus[] buses = new Bus[1000];
        buses[0]= new Bus(01,"Tagamo3","Dahab",729,"2:15 PM //8:00 PM ",4,12);
        buses[1]= new Bus(02,"Tagamo3","Sa7el",258,"3:15 PM //9:00 PM ",3,10);
        Scanner input2 = new Scanner(System.in);
        Scanner inputuser = new Scanner(System.in);
        int seat=0;
        int inn = 3;
        int increment=0;
        while(inn != -1){
            if (!User.logged) {
                System.out.println("Press 1 to Login using admin or 2 to login using Passenger, 3 to sign up as a passenger");
                inn = input2.nextInt();

                if (inn == 1) {
                    Admin.setLoggedadmin(User.login(admins));
                }else if(inn == 2){
                    Admin.setLoggedadmin(false);


                    if (Passenger.passengerCount == 0){
                        System.out.println("No Passengers");
                    }
                    else {

                        Admin.setLoggedadmin(false);
                        Passenger.setLoggedpassenger(User.login(passengers));
                        if(Passenger.loggedpassenger) {
                            int innn=5;
                            do{
                                System.out.println("Press 1 to book a ride, 2 to cancel, 3 to view tickets, 4 to manage account, or 0 to log out");
                                innn = inputuser.nextInt();

                                if (innn == 1) {

                                    System.out.println("Pick the ride you want to book ");
                                    int counter = 0;

                                    for (int i = 0; i < buses.length; i++) {

                                        if (buses[i] != null)

                                            if (buses[i].getPassengersNo() != Bus.maxseats) {
                                                counter++;
                                                System.out.println(counter + ") " + buses[i]);

                                            }
                                    }
                                    System.out.println("Input the Bus Number you want to Book ");

                                    int check=counter+1;
                                    int run=0;
                                    Scanner input_seat = new Scanner(System.in);
                                    do  {
                                        int busno = inputuser.nextInt();

                                        System.out.println("Enter your seat number");
                                        seat=input_seat.nextInt();
                                        if (seat <= 20&&seat>0) {
                                            passengers[Passenger.index].addticket(seat,busno);

                                        }else{
                                            System.out.println("Wrong Seat Number");
                                        }
                                        run++;
                                    }while(innn > check);

                                }
                                else if(innn==2 ){
                                    int counter = 1;
                                    for(int i=0;i<passengers[Passenger.index].Tickets.length;i++){
                                        if(passengers[Passenger.index].Tickets[i]!=null){
                                            System.out.println(counter + ") " +passengers[Passenger.index].Tickets[i]);
                                            counter++;

                                        }


                                    }

                                    System.out.println("Choose the ride you want to cancel");
                                    Scanner user_cancel = new Scanner(System.in);
                                    int cancel_input=user_cancel.nextInt();
                                    if (cancel_input > passengers[Passenger.index].Tickets.length) {
                                        System.out.println("Wrong Input");
                                    }else{
                                        int cancel = cancel_input - 1;
                                        passengers[Passenger.index].Tickets[cancel] = null;
                                    }



                                }
                                else if(innn==3){
                                    int counter = 1;
                                    for(int i=0;i<passengers[Passenger.index].Tickets.length;i++){
                                        if(passengers[Passenger.index].Tickets[i]!=null){
                                            System.out.println(counter + ") " +passengers[Passenger.index].Tickets[i]);
                                            counter++;

                                        }

                                }}
                                else if (innn == 4) {
                                    Scanner user_manage = new Scanner(System.in);
                                    System.out.println("Enter 1 to change your username or 2 to change your password.");
                                    int choice = user_manage.nextInt();
                                    user_manage.nextLine();
                                    if (choice == 1) {
                                        System.out.println("Please enter your new username");
                                        String new_user = user_manage.nextLine();
                                        passengers[Passenger.index].setUsername(new_user);
                                        System.out.println("Username Changed");

                                    } else if (choice == 2) {
                                        System.out.println("Please enter your new password");
                                        String new_pass = user_manage.nextLine();
                                        passengers[Passenger.index].setPassword(new_pass);
                                        System.out.println("Password Changed");

                                    } else
                                        System.out.println("You entered wrong input.");
                                }else if(innn==0){
                                    Passenger.setLoggedpassenger(false);
                                    User.logout();
                                }

                            }while(innn!=0);
                        } else{
                            System.out.println("wrong input");
                        }

                    }

                }
                else if(inn==3){
                    System.out.println("Please enter your desired username !");
                    Scanner inputString =new Scanner(System.in);
                    String username=inputString.nextLine();
                    System.out.println("Please enter your desired password !");
                    String password=inputString.nextLine();
                    passengers[Passenger.passengerCount]=new Passenger(username,password);
                    System.out.println("Created account");
                    Admin.setLoggedadmin(false);
                }
                else{
                    System.out.println("wrong input");
                }
            }
            if(Admin.loggedadmin){

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
