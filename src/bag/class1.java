package bag;

public class class1 {

	public static void main(String[] args) {
		
		class1 clothe = new class1();
		clothe.milk(500);
		class1.oil(10, 20);
		clothe.water(500, 500.50, " This is My value with initial ", 'n');
		clothe.mind("Nazeefah ", 'R', " Laiba");
	
	}
public void milk(int a) {
System.out.println(a);	
	
}
public static void oil(int a, int b) {
	int c = a*b;
	System.out.println(c);
		
}
	
public void water(int a, double b, String c,char d) {
System.out.println(a+b+c+d);
		
}	
public void mind(String a,char b,String c) {
System.out.println(a+b+c);	
		
}	
	
	
}
