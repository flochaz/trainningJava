import java.util.List;

public class Cylinder {
	private CircularArray<String> data;	
	
	public Cylinder(List<String> input){
		data = new CircularArray(input.size());
		int i = 0;
		for (String item : input) {
			data.set(i, item);
			i++;
		}
	}
	
	public void slideLeft(){
		data.rotate(1);
	}
	
	public void slideRight(){
		data.rotate(-1);
	}
	
	public void display(){
		String left = data.get(0);
		String center = data.get(1);
		String right = data.get(2);
		String back = data.get(3);
		String result = "| " +left+ " | "+center+" | "+right+"|"+'\n'+"back : "+ back;
		System.out.println(result);
	}
		
}
