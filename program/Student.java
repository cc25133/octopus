import java.util.Arrays;

public class Student extends Person {
    private int nCourses = 0;
    private String[] courses = {};
    private int[] grades = {};

    public Student(String name, String address){
        super(name, address);
    }
    public void addCourseGrade(String course, int grade){
        courses = Arrays.copyOf(courses, courses.length+1);
        courses[courses.length -1] = course;

        grades = Arrays.copyOf(grades, grades.length+1);
        grades[grades.length-1] = grade;

        nCourses = courses.length;
    }

    public void printGrades(){
        for (int i = 0; i < nCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade(){
        if (nCourses == 0) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / nCourses;
    }

    public String toString(){
        return super.toString();
    }
}
