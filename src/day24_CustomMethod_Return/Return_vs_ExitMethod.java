package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {

        nameOfMonth(50);

        System.out.println("Hello World");

    }

    //3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) { //main method içinde verilen numaranın hangi aya ait olduğunu  buluyoruz öncelikle çıkacak sonuç için String isim tanımlıyoruz ve if else ile tamamlayıp print ediyoruz

        if (number < 1 || number > 12) {

            System.out.println("Invalid");
            return; // exits nameOfMonth method,remainimg code fragments of teh method never gets executed
//            return: exiting the method (one method, current method)
          //  System.exit(0); // when use this exit method everything gets terminated so no print hello world
        }
        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                : (number == 11) ? "Nov" : "Dec";

        System.out.println("Month name is = " + name);
    }











}
