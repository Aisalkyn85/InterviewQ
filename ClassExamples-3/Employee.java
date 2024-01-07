package day8;

public class Employee 
{










	/*class
object
methods

class is collection of attributes and behavior.
object is an instance of class.
Animal --- Dog, Elephant, Horse etc...
Student --- Kim, David, Scott...
Employee --- John, David, Smith etc..

class
------
-> Logical entity/Blue print
-> will not occupy any space in memory
-> Class contains variables & methods


object
-----------
-> Physical entity
-> needs space in memory
-> an instance of a class
-> we can create any number of objects for 1 class
-> objects are independent

class Employee
{
//variables
//methods
}

creatign an object
---------------------

Employee emp1=new Employee();
Employee emp2 =new Emplyee();

*/
	int eid;
	String ename;
	String job;
	int esal;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(esal);
	}
	
		
	/*public static void main(String[] args)
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="John";
		emp1.job="Engineer";
		emp1.esal=50000;
			
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Scott";
		emp2.job="Manager";
		emp2.esal=70000;
				
		emp2.display();
			
		
	}*/

}
