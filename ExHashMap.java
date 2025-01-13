import java.util.HashMap;
import java.util.Map;
public class ExHashMap {

	public static void main(String[] args) {
	    HashMap<String, String> courseTeacher = new HashMap<String, String>();

	    // Add keys and values (CourseNames, Teacher)
	    courseTeacher.put("History", "Ben");
	    courseTeacher.put("Mathematics", "Jeanette");
	    courseTeacher.put("Physics", "Lily");

	    System.out.println(courseTeacher.get("Physics"));
	    System.out.println(courseTeacher.get("History"));
	    
	    System.out.println(courseTeacher);
	    
	    
	    //remove items
	    
	    courseTeacher.remove("Physics");
	    System.out.println(courseTeacher);
	    
	    //removing all items
	    courseTeacher.clear();
	    System.out.println(courseTeacher);
	    
	    
	    //traversing a HashMap

	    courseTeacher.put("History", "Ben");
	    courseTeacher.put("Mathematics", "Jeanette");
	    courseTeacher.put("Physics", "Lily");
	    courseTeacher.put("History", "Ben");
	    System.out.println(courseTeacher);

	    System.out.println("Courses offered at our Institute:");

	    for (String i : courseTeacher.keySet()) {
	      System.out.println(i);
	    }

	    System.out.println("\nTeachers teaching at our Institute:");

	    for (String i : courseTeacher.values()) {
	      System.out.println(i);
	    }	    
	  
	  TraverseHashMap();
	  }
	
	static void TraverseHashMap() {
		HashMap<String, String> courseTeacher = new HashMap<String, String>();

	    courseTeacher.put("Discrete Maths", "Arvind");
	    courseTeacher.put("Trigno", "Ruhty");
	    courseTeacher.put("Algebra", "Harry");


	    for (Map.Entry<String, String> entry: courseTeacher.entrySet()) {
	      System.out.printf("Course: %s",entry.getKey());
	      System.out.printf("Teacher: %s \n", entry.getValue());	
	    }
	}
}

