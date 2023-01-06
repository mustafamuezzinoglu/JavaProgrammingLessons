package day11_SwitchScanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "Firefox";

        boolean validBrowser = browserName =="Chrome" || browserName=="Firefox" || browserName=="Opera"
                || browserName=="Safari" || browserName=="Edge";
        String result = "";

        if (validBrowser){

            if(browserName=="Chrome"){
                result = "Chrome is selected";
            } else if(browserName=="Firefox"){
                result = "Firefox is selected";
            } else if(browserName=="Opera"){
                result = "Opera is selected";
            } else if(browserName=="Safari"){
                result = "Safari is selected";
            } else{
                result = "Edge is selected";
            }
        } else{
                result = "İnvalid Browser name";
            }
            System.out.println(result);

        }
}





