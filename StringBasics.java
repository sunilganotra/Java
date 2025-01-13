/*Strings in Java are objects that can hold a sequence of characters contained within a pair of double quotes ("). 
It is not a primitive data type.
Strings can either be compared by value via method (e.g., .equals()) or by reference, 
or location in memory, (e.g., ==) via operator.

*/


public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Bob Brown";
		System.out.println(name);
		name = "Sue Brown";
		System.out.println(name);
		
		//String Builder example
		
		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";

		System.out.println(firstName);
		System.out.println(lastName);

		StringBuilder sb = new StringBuilder();

		// use append() to dynamically create a String using StringBuilder 
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());

		// Add a middle Initial
		sb.insert(firstName.length()+1, middleInitial + space);
		System.out.println(sb.toString());
		System.out.println();
	}

}


/* String Methods
Strings
.charAt()
Returns the character at the given index in the string.
.codePointAt()
Returns the Unicode value at the given index in the string.
.codePointBefore()
Returns the Unicode value before the given index in the string.
.codePointCount()
Returns the number of Unicode values in specified range of a string.
.compareTo()
Returns 0 if two strings are equal in Unicode value. Otherwise, the lexicographical difference is returned.
.compareToIgnoreCase()
Returns 0 if two strings are equal in Unicode value, regardless of character case. Otherwise, the lexicographical difference is returned.
.concat()
Returns a string that is the concatenation of the given strings.
.contains()
Returns true if a sequence of characters exists in a given string, otherwise false.
.contentEquals()
Returns true if the sequence of characters in the string is equal to the content of the specified string. If not, returns false.
.copyValueOf()
Returns a string with characters copied from an array.
.endsWith()
Returns true if a string ends with a given suffix, otherwise false.
.equals()
Returns true if two strings are equal in value and false otherwise.
.equalsIgnoreCase()
Compares two strings in a case-insensitive manner.
.format()
Returns a string with additional arguments in a specifically defined format.
.getBytes()
Encodes the string into an array of bytes that represent the characters in the string.
.getChars()
Copies characters from the given string into the destination character array.
.hashCode()
Returns an integer hash code value for the object on which it is invoked.
.indexOf()
Returns the zero-indexed position of the first occurrence of the given character(s) in a string.
.intern()
Creates an exact copy of a string located in the heap memory and stores it in the string constant pool.
.isEmpty()
Returns true if a string has no content, otherwise false.
.join()
Returns a new string composed of the elements joined together with the specified delimiter.
.lastIndexOf()
Searches a string for a specified value and returns the position of the match.
.length()
Returns the number of characters contained in a string.
.matches()
Checks whether a string matches a given regular expression.
.offsetByCodePoints()
Returns the new index of a character in a string after applying the specified code point offset.
.regionMatches()
Tests if two string regions are equal.
.replace()
Returns a new string where all instances of a given value are switched with a new value.
.replaceAll()
Searches a string with a regex pattern and replaces each match with a replacement string.
.replaceFirst()
Replaces the first matching substring in a string with the specified replacement string.
.split()
Splits a string into an array of substrings based on a delimiter pattern.
.startsWith()
Returns true if a string starts with a given character sequence and false otherwise.
.subSequence()
Returns a character sequence from a string.
.substring()
Returns a part of the string specified through a starting index and an optional ending index.
.toCharArray()
Returns an new character array from a given string.
.toLowerCase()
Converts a string to lowercase characters.
.toUpperCase()
Returns a given string in all uppercase letters
.trim()
Removes leading and trailing whitespace from a string.
.valueOf()
Returns the string representation of a given value.
*/  
