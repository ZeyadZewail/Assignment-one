package busCore;

import java.util.Scanner;

public class User {
    protected String username;
    protected String  password;
    static boolean logged =false;
    Scanner input = new Scanner(System.in);
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static void login(User[] users){
        Scanner input = new Scanner(System.in);
        System.out.println("Username:");
        String U = input.nextLine();
        System.out.println("Password:");
        String P = input.nextLine();
        for (int i = 0; i<users.length; i++){
            if (users[i] != null ){
                if (users[i].getUsername().equals(U) & users[i].getPassword().equals(P) ){
                logged = true;
                System.out.println("Logged in!");
            }
            }

        }
        if (!logged){
            System.out.println("Wrong Username or Password");
        }


    }
    public static void logout(){
        System.out.println("Logged out!");
        logged = false;


    }

}
