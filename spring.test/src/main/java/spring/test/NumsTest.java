package spring.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import spring.test.ch01.ex01.Nums;
import java.util.Arrays;

public class NumsTest {
	@Test
	pubilc void testGetGreatest() {
		Nums nums = new Nums(Arrays.asList(1,2,3));
		assertEquals(3, nums.getGreatest());
	}
	
	@Test
	public void testGetGreatest2() {
		Nums nums = new Nums(Array.asList(1,3,2));
		assertEquals(3, nums.getGreatest());
	}
}
