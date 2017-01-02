import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class Assignment1Test 
{
	Employee e;
	HelloWorld h;
	Date d1;	//object creation for default constructor
	Date d2;	//object creation for constructor with single parameter
	Date d3;	//object creation for constructor with 2 parameters
	Date d4;
	@Before
	public void set()
	{
		e=new Employee();
		h=new HelloWorld();
		d1=new Date();
		d2=new Date(9);
		d3=new Date(9,1);
		d4=new Date(9,2,2017);
	}
	@Test
	public void TestHelloWorld()
	{
		assertEquals("HelloWorld",h.print());
	}
	@Test
	public void TestDCon1()
	{
		assertEquals("8/12/2016",d1.print());
	}
	@Test
	public void TestDCon2()
	{
		assertEquals("9/12/2016",d2.print());
	}
	@Test
	public void TestDCon3()
	{
		assertEquals("9/1/2016",d3.print());
	}
	@Test
	public void TestDCon4()
	{
		assertEquals("9/2/2017",d4.print());
	}
	@Test
	public void TestEmpgetID()
	{
		e.setID(1234);
		assertEquals(1234,e.getId());
		
	}
	@Test
	public void TestEmpgetName()
	{
		e.setName("Sandhya");
		assertEquals("Sandhya",e.getName());
	}
	@Test
	public void TestEmpgetSalary()
	{
		e.setSalary(50000);
		assertEquals(50000,e.getSal());
	}
}
