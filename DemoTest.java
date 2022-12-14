/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */


import static org.junit.Assert.*;
import org.junit.Test;
public class DemoTest {
@Test
public void test_is_triangle_1() {
assertTrue(Demo.isTriangle(3, 4, 5));}
@Test
public void test_is_triangle_2() {
	assertTrue(Demo.isTriangle(5, 12, 13));}
@Test
public void test_is_triangle_3() {
	assertTrue(Demo.isTriangle(5, 13, 12));}
@Test
public void test_is_triangle_4() {
	assertTrue(Demo.isTriangle(12, 5, 13));}
@Test
public void test_is_triangle_5() {
	assertTrue(Demo.isTriangle(12, 13, 5));}
@Test
public void test_is_NOT_triangle_1() {
	assertFalse(Demo.isTriangle(5, 7, 13));}
@Test
public void test_is_NOT_triangle_2() {
	assertFalse(Demo.isTriangle(5, 13, 7));}
@Test
public void test_is_NOT_triangle_3() {
	assertFalse(Demo.isTriangle(5, 13, -7));
}
}

	