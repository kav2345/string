package string;

public class parent {
	parent(){
		super();
		System.out.println("inside parent constructor");
	}
}
class child extends parent{
	child(){
		System.out.println("inside child constructor");
	}
}