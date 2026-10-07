import java.util.Date;

public class Loan {
    private final Date loanDate;
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyRate = annualInterestRate / 1200.0;
        int months = numberOfYears * 12;

        if (monthlyRate == 0) {
            return loanAmount / months;
        }

        return loanAmount * monthlyRate /
                (1 - 1 / Math.pow(1 + monthlyRate, months));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}