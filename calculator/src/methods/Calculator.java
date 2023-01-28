package methods;

import java.util.*;
import java.lang.*;
import java.lang.*;
public class Calculator {
	
    public double findAvg(double a, double b, double c) {
    	double sum = a+b+c;
    	double avg = sum/3;
    	return Math.round(avg*100.0)/100.0;
    }
    public double findAvg(double a, double b, double c, double d) {
    	double sum = a+b+c+d;
    	double avg = sum/4;
    	return Math.round(avg*100.0)/100.0;
    }
    public double findAvg(double a, double b, double c, double d, double e) {
    	double sum = a+b+c+d+e;
    	double avg = sum/5;
    	return Math.round(avg*100.0)/100.0;
    }
    
}
