import static org.junit.Assert.*;

import org.junit.Test;


public class TestStudent {

	Catalog newone = Catalog.getinstance();
	Student one = new Student("maha");
	Student two = new Student("ashu");
	ReverseArray kuhu = new ReverseArray();
	StringMethod new2 = new StringMethod();
	
	
	@Test
	public void test() {
	
		//Catalog newone = Catalog.getinstance();
		String message = "They are equal";
		//assertEquals(message,0,Catalog.get());
		//assertNull(Catalog.get())
	}
	
	@Test
	public void test2(){
		String message = "Cannot add course";
		assertTrue(newone.addcourse("csc201", "csc101"));
		assertFalse(message,newone.addcourse("csc201", "csc101"));
	}
	
	@Test
	public void test3(){
	
		assertTrue(newone.addcourse("csc401", "csc101","csc201"));
		assertTrue(newone.addcourse("csc101"));
		assertTrue(newone.addcourse("csc201"));
		assertTrue(one.takeCourse("csc101"));
		assertTrue(one.takeCourse("csc201"));
		assertTrue(one.takeCourse("csc401"));
		assertFalse(one.takeCourse("csc301"));
	}

	@Test
	public void test4(){
		
		assertTrue(newone.addcourse("csc401", "csc201"));
		assertTrue(newone.addcourse("csc201","csc101"));
		assertTrue(newone.addcourse("csc101","csc100"));
		assertTrue(newone.addcourse("csc100"));
		assertTrue(one.takeCourse("csc100"));
		assertTrue(one.takeCourse("csc101"));
		assertTrue(one.takeCourse("csc201"));
		assertTrue(one.takeCourse("csc401"));
		
	}
	@Test
	public void test5(){
		
		assertTrue(newone.addcourse("csc401", "csc101"));
		assertTrue(newone.addcourse("csc101"));
		assertTrue(newone.addcourse("csc201"));
		assertTrue(one.takeCourse("csc101"));
		assertTrue(one.takeCourse("csc201"));
		assertTrue(two.takeCourse("csc101"));
		assertTrue(two.takeCourse("csc201"));
		assertTrue(two.takeCourse("csc401"));
		assertEquals(one.courseList,two.courseList);
	}
	
	@Test
	public void test6(){
		int [] m = {1,1,1,1,1};
		int [] p = {};
		int [] l = {1,1,1,1,1};
		int [] i = {};
		//assertEquals(l,kuhu.reverse(m));
		assertArrayEquals(l, kuhu.reverse(m));
		assertArrayEquals(i, kuhu.reverse(p));
		//assertEquals(i,kuhu.reverse(p));
	}
	
	@Test
	public void test7()
	{
		String s = "mahash";
		String ss = "ash";
		int i = 3;
		String message = "check not performed";
		assertEquals(message,i,new2.check(s, ss));
	}
	
}
