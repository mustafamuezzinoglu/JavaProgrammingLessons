package day45_AbstractionContinue.ShapeTask;

public interface Volume { //only this class has to be public because just its name must match the file name

    boolean hasVolume = true;

    double volume();


   /* // i dont need it
    default void drink(){
        System.out.println("Drinks water");
    }
*/
}
// only the default and public are allowed for the access modifier's of class or interfaces (java's rule)
// only one access modifier can we give in one file it is a PUBLIC
// as many as we want to give default access modifier with in one file

/*
abstract class QQ{

}

interface R{

}
*/
