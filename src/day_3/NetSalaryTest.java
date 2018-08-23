package day_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NetSalaryTest {
NetSalary salary;
 @Test
 void setUp() {
	 salary = new NetSalary(1234,"John",50000,2500);
 }
	@Test
	void testNetSalary() {
		assertEquals(71300, salary.netSalary(), 0.02); 
	
	}
	
}
