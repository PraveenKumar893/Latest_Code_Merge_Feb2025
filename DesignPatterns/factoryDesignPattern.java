package DesignPatterns;

interface Os {
	
	public  void spec();
	
}

class Android implements Os {
	public void spec() {
		System.out.println(" Android is Running.......");
	}	
}

class ios implements Os {
	public void spec() {
		System.out.println(" IOS is Running.....");
	}
}

class factoryDesignPatternss {
	
	public Os getInstance(String key) {
		
		if(key.equalsIgnoreCase("ANDROID")) {
			return new Android();
		} else if(key.equalsIgnoreCase("IOS")) {
			return new ios();
		}
		return null;		
	}
	
}
 
public class factoryDesignPattern {

	public static void main(String[] args) {
		factoryDesignPatternss obj = new factoryDesignPatternss();
		Os object = obj.getInstance("IOS");
		object.spec();
	}

}
