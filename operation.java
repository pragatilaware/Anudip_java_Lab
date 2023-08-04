/*
 Create an interface called "Person" with a method called "speak". Create two classes  called "Student" and "Teacher"
  that implement  the Person interface and implement the "speak" method. Create objects of both the Student and  Teacher classes
   and call their respective "speak"  methods.
 */



package package2;

public class operation {
	 
	 public static void main(String[] args) {
		 
		 //student class object
		 Student obj1=new Student();
		 obj1.speak();
		 
		 
		 //teacher class object
		 Teacher obj2= new Teacher();
		 obj2.speak();
		
	}

}
