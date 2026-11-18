class EmployeeDetails {
    private int basicSalary = 30000;
    private int hra = 8000;

    public void generateSlip(String empName, String designation) {
        int totalSalary = basicSalary + hra;
        System.out.println("Employee: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: Rs. " + basicSalary);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("Total Gross Salary: Rs. " + totalSalary);
    }
}