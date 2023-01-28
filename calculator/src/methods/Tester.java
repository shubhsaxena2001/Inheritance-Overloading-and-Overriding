package methods;
import java.util.*;
import java.lang.*;
public class Tester {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int count = Sc.nextInt();
        
        Calculator calc = new Calculator();
        
        
        if(count == 3) {
        	System.out.println("Enter number 1: ");
        	double a= Sc.nextDouble();
        	System.out.println("Enter number 2: ");
        	double b= Sc.nextDouble();
        	System.out.println("Enter number 3: ");
        	double c= Sc.nextDouble();
        	
        	System.out.println("The average is " + calc.findAvg(a,b,c));
        }
        
        else if(count == 4) {
        	System.out.println("Enter number 1: ");
        	double a= Sc.nextDouble();
        	System.out.println("Enter number 2: ");
        	double b= Sc.nextDouble();
        	System.out.println("Enter number 3: ");
        	double c= Sc.nextDouble();
        	System.out.println("Enter number 4: ");
        	double d= Sc.nextDouble();
        	
        	System.out.println("The average is " + calc.findAvg(a,b,c,d));
        }
        
        else if(count == 5) {
        	System.out.println("Enter number 1: ");
        	double a= Sc.nextDouble();
        	System.out.println("Enter number 2: ");
        	double b= Sc.nextDouble();
        	System.out.println("Enter number 3: ");
        	double c= Sc.nextDouble();
        	System.out.println("Enter number 4: ");
        	double d= Sc.nextDouble();
        	System.out.println("Enter number 5: ");
        	double e= Sc.nextDouble();
        	
        	System.out.println("The average is " + calc.findAvg(a,b,c,d,e));
        }
        
        else System.out.println("The number of elements must be only 3, 4 or 5.");
        
    }
}
