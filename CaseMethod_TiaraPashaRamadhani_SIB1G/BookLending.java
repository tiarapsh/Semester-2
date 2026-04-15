package CaseMethod_TiaraPashaRamadhani_SIB1G;

public class BookLending {
    Student sdt;
    Book book;
    int loanPeriod;
    int loanLimit;
    int overdue;
    int fine;

    public BookLending() {
    }

    public BookLending(Student sdt, Book book, int loanPeriod, int loanLimit) {
        this.sdt = sdt;
        this.book = book;
        this.loanPeriod = loanPeriod;
        this.loanLimit = loanLimit;
    }

    public void calculateFine() {
        if (loanPeriod > loanLimit) {
            overdue = loanPeriod - loanLimit;
            fine = overdue * 2000;
        } else {
            overdue = 0;
            fine = 0;
        }
    }

    public void printLending() {
        System.out.println(
                sdt.name + " | " +
                        book.title + " | " +
                        "Loan Period (days): " + loanPeriod + " | " +
                        "Late return of books: " + overdue + " | " +
                        "fine: " + fine);
    }
}
