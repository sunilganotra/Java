package exptn001;

import java.util.Scanner;
class ThrowDemo{
	public static void main(String ar[]){
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=s1.nextInt();
		try{
			if(num%2==0)
				System.out.println("Even Number");
			else
				throw new ArithmeticException();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}