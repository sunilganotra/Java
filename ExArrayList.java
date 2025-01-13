import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<>();

	    System.out.println(arr);  // Currently empty

	    arr.add("hello");
	    arr.add("India");

	    System.out.println(arr);

	    arr.remove("hello");

	    System.out.println(arr.size());  // Prints size of ArrayList

	    arr.clear();
	    System.out.println(arr); // Empty again
	    
	    //
	    
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);
        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));
        System.out.println("Size: " + fruits.size());

        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
        
        //
        
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Banana", "Apple", "Cherry");
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        
        int index = Collections.binarySearch(list, "Cherry");
        System.out.println("Index of 'Cherry': " + index);

        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
        
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);        
        
		

	}

}


/*
ArrayList methods

.add()
Adds an element to an ArrayList.
.addAll()
Adds a collection to an ArrayList.
.clear()
Removes all elements from an ArrayList.
.clone()
Returns a cloned version of the given ArrayList.
.contains()
Checks if an element is present in the ArrayList or not.
.forEach()
Performs a specified action on each element in an ArrayList.
.get()
Retrieves the element present in a specified position in an ArrayList.
.indexOf()
Returns the index of the first occurrence of a given element, or -1 if not found.
.isEmpty()
Checks if an ArrayList is empty.
.iterator()
Returns an iterator over the elements in an ArrayList.
.listIterator()
Iterates over the elements in an ArrayList in both directions.
.remove()
Removes a specified element from an ArrayList.
.removeAll()
Removes multiple elements from an ArrayList that are also contained in the specified collection.
.removeIf()
Removes all the elements of an ArrayList that satisfy a given predicate.
.removeRange()
Removes every element within a specified range.
.replaceAll()
Replaces each element in the ArrayList with the result of applying a specified unary operator to it.
.retainAll()
Retains only the elements that are contained in the specified collection.
.set()
Replaces the element present in a specified position in an ArrayList.
.size()
Returns the number of elements in the ArrayList.
.sort()
Used to sort arrays of primitive types and objects.
.spliterator()
Returns a Spliterator over the elements in ArrayList.
.subList()
Returns a view of a portion of the list based on the specified start and end indices.
.toArray()
Converts an ArrayList into an array.
.trimToSize()
Adjusts the capacity of the ArrayList to be the same as its size.


*/
