public class HelloWorld {

	private int nummer;

	public static void main(String[] args) {
		
		int testwert = 5;
		
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		
		if (testwert < 8) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
			
		

	

	}

	private boolean test(int nummer) {

		if (nummer > 5)
			return false;

		else
			return true;
	}

}
