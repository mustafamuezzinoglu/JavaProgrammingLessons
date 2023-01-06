package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names= {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};
        for (String each  : names) { //for each loop her bir elementi dışasrı çıkartır

            String initials = each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1); //charAt() ile here elementin istediğimiz karakterini alırız
            System.out.println(initials);

        }





    }
}
