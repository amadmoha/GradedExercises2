public class Course {
    private final String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[4];
        this.numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] largerArray = new String[students.length * 2];

            System.arraycopy(students, 0, largerArray, 0, students.length);

            students = largerArray;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return;
            }
        }
    }

    public String[] getStudents() {
        String[] enrolled = new String[numberOfStudents];

        System.arraycopy(students, 0, enrolled, 0, numberOfStudents);

        return enrolled;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
