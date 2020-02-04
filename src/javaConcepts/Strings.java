package javaConcepts;

public class Strings {
public static void main(String[] args) {
	/*String Course = "Java";
//	String Course1 = "selenium";
//	System.out.println(Course.length());
//	System.out.println(Course.toUpperCase());
//	//Course = Course.toUpperCase();
//	System.out.println(Course);
//	System.out.println(Course.concat(Course1));
//	
//	
//	
//
//	a[0]=10;
//	a[2]=50;
//	a[1]=70;
//	for(int i= 0; i<a.length; i++)
//	{
//		System.out.println(a[i]);
//	}*/
//	
	
	Object a[][] = new Object[3][2];
	a[0][0] ="12";
	a[0][1]="bindu";
	a[1][0]="selenium";
	a[1][1]="developer";
	a[2][0]="345";
	a[2][1]="12";
	
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[0].length;j++){
			System.out.println(a[i][j]);
		}
	}
	
}
}
