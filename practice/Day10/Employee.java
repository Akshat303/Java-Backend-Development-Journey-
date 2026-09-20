class Employee 
{
    private int baseSalary = 30000;

    public void printSlip(String empName, String department) 
	{
        System.out.println("Employee: " + empName);
        System.out.println("Department: " + department);
        System.out.println("Base Salary: " + baseSalary);
    }
}

