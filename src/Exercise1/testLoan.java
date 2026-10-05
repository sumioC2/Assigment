package Exercise1;

public class testLoan {
    public static void main(String[] args) {
        // Test default constructor
        Loan loan1 = new Loan();
        System.out.println("--- Loan 1 (Default) ---");
        System.out.println("Loan Date: " + loan1.getLoanDate());
        System.out.printf("Monthly Payment: %.2f\n", loan1.getMonthlyPayment());
        System.out.printf("Total Payment: %.2f\n", loan1.getTotalPayment());

        // Test custom constructor
        Loan loan2 = new Loan(5.5, 5, 20000);
        System.out.println("\n--- Loan 2 (Custom) ---");
        System.out.println("Loan Date: " + loan2.getLoanDate());
        System.out.printf("Monthly Payment: %.2f\n", loan2.getMonthlyPayment());
        System.out.printf("Total Payment: %.2f\n", loan2.getTotalPayment());
    }
}