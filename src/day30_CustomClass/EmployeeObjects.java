package day30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        employee1.setInfo("Mustafa", 242920, 'M', "QA", 3000 , false);
        
        Employee employee2 = new Employee();
        employee2.setInfo("Esin", 310840, 'F', "Manager", 3500 , true);

        Employee employee3 = new Employee();
        employee3.setInfo("Kayra", 202870, 'M', "Asistant", 2200 , false);

        Employee employee4 = new Employee();
        employee4.setInfo("Çınar", 311963, 'M', "Product Owner", 5000 , true);

        Employee employee5 = new Employee();
        employee5.setInfo("Jenny", 546254, 'F', "Developer", 4000 , true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        int countFullTime = 0;
        int countPartTime =0;
        double max = employees[0].salary;
        double min = employees[0].salary;
        for (Employee employee : employees) {
            if(employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(employee.salary>max){
                max= employee.salary;
            }
            if(employee.salary<min){
                min= employee.salary;
            }
        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
