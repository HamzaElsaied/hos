package university;
import java.util.ArrayList;

 // Inheritance
     public class Student extends Person {
         private ArrayList<Course> registeredCourses;

     public Student(String name, int id) {
             super(name, id);
             this.registeredCourses = new ArrayList<>(); 
    }

     public void addCourse(Course course) {
          registeredCourses.add(course);
    }

     public ArrayList<Course> getRegisteredCourses() {
          return registeredCourses;
    }

      // Overriding
      @Override
         public void displayInfo() {
              System.out.println("Student ID: " + getId() + " | Name: " + getName());
    }
}
