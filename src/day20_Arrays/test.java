package day20_Arrays;
import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int item=1;
            String result="";
            double totalPrice=0;
            while(true){
                System.out.println("Enter the name of item "+item);
                String itemName=scan.next();
                System.out.println("Enter the price of the "+itemName);
                double price=scan.nextDouble();
                System.out.println("How many "+itemName+ " will you buy?");
                int itemNum=scan.nextInt();
                String receipt=itemName+" x "+itemNum+ " - $"+(itemNum*price)+"\n";
                result+=receipt;
                totalPrice+=itemNum*price;
                item++;
                System.out.println("Do you want to add more items to the shopping list?");
                String ans=scan.next();

                if(ans.equalsIgnoreCase("no")){
                    break;
                }
            }
            result=result.substring(0, result.length()-1);
            System.out.println("SHOPPING LIST:");
            System.out.println(result);
            System.out.println("Total cost: $"+totalPrice);







        }
    }

