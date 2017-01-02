/*Write a class Date. Overload the constructor to initialize the attributes.
Create Date objects using non-parameterized & parameterized constructors both.
Print values of day, month & year for every object.*/

class Date {
	int day;
	int month;
	int year;		//Declaring the class variables
	//default constructor
	Date()
	{	//values for class variables in default constructor
		day=8;				
		month=12;
		year=2016;	
	}
	//overloading 1
	Date(int day)			
	{	//values for class variables in constructor with one parameter
		month=12;
		year=2016;
		this.day=day;
	}
	//overloading 2
	Date(int day,int month)
	{	//values for class variables in constructor with two parameters
		this.day=day;
		this.month=month;
		year=2016;
	}
	//overloading 3
	Date(int day,int month,int year)
	{	//values for class variables in constructor with three parameters
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String print()			//method to print the Date values
	{
		//System.out.println("constructor values:"+day+"/"+month+"/"+year);
		return day+"/"+month+"/"+year;
	}
}
