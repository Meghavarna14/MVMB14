package armstrong;
import java.util.Scanner;
	public class Armstrong {
	public static void main(String args[]) {
	      int number;
	      int m, rem, sum = 0;
	      System.out.println("Enter the number to be verified:");
	      Scanner sc = new Scanner(System.in);
	      number = sc.nextInt();
	      m = number;
	      while(m!= 0) {
	         rem = m % 10;
	         sum = sum + (rem * rem * rem);
	         m= m / 10;
	      }
	      if(sum == number)
	         System.out.println("Given number is an armstrong number.");
	      else
	         System.out.println("Given number is not an armstrong number.");
	   }
	}

