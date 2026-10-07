import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        DecimalFormat money = new DecimalFormat("#,##0.00");

        // Exercise 2.0: Loan
        System.out.println("===== Exercise 2.0: Loan =====");
        Loan loan = new Loan();
        System.out.println("Annual interest rate: " + loan.getAnnualInterestRate() + "%");
        System.out.println("Number of years: " + loan.getNumberOfYears());
        System.out.println("Loan amount: $" + money.format(loan.getLoanAmount()));
        System.out.println("Loan date: " + loan.getLoanDate());
        System.out.println("Monthly payment: $" + money.format(loan.getMonthlyPayment()));
        System.out.println("Total payment: $" + money.format(loan.getTotalPayment()));

        Loan customLoan = new Loan(5.0, 3, 10000);
        System.out.println("\nCustom loan (5%, 3 years, $10,000):");
        System.out.println("Monthly payment: $" + money.format(customLoan.getMonthlyPayment()));
        System.out.println("Total payment: $" + money.format(customLoan.getTotalPayment()));

        // Exercise 2.1: BMI
        System.out.println("\n===== Exercise 2.1: BMI =====");
        BMI person1 = new BMI("Ahmed", 21, 150, 68);
        BMI person2 = new BMI("Ali", 180, 70); // default age is 20

        displayBMI(person1);
        displayBMI(person2);

        // Exercise 2.2: Course
        System.out.println("\n===== Exercise 2.2: Course =====");
        Course course = new Course("Java Programming");
        course.addStudent("Ahmed");
        course.addStudent("Amina");
        course.addStudent("Mohamed");
        course.addStudent("Hodan");
        course.addStudent("Fatima"); // demonstrates automatic array expansion

        System.out.println("Course name: " + course.getCourseName());
        System.out.println("Students: " + Arrays.toString(course.getStudents()));
        System.out.println("Number of students: " + course.getNumberOfStudents());

        course.dropStudent("Mohamed");
        System.out.println("\nAfter dropping Mohamed:");
        System.out.println("Students: " + Arrays.toString(course.getStudents()));
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }

    private static void displayBMI(BMI person) {
        System.out.printf("%s (age %d): BMI = %.2f, Status = %s%n",
                person.name(), person.age(), person.getBMI(), person.getStatus());
    }
}