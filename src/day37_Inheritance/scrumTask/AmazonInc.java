package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner( "Suhaib", 29, 'M', 1, 160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M',2, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 140000, company);

        Tester tester1 = new Tester("Rabia", 28, 'F', "QA", 5, 125000, company);
        Tester tester2 = new Tester("Yasemen", 38, 'F', "QA", 6, 115000, company);
        Tester tester3 = new Tester("Irena", 31, 'F', "SDET", 7, 135000, company);
        Tester tester4 = new Tester("Cihad", 40, 'M', "QAM", 8, 15000, company);

        Tester [] testers ={tester1,tester2,tester3,tester4};

        Developer developer1 = new Developer("Daniela", 39, 'F', "Java Developer", 10, 160000, company);
        Developer developer2 = new Developer("Elena", 37, 'F', "Java Developer", 10, 160000, company);
        Developer developer3 = new Developer("Smith", 35, 'M', "Java Developer", 10, 160000, company);
        Developer developer4 = new Developer("Daniela", 33, 'F', "Java Developer", 10, 160000, company);
        Developer developer5 = new Developer("John", 31, 'M', "Java Developer", 10, 160000, company);

        Developer [] developers ={developer1,developer2,developer3,developer4,developer5};

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);
        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("-------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " "+ tester.jobTitle+ " "+ tester.salary);
        }

        System.out.println("-------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + " "+ developer.jobTitle+ " "+ developer.salary);
        }


    }

}
