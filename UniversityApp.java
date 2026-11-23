package university;
import java.util.Scanner;

public class UniversityApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             College myCollege = new College("Alexandria University"); 

         int choice = 0;
          // 12. Quit
         while (choice != 12) {  
              System.out.println("\n--- Course Registration System Main Menu ---");
              System.out.println("1. Add a course");
              System.out.println("2. Add a student");
              System.out.println("3. Add a lecturer");
              System.out.println("4. Register a course for a student");
              System.out.println("5. Register a course for a lecturer");
              System.out.println("6. Display collage information");
              System.out.println("7. Display the complete list of courses");
              System.out.println("8. Display the complete list of students");
              System.out.println("9. Display the complete list of lecturers");
              System.out.println("10. Display a list of courses currently taken by a particular student");
              System.out.println("11. Display a list of courses currently taught by a particular lecturer");
              System.out.println("12. Quit");
              System.out.print("Enter your choice: ");
            
             choice = input.nextInt();
             input.nextLine(); 

             switch (choice) {
                     case 1:
                         System.out.print("Enter Course Name: ");
                             String cName = input.nextLine();
                         System.out.print("Enter Course Code: ");
                              String cCode = input.nextLine();
                     myCollege.addCourse(new Course(cName, cCode));
                                  break;
                     case 2:
                         System.out.print("Enter Student Name: ");
                             String sName = input.nextLine();
                         System.out.print("Enter Student ID: ");
                             int sId = input.nextInt();
                     myCollege.addStudent(new Student(sName, sId));
                                 break;
                     case 3:
                         System.out.print("Enter Lecturer Name: ");
                             String lName = input.nextLine();
                         System.out.print("Enter Lecturer ID: ");
                             int lId = input.nextInt();
                             input.nextLine();
                         System.out.print("Enter Office Hours: ");
                             String oh = input.nextLine();
                     myCollege.addLecturer(new Lecturer(lName, lId, oh));
                                  break;
                     case 4:
                     // add new sub to student 
                         System.out.print("Enter Student ID: ");
                             int targetSId = input.nextInt();
                         Student s = myCollege.findStudent(targetSId);
                             if (s != null && !myCollege.getAllCourses().isEmpty()) {
                                  s.addCourse(myCollege.getAllCourses().get(0)); 
                         System.out.println("Course registered for student!");
                          } else {
                               System.out.println("Student not found or no courses available.");
                           }
                                 break;
                                 case 5:
                                   System.out.print("Enter Lecturer ID: ");
                                   int lecturerId = input.nextInt();
                                    // بنعمل Search على الدكتور بالـ ID بتاعه
                                    Lecturer foundLec = null;
    for (Lecturer l : myCollege.getAllLecturers()) {
        if (l.getId() == lecturerId) {
            foundLec = l;
            break;
        }
    }

    if (foundLec != null && !myCollege.getAllCourses().isEmpty()) {
        // هنا بنربط الدكتور بأول مادة موجودة في الكلية كمثال
        foundLec.assignCourse(myCollege.getAllCourses().get(0));
        System.out.println("Course assigned to lecturer successfully!");
    } else {
        System.out.println("Lecturer not found or no courses available.");
    }
    break;
                                 
                     case 6:
                         
                         
                         
                          myCollege.displayCollegeInfo(); // عرض بيانات الكلية
                                 break;
                     case 7:
                           myCollege.displayAllCourses(); // عرض كل المواد
                                 break;
                     case 8:
                         System.out.println("\n--- Students List ---");
                             for (Student st : myCollege.getAllStudents()) st.displayInfo();
                                 break;
                    case 9:
                    // عرض كل المحاضرين
                    System.out.println("\n--- Lecturers List ---");
                    for (Lecturer lec : myCollege.getAllLecturers()) {
                        lec.displayInfo();
                    }
                    break;

                case 10:
                    // عرض مواد طالب معين
                    System.out.print("Enter Student ID to see his courses: ");
                    int sIdSearch = input.nextInt();
                    Student foundS = myCollege.findStudent(sIdSearch);
                    if (foundS != null) {
                        System.out.println("Courses for " + foundS.getName() + ":");
                        for (Course c : foundS.getRegisteredCourses()) {
                            c.displayCourseDetails();
                        }
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 11:
                    // عرض مواد محاضر معين (لو زودت ميثود getTaughtCourses في كلاس Lecturer)
                    System.out.print("Enter Lecturer ID: ");
                    int lIdSearch = input.nextInt();
                    // بنلف على لستة المحاضرين عشان نلاقيه
                    for (Lecturer lec : myCollege.getAllLecturers()) {
                        if (lec.getId() == lIdSearch) {
                            lec.displayInfo();
                            // هنا بنفترض إنك ضفت ميثود عرض في كلاس المحاضر
                            break;
                        }
                    }
                    break;             
                                 
                                 
                     case 12:
                         System.out.println("Exiting System... Good Bye!");
                                 break;
                 default:
                       System.out.println("Invalid choice, please try again.");
            }
        }
          input.close();
    }
}
