package busCore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Admin[] admins = new Admin[10];
        admins[0]= new Admin("admin","admin");
        Passenger[] passengers = new Passenger[10];
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
                    }

                }else{
                    System.out.println("wrong input");
                }
            }else if(User.logged){
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


                }else if(inn == 0){User.logout();}

            else{
                    System.out.println("wrong input");


            }



        }



    }


}}
