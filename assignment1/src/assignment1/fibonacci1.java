package assignment1;
import java.util.Scanner;

public class fibonacci1 {
public static void main (String [] args){


	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: "); 
	int number1=sc.nextInt();
	System.out.print("Enter another number: "); 
	int number2=sc.nextInt();
	int number3; 
	int i; 
	int count = number1 + number2;
			 System.out.print(number1+" "+number2); 
			  
			 for(i=2;i<count;++i)
			 {  
			  number3=number1+number2;  
			  System.out.print(" "+number3);  
			  number1=number2;  
			  number2=number3;  
     }
}
}
