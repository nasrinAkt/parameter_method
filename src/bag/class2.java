package bag;

public class class2 {

	public static void main(String[] args) {
		class2 cake = new class2();
		cake.muffin(50.99, 49.01);
		class2.rice(5.5, 6.5, 7.5);
		cake.oil("My salary is ", 100000.50);
		class2.light("My salary is ", 100000, 20000.5," dollars only." );
		cake.key(500, 500.99, " Nasrin Akter ", 'n');
		
	}
public void muffin(double a, double b) {
double c = a+b;
System.out.println(c);
}
public static void rice(double a, double b, double c) {
double d = a+b+c;
System.out.println(d);
}	
public void oil(String a, double b) {
System.out.println(a+b+" dollars only.");	
	
}	
public static void light(String a, int b, double c,String d) {
System.out.println(a+(b+c)+d);
	
	
}	
public void key(int a, double b,String c,char d) {
System.out.println(a+b+c+d);
	
}



}
