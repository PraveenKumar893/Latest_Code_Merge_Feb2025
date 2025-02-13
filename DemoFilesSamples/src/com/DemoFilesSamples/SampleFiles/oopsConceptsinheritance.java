package com.DemoFilesSamples.SampleFiles;

  class singleinheritance {
	   void vehicleloan() {
			 double loan = 1440000;
			 System.out.println(loan);
		  }
}

 class multilevelInheritance extends singleinheritance  {
	
	void emiamount() {
		System.out.println(12565);
	}
}	
class multilevelinhertancepart extends multilevelInheritance {
	void insuredAmount() {
		emiamount();
		vehicleloan();
		System.out.println(8900);
	}
}

public class oopsConceptsinheritance extends multilevelinhertancepart {
	
	   
	public static void main(String[] args) {
		oopsConceptsinheritance mkl = new oopsConceptsinheritance();
		mkl.insuredAmount();
	}

}
