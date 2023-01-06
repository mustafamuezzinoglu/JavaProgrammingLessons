package day09_shortVideos;

public class Ternaries {
    public static void main(String[] args) {
        int a = 100,
            b = 200;
          /*max;

        if (a>b){
            max = a;
        }else{
            max =b;
    }*/
        int max = a>b? a : b;
        System.out.println(max);
}
}
