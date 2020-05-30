import java.util.Scanner;

public class Calci {

	//public static void main(String[] args) {
		 public static void main(String[] args) 
		 {
		      double num1;
		      double num2;
		      double ans;
		      char op;
		      Scanner r = new Scanner(System.in);
		      System.out.print("Enter two numbers: ");
		      num1 = r.nextDouble();
		      num2 = r.nextDouble();
		      System.out.print("\nEnter an operator (+, -, *, /): ");
		      op = r.next().charAt(0);
		      r.close();
		      switch(op) {
		         case '+': ans = num1 + num2;
		            break;
		         case '-': ans = num1 - num2;
		            break;
		         case '*': ans = num1 * num2;
		            break;
		         case '/': ans = num1 / num2;
		            break;
		         default:  System.out.printf("Error! Enter correct operator");
		            return;
		      }
		      System.out.print("\nThe result is given as follows:\n");
		      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
		      
		   }

//	}

}
