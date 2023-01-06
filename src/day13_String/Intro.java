package day13_String;
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Select screen size:\n");
        double screenSize = scan.nextDouble();
        scan.nextLine();
        System.out.print("Select CPU type:\n");
        String cpu = scan.next();
        scan.nextLine();
        System.out.println("Select RAM size:");
        int ram = scan.nextInt();
        scan.nextLine();
        System.out.println("Select storage type:");
        String storageType = scan.next();
        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();
        System.out.println("Select screen resolution:");
        String resolution =scan.next();

        double total = 0;


        if(screenSize==13.3){
            total+=200;
        }else if(screenSize==15.0){
            total+=300;
        }else{
            total+=400;
        }
        if(cpu.equals("i3")){
            total+=150;
        }else if(cpu.equals("i5")){
            total+=250;
        }else{
            total+=350;
        }
        if(storageType.equals("HDD")){
            double storageTotal=storageSize/500*50;
            total+=storageTotal;
        }else{
            double storageTot=storageSize/500*100;
            total+=storageTot;
        }
        if(resolution.equals("FULLHD")){
            total+=100;
        }else{
            total+=200;
        }
        int ramTotal = ram/4*50;
        total=total+ramTotal;

        System.out.println("Final price is: $" +total );

    }
}