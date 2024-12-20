package string;

public class begin {
	public static void main(String args[]) {
		car c=new car("civic","red",500000,120,"japan");
		System.out.println(c.getName());
		System.out.println(c.getColor());
		System.out.println(c.getCost());
		System.out.println(c.getTopspeed());
		System.out.println(c.getCountry());
	}
}
