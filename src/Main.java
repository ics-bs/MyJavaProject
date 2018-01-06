
public class Main {

	public static void main(String[] args) {
		
		Add add = new Add();
		Subtract subtract = new Subtract();
		
		int x = add.add(20, 10);
		int y = subtract.subtract(20, 10);
		
		System.out.println(x);
		System.out.println(y);
	}

}
