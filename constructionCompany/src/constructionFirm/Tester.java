package constructionFirm;

public class Tester {
    public static void main(String[] args){
        ContractEmployee emp1= new ContractEmployee(1001, "Shubh", 3500, 6.4f);
        System.out.println("The salary of employee " + emp1.getEmployeeName() +" is " + emp1.calculateSalary());
        
        ContractEmployee emp2= new ContractEmployee(1002, "Manish", 3600, 6.3f);
        System.out.println("The salary of employee " + emp2.getEmployeeName() +" is " + emp2.calculateSalary());
        
        ContractEmployee emp3= new ContractEmployee(1003, "Mujeeb", 3700, 6.2f);
        System.out.println("The salary of employee " + emp3.getEmployeeName() +" is " + emp3.calculateSalary());

        PermanentEmployee emp4 = new PermanentEmployee(9001, "Satyam", 25000, 1000, 2);
        System.out.println("The salary of employee " + emp4.getEmployeeName() +"is " + emp4.calculateMonthlySalary());
        
        PermanentEmployee emp5 = new PermanentEmployee(9002, "Bhumika", 25000, 1000, 2);
        System.out.println("The salary of employee " + emp5.getEmployeeName() +" is " + emp5.calculateMonthlySalary());
        
        PermanentEmployee emp6 = new PermanentEmployee(9003, "Bakode", 25000, 1000, 2);
        System.out.println("The salary of employee " + emp6.getEmployeeName() +" is " + emp6.calculateMonthlySalary());
    }
}
