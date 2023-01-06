package day31_Costructors.ScrumTask;

public class Developer {
    public String name;
    public int employeeId;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary= $" + salary +
                '}';
    }

    public void coding() {
        System.out.println(name + "is coding");
    }

    public void unitTesting() {
        System.out.println(name + "is unit testing");
    }

    public void fixingBug() {
        System.out.println(name + "is fixing bug");
    }
}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()

 */