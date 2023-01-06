package day32_Constructors;

public class ConstructorCalls {
    public ConstructorCalls(){
//        this(9); kendini çağıramaz satır 10daki ile bu cpns aynı
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
//    this(); call methodu ilk adımda olmalıdır
    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();
        System.out.println("--------------1-------------");
        ConstructorCalls obj2 = new ConstructorCalls(10);
        System.out.println("--------------2-------------");
        ConstructorCalls obj3 = new ConstructorCalls("Java");
    }

}
