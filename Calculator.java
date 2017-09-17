import java.lang.Math;
import java.util.*;
interface sample{
	void multiply(int a,int b);
	void divide(double a,double b);
	void add(int a,int b);
	void subtract(int a,int b);
	void min(int a,int b);
	void max(int a,int b);
	void sine(int a);
	void cosine(int a);
}
public class Calculator {
	public static void main(String args[])
	{
		Calculator cal=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two nos:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		cal.multiply(a, b);
		cal.divide(a, b);
		cal.add(a, b);
		cal.subtract(a, b);
		cal.min(a, b);
		cal.max(a, b);
		cal.sine(a);
		cal.cosine(b);		
	}
	void multiply(int a,int b)
	{
		System.out.println("multiplication of two nos: "+ a*b);
	}
	void divide(double a,double b)
	{
		double c=a/b;
		System.out.println("division of two nos: "+ c);
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of two nos: "+ c);
	}
	void subtract(int a,int b)
	{
		int c=a-b;
		System.out.println("subtraction of two nos: "+ c);
	}
	void min(int a,int b)
	{
		int minimum=a<b?a:b;
		System.out.println("minimum of two nos: "+ minimum);
	}
	void max(int a,int b)
	{
		int maximum=a>b?a:b;
		System.out.println("maximum of two nos: "+ maximum);
	}
	void sine(int a){
		System.out.println("sin of a no: "+ Math.sin(a));
	}
	void cosine(int a)
	{
		System.out.println("cosine of a no: "+ Math.cos(a));
	}
}
