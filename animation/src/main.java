import java.util.ArrayList;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		data.add("a");
		data.add("b");
		data.add("c");
		data.add("d");		
		data.add("e");
		
		Cylinder animation = new Cylinder(data);
		animation.display();
		for(int i = 0; i <= 10; i++){
			System.out.println("Before slide Left " + i);
			animation.slideLeft();
			animation.display();
		}
		
		for(int i = 0; i <= 10; i++){
			System.out.println("Before slide Right " + i);
			animation.slideRight();
			animation.display();
		}
	}

}
