package string;
import java.util.Scanner;
import java.util.scanner;
public class farmer {
	double principle;
	static double rate;
	double time;
	double SimpleInterest;
	static
	{
		rate=2.5;
	}
	void Collectdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount");
		principle=sc.nextDouble();
		System.out.println("enter time in years:");
		time=sc.nextDouble();
	}
	void Calculate()
	{
		SimpleInterest=(principle*time*rate)/100;
	}
	void display()
	{
		System.out.println("the simple interest is:"+SimpleInterest);
	}
}
