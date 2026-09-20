class LibraryDetails {
    private int finePerDay = 5;

    public void issueBook(String bookTitle, String studentName, int overdueDays) {
        int totalFine = overdueDays * finePerDay;
        System.out.println("Book: " + bookTitle);
        System.out.println("Student: " + studentName);
        System.out.println("Overdue Days: " + overdueDays);
        System.out.println("Late Return Fine: Rs. " + totalFine);
    }
}