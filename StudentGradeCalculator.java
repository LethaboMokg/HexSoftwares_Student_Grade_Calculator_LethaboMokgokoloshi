import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //fetches number of students
        System.out.print("Please enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] allStudents = new Student[numberOfStudents];

        //students information
        for (int s = 0; s < numberOfStudents; s++ ) {
            System.out.println("\nPlease enter Student Details " + (s +1) + ":");

            System.out.print("Please enter name: ");
            String name = scanner.nextLine();

            System.out.print("Please Enter Student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Please enter the number of grades: ");
            int numberOfGrades = scanner.nextInt();
            double[] grades = new double[numberOfGrades];

            //Enter grades for students
            for (int e = 0; e < numberOfGrades; e++) {
                System.out.print("Please enter subject grade " + (e + 1) + ": ");
                grades[e]= scanner.nextDouble();
            }
            scanner.nextLine();

            // creates student object
            allStudents[s] = new Student(name,studentID, grades);
        }
        //Displays the student information and calculates class average
        double classAverage = 0;
        double passGrade = 70.0;
        System.out.println("\n=== Student Information ===");
        for (Student student : allStudents) {
            student.displayStudentInformation(passGrade);
            classAverage += student.calculateAverage();
            System.out.println("-----------------------");
        }
        //calculates class average
        classAverage /= numberOfStudents;
        System.out.printf("Class Average Grade: %.2f%n", classAverage);

        scanner.close();
    }
}