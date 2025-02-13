package BinaryTree;

class node {
	node left;
	node right;
	int data ;

	public node(int data) {
		this.data = data;
	}	
}

public class calculateHeightBinaryTree {
	
	node root ;
	
	void inserRecordsTree(int data) {
		root = inserrecursive(root,data);
	}
	
	 node inserrecursive(node root, int data) {
		 if(root == null) {
			 root = new node(data);
		 } else if(root.data > data) {
			 root.left = inserrecursive(root.left, data);
		 } else {
			 root.right = inserrecursive(root.right, data);
		 }
		 return root;
	}
	 
	 void display() {
		 inOrderdisplay(root);
	 }

	 void inOrderdisplay(node root) {
		 
		 if(root != null) {
			 inOrderdisplay(root.left);
			 System.out.print(root.data + " ");
			 inOrderdisplay(root.right);
		 }
	}
	 
	 void calculateHeight() {
	     int height = calculateHeightTree(root);
	     System.out.println(" The Height of the Tree " + height);
	 }

	 int calculateHeightTree(node root) {
		 int height = 0;
		 if(root == null) {
			 return height;
		 } else {
			 int leftTree = calculateHeightTree(root.left);
			 int rightTree = calculateHeightTree(root.right);
			 height = Math.max(leftTree, rightTree)+1;
		 }
		 
		return height;
	}
	 
	 public void searchTreeValues(int data) {
		 int findData = searchTree(root,data);
		 System.out.println(" The Finded Data " + findData);
	 }

	 int searchTree(node root, int data) {
		 int findData = 0;
		 if(root == null || data == 0) {
			 System.out.println(" No record founds ");
		 } else {
			 if(root.data == data) {
				 findData = root.data;
			 } else if(root.data > data) {
				findData = searchTree(root.left,data);
			 } else {
					findData = searchTree(root.right,data); 
			 }
		 }
		return findData;
	}
	 
	 static int calculatefunction(int data) {
		 if(data == 0)
			 return 0;
		return (data%10) + calculatefunction(data/10);	 
	 }

	public static void main(String[] args) {
		
		calculateHeightBinaryTree obj = new calculateHeightBinaryTree();
		obj.inserRecordsTree(8);
		obj.inserRecordsTree(12);
		obj.inserRecordsTree(7);
		obj.inserRecordsTree(15);
		obj.inserRecordsTree(23);
		obj.display();
		obj.calculateHeight();
		obj.searchTreeValues(15);
		int asa = calculatefunction(12345);
		System.out.println(asa);
	}

}
