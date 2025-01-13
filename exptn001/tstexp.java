package exptn001;
import java.util.Scanner;
class MyException extends Exception{
	String e;
	public MyException() {
		e = "Invalid num";
	}
	public String toString(){
		return e;
	}	

}

class tstexp {
	
	public static void main(String[] args) {
		try{
			int num = 3;
			if (num %2 ==0) {
				System.out.println("Valid num");	
			}
			else
				throw new MyException();
				
		}
		catch(MyException e) {
				System.out.println(e);
		}
	}

}

