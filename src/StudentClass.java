import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class StudentClass {

	 static List muster= new ArrayList();	; 
	private static StudentClass musterclass = null;
	public String name = "";
	public int rank;
	
	
	public StudentClass(String name, int rank)
	{
		this.name = name;
		this.rank = rank;
	}
	/*
	public static StudentClass getInstance()
	{
		if(musterclass == null)
		{
			musterclass = new StudentClass();
		}
		return musterclass;
	}
	*/
	
	public static StringBuffer reverseEntries(List muster){
		StringBuffer br = new StringBuffer();
		for(Object s : muster)
		{
			String new1 = s.toString();
			br.append(new1 + "hello");
			//br = new1 + "Hello"+ br;
		}
			System.out.print(br);
		return br;
	}
	
	public static void addStudent(String stud)
	
	{
		muster.add(stud);
		
	}
	
	public static void removeStudent(String stud)
	{
		muster.remove(stud);
	}
	
	
	public static void main( String []args)
	{
		StudentClass stud = new StudentClass("Jill", 4);
		StudentClass stud1 = new StudentClass("Bill", 3);
		StudentClass stud2 = new StudentClass("Chang", 2);
		StudentClass stud3 = new StudentClass("Tang", 1);
		addStudent(stud.name);
		addStudent(stud1.name);
		addStudent(stud2.name);
		addStudent(stud3.name);
		reverseEntries(muster);
		System.out.println(muster.toString());
		removeStudent(stud1.name);
		System.out.println(muster.toString());
	}
}
