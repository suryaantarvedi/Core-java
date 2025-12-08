import models.FullTimeEmployee;
import models.PartTimeEmployee;
import models.PayrollSystem;

public class Main{
    public static void main(String[] args)
    {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("John Doe", 101, 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Jane Smith", 102, 30, 500);

        System.out.println("\nInitial Employee Details:");
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.displayAllEmployees();
        
        System.out.println("\nAfter Removing Employee with ID = 101:");
        payrollSystem.removeEmployee(101);
        payrollSystem.displayAllEmployees();


    }
}