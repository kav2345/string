package string;

public class start {
	public static void main(String args[]) {
		dog d=new dog();
		d.setname("rocky");
		d.setcolor("black");
		d.setcost(18000);
		d.setage(7);
		d.setbreed("rotweiler");
		System.out.println(d.getname());
		System.out.println(d.getcolor());
		System.out.println(d.getcost());
		System.out.println(d.getage());
		System.out.println(d.getbreed());
	}
}
