import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Teacher extends Person {
    private int nCourses = 0;
    private String[] courses = {};
    private Department departament;

    public Teacher(String name, String address){
        super(name, address);
    }

    public Department getDepartament(){
        return this.departament;
    }

    public void setDepartament(){
        this.departament = departament;
    }

    public boolean addCourse(String course){
        if (Arrays.asList(courses).contains(course)) 
            return false; 
        courses = Arrays.copyOf(courses, courses.length + 1);
        courses[courses.length-1] = course;
        nCourses = courses.length; 
        
        return true;
    }

    public boolean removeCourse(String course){
        List<String> list = new ArrayList<>(Arrays.asList(courses));

        if (!list.remove(course)) {
            return false; 
        }
        
        courses = list.toArray(new String[0]);
        nCourses = courses.length;
        
        return true;        
    }

    public abstract double calculateWeeklyPay();

    public String toString(){
        String result = super.toString();
        for (int i = 0; i < courses.length; i++) {
            result += "\n" + courses[i];
        }
        return result;
    }


}
