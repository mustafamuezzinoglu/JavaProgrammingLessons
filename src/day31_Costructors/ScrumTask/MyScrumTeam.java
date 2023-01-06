package day31_Costructors.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        // 4 testers objects
        Tester tester1 = new Tester("Mustafa", 11, "QA", 110000);
        Tester tester2 = new Tester("Esin", 21, "SDET", 115000);
        Tester tester3 = new Tester("Kayra", 31, "SE", 120000);
        Tester tester4 = new Tester("Çınar", 41, "SDET", 130000);

        Tester[] testers = {tester2, tester3, tester4};

        //4 developers objects
        Developer developer1 = new Developer("Engin", 12, "Java Developer", 125000);
        Developer developer2 = new Developer("Birsel", 22, "Java Master", 130000);
        Developer developer3 = new Developer("Ilgın", 32, "Software Developer", 135000);
        Developer developer4 = new Developer("Ilgar", 42, "Senior Developer", 145000);

        Developer[] developers = {developer2, developer3, developer4};

        //1 scrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Nigara", "Neira", "Huseyin", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println(scrum);
        System.out.println("--------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }
        System.out.println("--------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("--------------------------------");

        scrum.removeTester(41);
        scrum.removeDeveloper(42);
        System.out.println(scrum);

    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */