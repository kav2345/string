package string;

class Rectangle {
	import java.util.Scanner; 
	    int length;
	    int breadth;
	    int area;
	        void collectdata(){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter length");
	        length=sc.nextInt();
	        System.out.println("enter breadth");
	        breadth=sc.nextInt();
	    }
	    void calculate(){
	        area=length*breadth;
	    }
	    void display(){
	        System.out.println("area"+area);
	    }
	}
public class sample{
	    public static void main(String args[]){
	        Rectangle r=new Rectangle();
	        r.collectdata();
	        r.calculate();
	        r.display();
	    }
	}

