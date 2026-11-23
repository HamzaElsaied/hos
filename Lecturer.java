package university;
import java.util.ArrayList;

  // Inheritance
 public class Lecturer extends Person { 
         private String officeHours;
         private ArrayList<Course> taughtCourses; 
                                                  // ArrayList for grades

 public Lecturer(String name, int id, String officeHours) {
           super(name, id);
           this.officeHours = officeHours;
           this.taughtCourses = new ArrayList<>();
    }

 public void assignCourse(Course course) {
          taughtCourses.add(course);
    }

     //Overriding
 
         @Override
     public void displayInfo() {
              System.out.println("Lecturer: " + getName() + " | ID: " + getId() + " | Office Hours: " + officeHours);
    }
}
