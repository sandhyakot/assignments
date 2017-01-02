import java.util.logging.Logger;

public class Assignment1Main 
{
	static Logger logger = Logger.getLogger(Assignment1Main.class.getName());
	Assignment1Main()
	{
	}
	public static void main(String[] args)
	{
		Date O1=new Date();	//object creation for default constructor
		Date O2=new Date(9);	//object creation for constructor with single parameter
		Date O3=new Date(9,1);	//object creation for constructor with 2 parameters
		Date O4=new Date(9,2,2017);	//object creation for constructor with 3 parameters
		//System.out.println("OUTPUT OF CONSTRUCTOR OVERLOADING(DATE) PROGRAM");
		//System.out.println(O1.print());			
	    //System.out.println(O2.print());				//printing the data of all constructors using objects
	   // System.out.println(O3.print());
	   // System.out.println(O4.print());
	    Employee emp[]=new Employee[2];			//Array of instances for class Employee
		emp[0]=new Employee();					//Object 1 creation for Employee
		emp[1]=new Employee();				//Object 2 creation for Employee
		emp[0].setName("John");					//Assigning values to Mutators using objects
		emp[0].setSalary(15000);
		emp[0].setID(17075);
		emp[1].setName("Ashish");
		emp[1].setSalary(20000);
		emp[1].setID(17078);
		logger.fine("output of employee program");
		logger.info("Hellooooooo");
		
		//System.out.println("OUTPUT OF EMPLOYEE PROGRAM:");
		//System.out.println("Employee1 Name:"+emp[0].getName()+"\nEmployee ID:"+emp[0].getId()+"\nSalary:"+emp[0].getSal());  //Displaying/Printing Details using Accessors
		//System.out.println("Employee2 Name:"+emp[1].getName()+"\nEmployee ID:"+emp[1].getId()+"\nSalary:"+emp[1].getSal());
		//HelloWorld h=new HelloWorld();
		//System.out.println("OUTPUT OF HELLO WORLD PROGRAM");
		//System.out.println(h.print());
		
	}
}
