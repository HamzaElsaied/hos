package university;
import java.util.ArrayList;
 // ma5zan el data and el main menu 

     public class College {
         private String collegeName;
     // ta5zien kol 7aga f el uni ( arraylist )
          private ArrayList<Course> allCourses;
          private ArrayList<Student> allStudents;
          private ArrayList<Lecturer> allLecturers;

     public College(String collegeName) {
          this.collegeName = collegeName;
          this.allCourses = new ArrayList<>();
          this.allStudents = new ArrayList<>();
          this.allLecturers = new ArrayList<>();
     }

     // method to add a new subject 
     public void addCourse(Course course) {
             allCourses.add(course);
             System.out.println("Course added successfully!");
     }

     // method to add a new student  
     public void addStudent(Student student) {
             allStudents.add(student);
             System.out.println("Student registered successfully!");
     } 

     // method to add a new lecturer  
     public void addLecturer(Lecturer lecturer) {
             allLecturers.add(lecturer);
             System.out.println("Lecturer added successfully!");
    }

     // displayInfo ( all courses )
     public void displayAllCourses() {
             System.out.println("\n--- List of All Courses ---");
                 for (Course c : allCourses) {
                      c.displayCourseDetails(); 
                         // call method course 
         }
     }

      // Search Student by id ( to add him new sub )
     public Student findStudent(int id) {
              for (Student s : allStudents) {
                  if (s.getId() == id) return s;
             }
              return null;
     }

     // display College Info
     
      public void displayCollegeInfo() {
             System.out.println("College Name: " + collegeName);
             System.out.println("Total Students: " + allStudents.size());
             System.out.println("Total Courses: " + allCourses.size());
    }

      // Getters arraylist to use it in main class 
         public ArrayList<Course> getAllCourses() {
              return allCourses;
    }
         public ArrayList<Student> getAllStudents() {
             return allStudents; 
    }
         public ArrayList<Lecturer> getAllLecturers() {
             return allLecturers; 
    } 
}
