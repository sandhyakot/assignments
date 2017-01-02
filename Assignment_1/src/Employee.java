/*Question 2:Create a class Employee & write Accessors & Mutators
Create objects with default constructor & set values using mutators.
Display/print values of attributes of each object created.*/
class Employee 
{
    int emp_id;
    int Salary;		//class variables
	String emp_name;
	public String getName()		//Accessor for employee name
	{
		return emp_name;
	}
	public int getId()			//Accessor for employee ID
	{
		return emp_id;
	}
	public int getSal()			//Accessor for employee Salary
	{
		return Salary;
	}
	public void setName(String emp_name)		//Mutator for employee name
	{
	 this.emp_name=emp_name;
	}
	public void setID(int emp_id)		//Mutator for employee ID
	{
	this.emp_id=emp_id;	
	}
	public void setSalary(int Salary)		//Mutator for employee salary
	{
		this.Salary=Salary;
	}
	

}
