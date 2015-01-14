import java.util.ArrayList;
import java.util.List;


public class Student {
	
	public String studentName;
	List<String> courseList = new ArrayList<String>();
	
	// adding the student name in the constructor
	
	public Student(String name) {
		this.studentName = name;
	}
	
	//function for taking a course . adds to the students arraylist of courses he has taken.
	public boolean takeCourse(String course) {
		if( (this.mayTakeCourse(course)) == true) {
			this.courseList.add(course);
			return true;
		}
	//	System.out.println(courseList);
		return false;
	}
	
	//checks the course catalog and sees if the student has taken all the pre requisites.
	public boolean mayTakeCourse(String courseName) {
		
		Catalog ins = Catalog.getinstance();
		//get the pre reqs based on courseName
		List<String> prereqList = new ArrayList<String>();
		if(ins.catalogmap.containsKey(courseName))
		{
		prereqList = ins.catalogmap.get(courseName);
		//System.out.println(prereqList);
		System.out.println(courseList);
		// use both the lists to see if the student has taken all the required courses
		
		for (String course : prereqList) {
			System.out.println(course);
			if(courseList.contains(course) == false ) {
				System.out.println("STUDENT MAY NOT TAKE THIS COURSE.. PRE-REQUISITE" + course + "NEEDS TO BE DONE");
				return false;
			}
		}
		System.out.println("ALL PRE-REQUISITES ARE DONE.. STUDENT MAY TAKE THIS COURSE");
		
		
		return true;
		}
		else {
			System.out.println("cant take course");
			return false;
		}
	}

}
