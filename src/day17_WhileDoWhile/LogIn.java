package day17_WhileDoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name");
        String userName = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        if (userName.equals("Cydeo") && password.equals("Cydeo123")) {//if credentials are valid and correct
            System.out.println("Logged in");
        } else { // if the credentials are not valid
            int attempts = 3;

            while (!(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0) {//while the credentials

                System.err.println("Incorrect username or password, please re - enter");
                if(attempts==1){
                    System.out.println("ThIS IS THE LAST CHANCE");
                }
                System.out.println("Enter your user name");
                userName = scan.next();

                System.out.println("Enter your password");
                password = scan.next();
                attempts--;
            }
                if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
                    System.out.println("Logged in");
                } else {
                    System.out.println("Your account is locked");
                }

            } scan.close();
        }
    }

        //username: "Cydeo"
        //password: "Cydeo123"
