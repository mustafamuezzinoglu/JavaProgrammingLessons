package day39_Recap.CydeoTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+ getName()+ " is fixing the bug");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is developing the application.");
    }
}
/*
 Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()

 */