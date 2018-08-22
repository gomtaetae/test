package spring.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.asserNotNull;
import java.util.Date;
import java.junit.Test;

public class MyAssert {
	@Test
	public void test(){
		assertNull(new Date());
	}
	
	@Test
	public void test2(){
		assertNull(null);
	}
	
	@Test
	public void test3(){
		assertNotNull(new Date());
	}
	
	@Test
	public void test4(){
		assertNotNull(null);
	}
}
