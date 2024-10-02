public class Student {
    //creating instance three variables (attribute)
    private String name;
    private String studentID;
    private double[] grades;

    //Initializer/ Constructor
    public Student(String name, String studentID, double[] grades) {
        this.name = name;
        this.studentID = studentID;
        this.grades = grades;
    }

    //the method that calculates the average grades
    public  double calculateAverage() {
        double sum = 0;
        //using a loop to calculate
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    //the method to display each grade for a student
    public  void displayGrades() {
        System.out.println("Grades for " + name + " (ID: " + studentID + "):");
        for (int s = 0; s < grades.length; s++) {
            System.out.println("Subject " + (s + 1) + ": " + grades[s]);
        }
    }
    //method if student passed or failed
    public boolean hasPassed(double passGrade) {
        return calculateAverage() >= passGrade;
    }
    //Student Information displayed
    public void displayStudentInformation(double passGrade){
        System.out.println("Name:  " + name);
        System.out.println("Student ID:  " + studentID);
        displayGrades();
        //printing out the format
        System.out.printf("Average Grade: %.2f%n", calculateAverage());
        System.out.println("Status:  " + (hasPassed(passGrade) ? "Passed Well Done!!" : "Failed Try again"));
    }

}
