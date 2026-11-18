class StudentDetails {
    private String instituteCode = "KodeWala";

    public void evaluateStudent(String studentName, int marks) {
        System.out.println("Institute Code: " + instituteCode);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks Scored: " + marks);
        
        if (marks >= 40) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }
    }
}

