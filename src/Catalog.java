import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Catalog {
	private static Catalog theCatalog = null;
	public static Catalog getinstance() {
		if (theCatalog == null) {
			theCatalog = new Catalog();
		}
		return theCatalog;
	}
	
	public static void print()
	{
		System.out.println("hello how are you ?");
	} 
	
	static Map<String, List<String>> catalogmap = new HashMap <String, List<String>>();
	
	public static Map get()
	{
		if(catalogmap.isEmpty())
			return null;
		return catalogmap;
	}
	
	public static void printThis()
	{
		System.out.println(catalogmap);
		System.out.println("this is atest print");
		int i = 1;
		if(i>0)
		System.out.println("Hllo");
		
	}
	public boolean addcourse(String courseName,String ...  prereq)
	{
		List <String> list = new ArrayList<String>();
		if(!catalogmap.containsKey(courseName))
		{
		if(prereq!=null)
		{
		for(String pre : prereq)
		{
			list.add(pre);
			System.out.println("Hello how are you");
		}
		catalogmap.put(courseName,list);
		}
		else
			catalogmap.put(courseName,null);
		return true;
		}
		return false;
	}
public void reset(){
	if(catalogmap!=null)
	catalogmap.clear();}
	

public static void main(String[] args)
{
Catalog newone = Catalog.getinstance();
Student one = new Student("maha");

newone.addcourse("csc401", "csc101","csc201");
newone.addcourse("csc101");
newone.addcourse("csc201","csc101");
one.takeCourse("csc101");
one.takeCourse("csc201");
one.takeCourse("csc101");
one.takeCourse("csc201");
one.takeCourse("csc401");
//one.takeCourse("csc301");
//one.takeCourse("csc301");
one.takeCourse("csc201");
printThis();
print();


}

}