package javaConcepts;

public class Methods {

	public static void main() {
	   Methods m = new Methods();
add();
	   int z= m.add2(1,3);
	   System.out.println(z);
	
	}
	public static void add(){
		int x= 5;
		int y=7;
		System.out.println(x+y);
	}
	public int add2(int z, int b) {
		int a = 0;
		return a+b;
		
	}
}
