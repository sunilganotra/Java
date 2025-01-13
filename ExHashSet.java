import java.util.HashSet;

public class ExHashSet {

	 public static HashSet<String> SetupHashSet() {
	   HashSet<String> result = new HashSet<String>();
	   result.add("Cabbage");
	   result.add("Pizza");
	   result.add("Sausage");
	   result.add("Potatoes");
	   result.add("Salad");
	   return result;
	 }
	 
	 public static void main(String[] args) {
	   
	   // With a HashSet order of elements inserted really does not matter
	   // its an unordered DS
	   // Duplicate items get only entry in HashSet
	   HashSet<String> food = SetupHashSet();
	   food.add("Sausage");
	   System.out.println(food);
	   
	   //remove an element from HashSet
	   food.remove("Sausage");
	   System.out.println(food);
	   
	   //contains method
	   if (food.contains("Nuts")) {
		     System.out.println("Allergen warning!");
	   	} else {
		     System.out.println("Safe to eat.");
	   }	   
	   
	   System.out.println("HashSet size: "+ food.size());
	   System.out.println(food);
	   food.add("Daal");
	   System.out.println(food.size());
	   System.out.println(food);
	   food.remove("Sausage");
	   System.out.println(food.size());	   
	   System.out.println(food);
	   
	   food.add("Sausage");
	   
	   
	   //traversing a hashset
	   
	   for (String i : food) {
		     System.out.println(i);
		   }	   
	   
	 }
	}


