package university;

     // abstract method 
 public abstract class Person {
      private String name;
      private int id;

       // Constructor
         public Person(String name, int id) {
              this.name = name;
              this.id = id;
    }

       // Getters and Setters (Encapsulation)

       public void setName(String name) {
          this.name = name;
     }

        public void setId(int id) {
          this.id = id;
     }

       public String getName() {
          return name;
     }

       public int getId() {
          return id;
     }
     
      // Method abstract     (Overriding)
       
          public abstract void displayInfo();
 }
