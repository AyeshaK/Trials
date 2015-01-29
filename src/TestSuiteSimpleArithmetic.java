import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;



public class TestSuiteSimpleArithmetic {
	private static SimpleArithmetic arithmetic;
	 @BeforeClass
	  public static void setUpBeforeClass() throws Exception {
	   
	  arithmetic=new SimpleArithmetic();
	 }
	@Test
	public void testAddPass() {
	      // assertEquals(String message, int expected, int actual)
	      assertEquals("error in add()",  3, arithmetic.add(1, 2));
	      assertEquals("error in add()", -3, arithmetic.add(-1, -2));
	      assertEquals("error in add()",  9, arithmetic.add(9, 0));
	   }
	 
	   @Test
	   public void testAddFail() {
	      // assertNotEquals(String message, int expected, int actual)
	      assertNotEquals("error in add()", 0, arithmetic.add(1, 2));
	   }
	 
	   @Test
	   public void testSubtractPass() {
	      assertEquals("error in sub()",  1, arithmetic.sub(2, 1));
	      assertEquals("error in sub()", -1, arithmetic.sub(-2, -1));
	      assertEquals("error in sub()",  0, arithmetic.sub(2, 2));
	   }
	 
	   @Test
	   public void testSubtractFail() {
	      assertNotEquals("error in sub()", 0, arithmetic.sub(2, 1));
	   }
	   
	   @Test
	   public void testMultiplyPass() {
	      assertEquals("error in sub()", 2, arithmetic.multi(2, 1));
	      assertEquals("error in sub()", 2, arithmetic.multi(-2, -1));
	      assertEquals("error in sub()",-10000, arithmetic.multi(100,-100));
	   }
	   
	   @Test
	   public void testMultiplyFail() {
	      assertEquals("error in sub()", 1, arithmetic.multi(2, 1));
	     
	   }
	
	   @Test
	   public void testDividePass() {
	      assertEquals("error in sub()", 2, arithmetic.div(2, 1));
	      assertEquals("error in sub()", 2, arithmetic.div(-2, -1));
	      assertEquals("error in sub()",-1, arithmetic.div(100,-100));
	   }
	   
	   @Test
	   public void testDivideFail() {
	      assertEquals("error in sub()",  1, arithmetic.div(2, 1));
	     
	   }
	
	
	
}
