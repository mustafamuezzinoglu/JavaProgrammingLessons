package day32_Constructors;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;


    public Employee(String name) {
//        this(name);bir construcor kendini çağıramaz
//       this(name,gender); bir construcor kendini içeremez
        this.name = name;
    }

    public Employee(String name, char gender) {
//  Employee(name); Employee methodu bu şekilde normal metho çağırma yönetmi gibi kullanılmaz
        this(name); // this.name = name;constructorlarda method bu şekilde çağrılır this ile

        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle) {
        this(name,gender);//  this.name = name; ve this.gender = gender; yerine
        this.jobTitle = jobTitle;
    }
    public Employee(String name, char gender, String jobTitle,double salary){
        this(name,gender,jobTitle); //its a construstor call method
//        this(jobTitle); bir costructor içindeki ikinci call methodu hata verir
        this.salary=salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
