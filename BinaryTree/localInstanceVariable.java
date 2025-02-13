package BinaryTree;

public class localInstanceVariable {
	
	// instance Variables
	private int values ;
	
	public localInstanceVariable(int values) {
		this.values = values;
		System.out.println(this.values);
	}
	
	// instances Methods
	
	public int add(int values) {
		return this.values+values;
	}
		
	public static void main(String[] args) {
		
		localInstanceVariable obj = new localInstanceVariable(20);
		System.out.println(obj.add(10));
		obj.values = 45;
		System.out.println(obj.add(10));
	}

}
