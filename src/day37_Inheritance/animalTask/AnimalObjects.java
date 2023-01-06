package day37_Inheritance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex","Husky", 'F', 4, "Medium", "White"   );
        System.out.println(dog1);

        Cat cat1 = new Cat("Love", "Siamese", 'F', 2 , "Large", "Black");
        System.out.println(cat1);

        Parrot parrot = new Parrot("King", "Macaw", 'M', 3, "Small", "Blue", "Red");
        System.out.println(parrot);

    }
}
