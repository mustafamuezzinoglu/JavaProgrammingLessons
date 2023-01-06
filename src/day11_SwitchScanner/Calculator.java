package day11_SwitchScanner;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;
        char operator = '+';
        boolean valid = operator == '+' || operator == '-' || operator == '/' || operator == '*';

        if (valid) {

            if(operator == '+') {
                System.out.println(n1 + n2);

            }else if(operator =='-') {
                System.out.println(n1 + n2);
            }else if(operator == '*'){
                        System.out.println(n1+n2);

            }else{
                System.out.println(n1/n2);
            }
            /*switch (operator) {
                case '+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);

            }*/
        } else {
            System.out.println("Invalid Operator: " + operator);
        }


    }
}
