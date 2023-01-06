package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "abcdr a23453#$½>£#>£#  54t $½₺   !@#$%WoodenSpoon";

        String digits = "",
                letters = "",
                specialChars = "";
        for (int i = 0; i < str.length(); i++) { //i:index numbers of str(0~last index
            char ch = str.charAt(i); // ch: each character that we have in str
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else {
                if (ch != ' ') {// if the special character is not a space
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits= " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);


    }
}
