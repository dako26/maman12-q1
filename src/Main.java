public class Main {
    public static void main(String[] args) {

        DateOfBirth johnDate = new DateOfBirth(10, 4, 2024);
        DateOfBirth karenDate = new DateOfBirth(22, 2, 2024);
        DateOfBirth sueDate = new DateOfBirth(22, 1, 2024);
        DateOfBirth bobDate = new DateOfBirth(22, 4, 2014);
        DateOfBirth charlieDate = new DateOfBirth(22, 12, 1985);

//
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", johnDate, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", karenDate, 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", sueDate, 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", bobDate, 5000, .04, 300);
        PieceWorker pieceWorker = new PieceWorker("charlie", "loker", "826-47-9547", charlieDate, 20, 20.3);

        System.out.println("Employees processed individually:");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.earnings());

        Employee[] employees = new Employee[5];
        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.printf("Employees processed polymorphically:%n%n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());

    }
}