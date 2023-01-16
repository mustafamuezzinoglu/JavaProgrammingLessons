package day44_Abstraction.Animal;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog("Alex", "Husky", 'F', 4, "Medium", "White");

       Cat cat = new Cat ("Love", "Siamese", 'F', 2, "Large", "Black");

        Tiger tiger = new Tiger("King", "Macaw", 'M', 3, "Small", "Red");

        Parrot parrot = new Parrot("Nice","Africa",'F',2,"Medium","Blue");

        Eagle eagle = new Eagle("Cano","Iran",'F',2,"Medium","Black");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        dog.eat();
        cat.eat();
        tiger.eat();
        parrot.eat();
        eagle.eat();

    }
}
