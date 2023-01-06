package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";
        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White&Black";

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'F', "Extra Large", "Yellow");
        System.out.println(dog4);

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");
        System.out.println(dog5);

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        femaleDogs.removeIf(p-> p.gender!= 'F');
        System.out.println("femaledogs "+femaleDogs);

        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dog1, dog2, dog3, dog4, dog5));
        maleDogs.removeIf(p-> p.gender!= 'M');
        System.out.println("maledogs "+maleDogs);

        dog1.eat();

        dog2.bark();


    }
}
