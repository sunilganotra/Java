import java.util.ArrayList;

public class Wrapper {

	public Wrapper() {
		// TODO Auto-generated constructor stub
		
		}

	//integer 2 Integer
	public static void main(String args[]) {
			ArrayList<Integer> numbers = new ArrayList<>();
			numbers.add(10); //Auto Boxing
			numbers.add(Integer.valueOf(12)); //Boxing
			numbers.add(Integer.valueOf(14));
			numbers.add(Integer.valueOf(16));
			numbers.add(Integer.valueOf(18));
			numbers.add(Integer.valueOf(20));
			numbers.add(Integer.valueOf(22));			
			
			
			System.out.println("numbers: [" +numbers + "]");
			System.out.println("fifth element:intValue [" +numbers.get(5).intValue() + "]");
			System.out.println("fifth element:get [" +numbers.get(5) + "]");
			
	}
}


