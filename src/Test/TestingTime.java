package Test;
import com.Chain.RoleCheck;
import com.phone.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;


class TestingTime {
	@Test
	public void test_Android() {
		

	assertEquals("Most powerful os","Most powerful os");
	assertEquals("Rs.25000","Rs.25000");
	assertEquals("Samsung Galaxy tab 3","Samsung Galaxy tab 3");
	}
	
	@Test
	public void test_IOS()
	{
		assertEquals("Most secured os","Most secured os");
		assertEquals("Rs. 60000.00","Rs. 60000.00");
		assertEquals("Iphone 6","Iphone 6");
		}
	
	@Test
	public void test_windows()
	{
		assertEquals("Abt to die","Abt to die");
		assertEquals("Rs. 30000.00","Rs. 30000.00");
		assertEquals("Nokia Lumia","Nokia Lumia");	
		}
	@Test
	public void test_mail()
	{
		RoleCheck k=new RoleCheck();
		assertNotNull(k.check("admin@example.com", "admin_pass"));
		assertNotNull(k.check("user@example.com", "user_pass"));
		
		
	}
	
	}



