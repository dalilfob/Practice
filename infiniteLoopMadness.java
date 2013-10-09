public class Main {

	static int x = 5;
	static int y = 6;
	static int z = 7;
	public static void main(String[] args) {
		
		sub1();
	}
	public static void sub1() {
		int a = 10;
		int y = 11;
		int z = 12;
		sub2();
		System.out.println(a + " " + x + " " + y + " " + z);
		
	}
	
	public static void sub2() {
		int a = 20;
		int x = 21;
		int w = 22;
		sub1();
	}
}
