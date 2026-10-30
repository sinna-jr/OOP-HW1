public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("E1" , "e1" , 2000);
        Employee e2 = new FullTimeEmployee("E2" , "e2" , 3000,500,200);
        Employee e3 = new PartTimeEmployee("E3" , "e3" , 40,25);
        Employee[] employees = {e1, e2, e3};
        double total = 0 ;

        for(int i=0; i<employees.length; i++){
            employees[i].displayInfo();
            total+=employees[i].calculateSalary();
            System.out.println();
        }

        System.out.println("Total salary is: "+total);

    }

}
