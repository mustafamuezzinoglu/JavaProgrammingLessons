package day23_CustomMethods_void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
//        oddOrEven();  //the method demands additional info to complete its task
        oddOrEven(8);

        ageOfPerson(1977);

        areaOfCircle(8);

        printNumbers(100,200);
    }

//    create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){

        if(number %2 ==0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number +" is odd number");
        }




    }

//create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2022 -birthYear;
        System.out.println("Your age is: "+ age);
    }

//create a function that can calculate the area of circle
    public static void areaOfCircle(double radius){
        double areaOfCircle=3.14*radius*radius;
        System.out.println("Area of circle is :"+areaOfCircle);
    }

//    create a function that can print all the numbers between x and Y
    public static void printNumbers(int x, int y){

    }
}
