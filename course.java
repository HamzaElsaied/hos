 package university;

     public class Course {
          private String courseName;
          private String courseCode;

     // Constructor 
     public Course(String courseName, String courseCode) {
          this.courseName = courseName;
          this.courseCode = courseCode;
    }

    // Overloading and displaymethod 
     
     public void displayCourseDetails() {
          System.out.println("Course: " + courseName + " [" + courseCode + "]");
     }

     public void displayCourseDetails(String message) {
          System.out.println(message + ": " + courseName + " (" + courseCode + ")");
     }

      public String getCourseName()
      {
          return courseName; 
      
      }
}
